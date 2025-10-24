class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        // Count frequencies of each word
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Convert map entries to list
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort by frequency (descending) and then by lexicographical order (ascending)
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Map.Entry<String, Integer> e1 = list.get(i);
                Map.Entry<String, Integer> e2 = list.get(j);

                if (e2.getValue() > e1.getValue() ||
                        (e2.getValue().equals(e1.getValue()) && e2.getKey().compareTo(e1.getKey()) < 0)) {
                    list.set(i, e2);
                    list.set(j, e1);
                }
            }
        }

        // Collect top k words
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }

        return result;
    }
}

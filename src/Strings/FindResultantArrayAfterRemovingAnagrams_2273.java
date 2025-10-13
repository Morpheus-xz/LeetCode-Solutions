class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        String[] ana = new String[n];

        for (int i = 0; i < n; i++) {
            char[] arr = words[i].toCharArray();
            Arrays.sort(arr);
            ana[i] = new String(arr);
        }

        List<String> ans = new ArrayList<>();
        ans.add(words[0]);

        for (int i = 1; i < n; i++) {
            if (!ana[i - 1].equals(ana[i])) {
                ans.add(words[i]);
            }
        }

        return ans;
    }
}
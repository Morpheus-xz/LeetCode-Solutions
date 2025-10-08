class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions); //sort portions array to apply binary search

        int n = potions.length;
        int[] ans = new int[spells.length];

        for (int i = 0; i < spells.length; i++) { // for each element in spell array we need to do calculatioin by multiplying

            int low = 0, high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ((long) spells[i] * potions[mid] >= success) // checking for the middle most element of the portion array to apply binary search

                    high = mid - 1;
                else

                    low = mid + 1;
            }

            ans[i] = n - low; // adding ans to the ans array declared above
        }

        return ans;
    }
}
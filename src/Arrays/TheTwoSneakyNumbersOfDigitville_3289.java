class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int[] freq = new int[101];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<101;i++){
            if(freq[i]==2){
                list.add(i);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;

    }
}
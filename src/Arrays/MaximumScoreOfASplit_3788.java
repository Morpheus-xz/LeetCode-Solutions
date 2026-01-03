class Solution {
    public long maximumScore(int[] nums) {
        long sum =0;
        for(int ele:nums){
            sum+=ele;
        }
        int n = nums.length;
        long ans = Long.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=n-1;i>=1;i--){
            sum-=nums[i];
            min=Math.min(min,nums[i]);
            ans=Math.max(ans,sum-min);
        }
        return ans;
    }
}
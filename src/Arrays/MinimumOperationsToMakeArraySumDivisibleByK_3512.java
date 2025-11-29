class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int ele:nums){
            sum+=ele;
        }
        return sum%k;
    }
}
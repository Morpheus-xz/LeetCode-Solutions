class Solution {
    public int[] plusOne(int[] nums) {
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<9){
                nums[i]++;
                return nums;
            }else{
                nums[i]=0;}
        }
        int[] digit = new int[n+1];
        digit[0]=1;
        return digit;

    }
}
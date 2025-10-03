class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int smax = Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            int n=nums[i];
            if(nums[i]<smax) return true;
            while(!st.isEmpty() && nums[i]>st.peek()){
                smax=st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}
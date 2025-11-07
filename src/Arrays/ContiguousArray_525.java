class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        int sum = 0;
        int length=0;
        for(int i=0;i<n;i++){
            sum+=nums[i]==0?-1:1;
            if(sum==0){
                length=i+1;
            }
            else if(mp.containsKey(sum)){
                length = Math.max(length,i-mp.get(sum));
            } else{
                mp.put(sum,i);
            }
        }
        return length;
    }
}
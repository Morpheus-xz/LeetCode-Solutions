class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subr(nums,k)-subr(nums,k-1);

    }
    public int subr(int[] nums,int k){
        HashMap <Integer,Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int cnt = 0;
        while(r<nums.length){
            if(map.containsKey(nums[r])){
                int freq = map.get(nums[r]);
                map.put(nums[r],freq+1);
            }
            else{
                map.put(nums[r],1);
            }
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            cnt += r-l+1;
            r++;
        }
        return cnt;
    }
}
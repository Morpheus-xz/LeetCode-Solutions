class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findFirst(nums,target);
        int last=findLast(nums,target);
        return new int[] {first,last};
    }
    private int findFirst(int[] nums,int target){
        int index=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]>=target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            if(nums[mid]==target)index=mid;
        }
        return index;
    }
    private int findLast(int[] nums,int target){
        int index=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            if(nums[mid]==target)index=mid;
        }
        return index;
    }
}
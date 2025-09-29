import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int k=0;
        int[] ans=new int[m+n];
        for(int i=0;i<m;i++){
            ans[k++]=nums1[i];
        }for(int i=0;i<n;i++){
            ans[k++]=nums2[i];
        }
        Arrays.sort(ans);
        if(k%2==0){
            return (ans[k/2 -1]+ans[k/2])/2.0;
        }
        else{
            return (ans[(k)/2]);}
    }
}
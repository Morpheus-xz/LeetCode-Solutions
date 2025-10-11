// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int k=0;
//         for(int i=0;i<m;i++){

//             nums1[k++]=nums1[i];


//         }
//         for(int i=0;i<n;i++){

//             nums1[k++]=nums2[i];

//         }
//         for(int i=0;i<n-1+m;i++){
//             for(int j=0;j<n-1-i+m;j++){
//                 if(nums1[j]>=nums1[j+1]){
//                     int temp=nums1[j];
//                     nums1[j]=nums1[j+1];
//                     nums1[j+1]=temp;
//                 }
//             }
//         }



//     }
// }
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int p = m-1;
        int q = n-1;
        int r = m+n-1;
        while(q>=0){
            if(p>=0 && nums1[p]>nums2[q]){
                nums1[r--]=nums1[p--];
            }
            else{
                nums1[r--]=nums2[q--];
            }
        }

    }
}
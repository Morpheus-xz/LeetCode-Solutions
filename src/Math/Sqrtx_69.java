class Solution {
    public int mySqrt(int x) {
        long strt = 1;
        long end= x;
        int ans=0;
        while(strt<=end){
            long mid = strt +(end-strt)/2;
            if(mid*mid==x){
                ans=(int)mid;
                return ans;
            }
            else if(mid*mid<x){
                strt=mid+1;
                ans = (int) mid;
            }
            else{
                end=mid-1;
            }
        }
        return (int)ans;
    }
}
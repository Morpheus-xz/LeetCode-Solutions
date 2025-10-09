class Solution {
    public boolean isPalindrome(int x) {
        int original=x;int rem=0;int rev=0;
        if(x<0){
            return false;
        } else{
            while(x!=0){
                rem=x%10;
                rev=rev*10+rem;
                x/=10;
            }
            return original==rev;
        }
    }
}
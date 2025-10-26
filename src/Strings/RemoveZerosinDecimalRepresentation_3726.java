class Solution {
    public long removeZeros(long n) {
        String s = String.valueOf(n);   // Convert number to string
        s = s.replace("0", "");         // Remove all zeros
        return Long.parseLong(s);
    }
}
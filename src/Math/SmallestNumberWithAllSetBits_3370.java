class Solution {
    public int smallestNumber(int n) {
// just done by observing a pattern in the sample test cases
// the output is in the form of 2^n -1 so it is clear it can e done by this
// probelme is of finding the correct value of n that is where the catch is
// n which we want is no of digits in binary of given digit n

        List<Integer> ans = new ArrayList<>(); // Arraylist to store the the digits to finally get it into 2 power


// finding binary and adding individual digit
        while (n > 0) {
            int bit = n % 2;
            ans.add(bit);
            n /= 2;
        }

// answer ------
        return (int)(Math.pow(2,ans.size())-1);


    }
}
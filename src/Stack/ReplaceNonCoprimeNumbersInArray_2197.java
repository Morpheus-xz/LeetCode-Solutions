class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        // Intially I created a stack without looking upto the return type so it took my time after solving and writing whole code
        List<Integer> st = new ArrayList<>();
        for(int x:nums){ // For each loop to significantly access and roam in the given array
            int curr = x;
            while(!st.isEmpty()){
                int g = gcd(st.get(st.size()-1),curr); //to check if the adjacent number are non-coprime
                if(g==1) break;
                curr = lcm(st.get(st.size()-1),curr); // if they are non coprime get their lcm and pop untill it works
                st.remove(st.size()-1);
            }
            st.add(curr); // add the curr after the while loop gets a no non-coprime number
        }
        return st;
    }
    private int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    private int lcm(int a,int b){
        return (a/gcd(a,b))*b;
    }
}
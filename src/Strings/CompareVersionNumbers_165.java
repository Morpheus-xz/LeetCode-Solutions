class Solution {
    public int compareVersion(String version1, String version2) {
        int l1 = version1.length();
        int l2 = version2.length();
        int i=0,j=0;
        while(i<l1 || j<l2){
            int num = 0;
            while(i<l1 && version1.charAt(i)!='.'){
                num=num*10+(version1.charAt(i)-'0');
                i++;
            }
            int num2 = 0;
            while(j<l2 && version2.charAt(j)!='.'){
                num2 = num2*10+(version2.charAt(j)-'0');
                j++;
            }
            if(num!=num2){
                return (num>num2)?1:-1;
            }
            i++;
            j++;
        }
        return 0;
    }
}
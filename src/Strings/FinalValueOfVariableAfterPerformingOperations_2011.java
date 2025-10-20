class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String c:operations){
            if(c.equals("--X")||c.equals("X--"))x--;
            else x++;
        }
        return x;
    }
}
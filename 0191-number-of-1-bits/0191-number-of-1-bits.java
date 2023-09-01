public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        String binary=Integer.toBinaryString(n);
        
        for(char ch:binary.toCharArray()){
            if(ch=='1'){
                count++;
            }
        }
        
        return count;
    }
}
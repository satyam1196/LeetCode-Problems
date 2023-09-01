public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
//         String binary=Integer.toBinaryString(n);
        
//         for(char ch:binary.toCharArray()){
//             if(ch=='1'){
//                 count++;
//             }
//         }
        
//         return count;
        
//         int helper=1;
//         for(int i=1;i<=32;i++){
//             if((helper & n)!=0){
//                 count++;
//             }
            
//             helper=helper<<1;
//         }
        
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        
        return count;
    }
}
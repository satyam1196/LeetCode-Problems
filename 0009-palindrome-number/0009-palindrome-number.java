class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long ans=0;
        int y=x;
        while(x!=0){
            ans*=10;
            ans+=(x%10);
            x/=10;
        }
        
        
        return ans==y;
    }
}
class Solution {
    public boolean isPalindrome(String str) {
         String s=str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        return isPali(s,0);
        
    }
        public static boolean isPali(String s,int i){
        int n=s.length();
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        
        return isPali(s,i+1);
    }
}
class Solution {
    public boolean repeatedSubstringPattern(String s) {
         int n=s.length();
        for(int i=1;i<n;i++){
            String sub=s.substring(0,i);
            String newSub="";
            int count=n/sub.length();
            int k=0;
            while (k<count){
                newSub=newSub.concat(sub);
                k++;
            }
            if(s.equals(newSub))
                return true;
        }

        return false;
    }
} 
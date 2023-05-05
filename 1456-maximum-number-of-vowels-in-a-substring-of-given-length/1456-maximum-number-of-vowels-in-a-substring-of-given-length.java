class Solution {
    public int maxVowels(String s, int k) {
        int curr_vow=0,max_vow=0;
        for(int i=0;i<s.length();i++){
            curr_vow+=isVowel(s.charAt(i));
            if(i>=k){
                curr_vow-=isVowel(s.charAt(i-k));
            }
            max_vow=Math.max(max_vow,curr_vow);
        }

        return max_vow;
    }

    public int isVowel(char ch){
        return (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')?1:0;
    }
}
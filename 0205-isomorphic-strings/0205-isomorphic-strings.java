class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mp1=new HashMap<>();
        Map<Character,Character> mp2=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     if(map1.containsKey(s.charAt(i))){
        //         if(map1.get(s.charAt(i))!=t.charAt(i)){
        //             return false;
        //         }
        //     }
        //     else{
        //         map1.put(s.charAt(i),t.charAt(i));
        //     }
        //     if(map2.containsKey(t.charAt(i))){
        //         if(map2.get(t.charAt(i))!=s.charAt(i)){
        //             return false;
        //         }
        //     }
        //     else{
        //         map2.put(t.charAt(i),s.charAt(i));
        //     }
        // }
         for(int i = 0; i < s.length(); i++) {
            
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if((mp1.containsKey(ch1) && mp1.get(ch1) != ch2) || 
               (mp2.containsKey(ch2) && mp2.get(ch2) != ch1)) {
                return false;
            }
            
            mp1.put(ch1, ch2);
            mp2.put(ch2, ch1);
        }
        return true;
    }
}
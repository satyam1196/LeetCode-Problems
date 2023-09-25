class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(char ch:t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            }
            else
                return ch;
        }
        
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()<0){
                return entry.getKey();
            }
        }
        return 0;
    }
}
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        PriorityQueue<Map.Entry<Character,Integer>> q=new PriorityQueue<>(
            (a,b)-> b.getValue()-a.getValue()
        );
        
        q.addAll(map.entrySet());
        
        StringBuilder sb=new StringBuilder();
        while(!q.isEmpty()){
            Map.Entry<Character,Integer> entry=q.poll();
            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        
        return sb.toString();
    }
}
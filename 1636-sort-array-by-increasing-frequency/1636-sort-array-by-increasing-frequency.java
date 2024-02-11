class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        Collections.sort(list,(a,b)->
            (map.get(a)==map.get(b))?b-a:map.get(a)-map.get(b)
                        );
        
        return list.stream().mapToInt(i->i).toArray();
    }
}
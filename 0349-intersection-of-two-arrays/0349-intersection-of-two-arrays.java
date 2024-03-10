class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> result=new ArrayList<>();

        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int num:nums2){
            if(map.containsKey(num)){
                result.add(num);
                map.remove(num);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();

    }
}
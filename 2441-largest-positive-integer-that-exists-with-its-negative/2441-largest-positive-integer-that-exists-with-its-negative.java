class Solution {
    public int findMaxK(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=-1;
        
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int num:nums){
            if(num>max && map.containsKey(-num)){
                max=num;
            }
        }
        
        return max;
    }
}
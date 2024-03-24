class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int num:nums){
            if(map.containsKey(num)){
                return num;
            }
            else
                map.put(num,map.getOrDefault(num,0)+1);
        }
         return 0;
    }
   
}
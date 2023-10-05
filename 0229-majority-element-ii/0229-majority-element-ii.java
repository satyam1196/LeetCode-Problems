class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        
        double tar=Math.floor(n/3);
        
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>tar && !ans.contains(num)){
                ans.add(num);
            }
        }
        
        return ans;
    }
}
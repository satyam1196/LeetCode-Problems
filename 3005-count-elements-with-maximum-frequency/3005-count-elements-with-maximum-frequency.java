class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        int max=Integer.MIN_VALUE;
        int result=0;
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                result=0;
                result+=entry.getValue();
            }
            else if(entry.getValue()==max){
                result+=entry.getValue();
            }
        }
        
        return result;
    }
}
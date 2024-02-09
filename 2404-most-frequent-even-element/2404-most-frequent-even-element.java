class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int result=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;;
        for(int num:nums){
            if(num%2==0){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        if(map.size()==0){
            return -1;
        }
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                result=entry.getKey();
                
            }
            else if(entry.getValue()==max){
                result=Math.min(result,entry.getKey());
            }

        }
        
        return result;
    }
}
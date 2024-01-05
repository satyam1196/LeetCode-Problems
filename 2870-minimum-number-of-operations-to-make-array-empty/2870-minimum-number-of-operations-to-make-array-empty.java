class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res=0;
        int size=nums.length;

        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            int count=entry.getValue();
            if(count<2){
                return -1;
            }
            if(count==2 || count==4){
                res+=count/2;
                size-=count;
            }
            else if(count%3==0){
                int div=count/3;
                res+=div;
                size-=count;
            }
            else if (count%3==1 || count%3==2){
                int div=count/3;
                res+=div+1;
                size-=count;

            }

        }
        
        if(size==0){
            return res;
        }

        else return -1;

    }
}
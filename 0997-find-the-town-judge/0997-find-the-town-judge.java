class Solution {
    public int findJudge(int n, int[][] trust) {
        
        //not working
//         Set<Integer> set=new HashSet<>();
//         for(int i=0;i<trust.length;i++){
//             set.add(trust[i][0]);
//         }
        
//         for(int i=1;i<=n;i++){
//             if(!set.contains(i)){
//                 return i;
//             }
//         }
        
//         return -1;
        
        int[] count=new int[n+1];
        
        for(int[] nums:trust){
            count[nums[0]]--;
            count[nums[1]]++;
        }
        
        for(int i=1;i<=n;i++){
            if(count[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}
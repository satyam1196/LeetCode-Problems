class Solution {
    public int numSubseq(int[] nums, int target) {
        int ans=0;
        Arrays.sort(nums);
        int s=0,e=nums.length;
        int[] p=new int[e];
        p[0]=1;
        for(int i=1;i<e;i++)
            p[i]=(p[i-1]*2)%1000000007;
            e--;
        while(s<=e){
            if(nums[s]+nums[e]<=target){
                ans+=p[e-s];
                ans%=1000000007;
                s++;
            }
            else
                e--;
        }
        
        return ans;
    }
    
}
class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        // int sum=0;
        // int count=1;
        // int n=nums.length;
        int max=nums[nums.length-1];
        int ans=max;
        
        // while(count<=k){
        //     int value=nums[n-1];
        //     nums[n-1]=value+1;
        //     sum+=value;
        //     count++;
        // }
        
        for(int i=1;i<k;i++){
            ans+=(max+i);
        }
        return ans;
    }
}
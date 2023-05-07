class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(nums[0]);
        int length=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>ans.get(ans.size()-1)){
                ans.add(nums[i]);
                length++;
            }
            else{
                int index=binarySearch(ans,nums[i]);
                ans.set(index,nums[i]);
            }
        }
        return length;
    }
    
    public int binarySearch(ArrayList<Integer> ans,int num){
        int s=0;
        int e=ans.size()-1;
        while(s<=e){
           int mid=(s)+(e-s)/2;
            if(ans.get(mid)==num){
                return mid;
            }
            else if(ans.get(mid)>num){
                e=mid-1;
            }
            else
                s=mid+1;
        }
        return e+1;
        
    }
}
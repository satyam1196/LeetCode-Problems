class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2+1];
        int[] neg=new int[n/2+1];
        
        int x=0;
        int y=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[x]=nums[i];
                x++;
            }
            else{
                neg[y]=nums[i];
                y++;
            }
        }
        int m=0;
        int k=0;
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=pos[m];
                m++;
            }
            else{
                nums[i]=neg[k];
                k++;
            }
        }
        
        return nums;
    }
}
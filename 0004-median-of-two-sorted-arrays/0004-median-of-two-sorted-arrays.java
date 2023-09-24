class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int j=0,k=0;
        int[] ans=new int[nums1.length+nums2.length];
        int n=nums1.length;
        int m=nums2.length;

        for(int i=0;i<ans.length;i++){
            if((j<n && k<m) && nums1[j]<nums2[k]){
                ans[i]=nums1[j];
                j++;
            }
            else if(j<n && k<m && nums1[j]>=nums2[k]){
                ans[i]=nums2[k];
                k++;
            }
            else if(j==n){
                ans[i]=nums2[k];
                k++;
            }
            else if(k==m){
                ans[i]=nums1[j];
                j++;
            }
        }

        if(ans.length%2==0){
            return (double) (ans[ans.length / 2-1] + ans[ans.length / 2]) /2;
        }
        else
            return ans[ans.length/2];
    }
}
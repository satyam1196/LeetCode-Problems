class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int ans=0;
        int ans2=0;
        while(num!=0){
            ans=ans*10 + (num%10);
            num/=10;
        }
        while(ans!=0){
            ans2=ans2*10+(ans%10);
            ans/=10;
        }
        
        return ans2==temp;
    }
}
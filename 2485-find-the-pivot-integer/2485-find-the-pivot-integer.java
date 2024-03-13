class Solution {
    public int pivotInteger(int n) {
        int total=n*(n+1)/2;
        double num=Math.sqrt(total);
        
        if(num-Math.ceil(num)==0)
            return (int) num;
        else
            return -1;
    }
}
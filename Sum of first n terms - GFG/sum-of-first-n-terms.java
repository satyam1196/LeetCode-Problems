//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    long sumOfSeries(long N) {
        // long sum=0;
        // for(long i=1;i<=N;i++){
        //     sum+=i*i*i;
        // }
        // return sum;
        


        long sum=N*N*N;
        if(N<1){
            return sum;
        }
        
        sum+=sumOfSeries(N-1);
        
        return sum;
    }
}
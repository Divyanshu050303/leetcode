//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String read[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(read[0]);
            int r = Integer.parseInt(read[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nCr(n, r));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
 static int nCr(int n, int r)
    {
      if(r>n) return 0;
      if((n-r)<r ) r=n-r;
      int mod=1000000007;
      int dp[]=new int[r+1];
      dp[0]=1;
      for(int i=1;i<=n;i++){
          for(int j=r;j>0;j--){
              dp[j]=(dp[j]+dp[j-1])%mod;
          }
      }
      return dp[r];
}
}
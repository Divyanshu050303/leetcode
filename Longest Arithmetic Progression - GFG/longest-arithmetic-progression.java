//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().lengthOfLongestAP(a, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    int lengthOfLongestAP(int[] nums, int n) {
          if(nums.length<=2){
            return n;
        }
        int ans=0;
         HashMap<Integer, Integer>dp[]=new HashMap[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=new HashMap<>();
        }
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                int diff=nums[i]-nums[j];
                int c=dp[j].getOrDefault(diff,1);
                ans=Math.max(c+1,ans);
                dp[i].put(diff,c+1);
            }
        }
        return ans;
    }
}

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String s){
        int l,h;
        String ss="";
        int start=0,end=1;
        for(int i=1;i<s.length();i++){
            l=i-1;
            h=i;
            while(l>=0 && h<s.length() && s.charAt(l)==s.charAt(h)){
                if(h-l+1>end){
                    start=l;
                    end=h-l+1;
                }
                l--;
                h++;
                
            }
            l=i-1;
            h=i+1;
            while(l>=0 && h<s.length() && s.charAt(l)==s.charAt(h)){
                if(h-l+1>end){
                    start=l;
                    end=h-l+1;
                }
                l--;
                h++;
                
            }
        }
        for(int i=start;i<=start+end-1;i++){
            ss+=s.charAt(i)+"";
        }
        return ss;
        
    }
}
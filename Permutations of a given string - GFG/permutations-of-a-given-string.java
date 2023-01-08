//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}


// } Driver Code Ends


class Solution {
    private void solve(char[] s, List<String> arr, int index){
        if(index>=s.length){
            String t="";
            for(char c:s){
                t+=c+"";
            }
            if(!arr.contains(t)){
                
            arr.add(t);
            }

            return;
        }
        for(int i=index;i<s.length;i++){
            swap(s, index, i);
            
            solve(s, arr, index+1);
            swap(s, index, i);
            
        }
    }
    public void swap(char []s , int index, int i){
        char t=s[index];
        s[index]=s[i];
        s[i]=t;
    }
    public List<String> find_permutation(String S) {
        List<String> array=new ArrayList<>();
        char []a=S.toCharArray();
         
        solve(a, array, 0);
        Collections.sort(array);
        return array;
    }
    
   
}
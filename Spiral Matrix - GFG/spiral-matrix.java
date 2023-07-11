//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   
	public int findK(int m[][], int n, int m1, int k)
	{
	      int row=m.length;
        int col=m[0].length;
        int top=0;
        int bottom=row-1;
        int left=0;
        int right=col-1;
        int dic=1;
        List<Integer> result=new ArrayList<>();
        while(top<=bottom && left<=right){
            if(dic==1){
                for(int i=left ;i<=right;i++){
                    result.add(m[top][i]);
                }
                top++;
                dic=2;
            }
            else if(dic==2){
                for(int i=top;i<=bottom;i++){
                    result.add(m[i][right]);
                }
                right--;
                dic=3;
            }
            else if(dic==3){
                for(int i=right;i>=left;i--){
                    result.add(m[bottom][i]);
                }
                bottom--;
                dic=4;
            }
            else{
                for(int i=bottom;i>=top;i--){
                    result.add(m[i][left]);
                }
                left++;
                dic=1;
            }  
        }
        return result.get(k-1); 
	}
	
}
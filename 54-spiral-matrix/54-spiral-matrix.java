class Solution {
    public List<Integer> spiralOrder(int[][] m) {
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
        return result;
        
    }
}
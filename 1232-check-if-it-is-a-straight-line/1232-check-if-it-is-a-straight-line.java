class Solution {
    public boolean checkStraightLine(int[][] co) {
        if(co.length==2){
            return true;
        }
        int dx=(co[1][1]-co[0][1]);
        int dy=(co[1][0]-co[0][0]);
        for(int i=2;i<co.length;i++){
            if(dx*(co[i][0]-co[1][0])!=dy*(co[i][1]-co[1][1])){
                return false;
            }
        }
        return true;
        
    }
}
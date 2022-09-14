class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int pos=-1;
        int total=0;
        int current=0;
        for(int i=0;i<gas.length;i++){
            int deff=gas[i]-cost[i];
            current+=deff;
            total+=deff;
            if(current<0){
                current=0;
                pos=i;
            }
        }
        if(total>=0){
            return pos+1;
        }
        return -1;
    }
}
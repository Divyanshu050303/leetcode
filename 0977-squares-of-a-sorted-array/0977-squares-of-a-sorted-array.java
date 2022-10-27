class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int []time=new int[n];
        int i=0, j=n-1;
        for(int t=n-1;t>=0;t--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                time[t]=nums[i]*nums[i];
                i++;
            }
            else{
                time[t]=nums[j]*nums[j];
                j--;
            }
        }
        return time;
        
    }
}
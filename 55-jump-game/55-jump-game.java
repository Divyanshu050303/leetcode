class Solution {
    public boolean canJump(int[] nums) {
         if(nums.length==1){
            return true;
        }
        int last=0;;
        for(int i=0; i<nums.length-1 && last>=i;i++){
            if(last<nums[i]+i){
                last=i+nums[i];
            }
            if(last>=nums.length-1){
                return true;
            }
        }
        return false;
        
    }
}
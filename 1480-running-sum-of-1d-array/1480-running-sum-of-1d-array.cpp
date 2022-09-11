class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        
        int a = nums.size();
        int b=0;
        
        for(int i=1;i<a;i++)
        {
            nums[i]=nums[i]+nums[i-1];
            // b=b+nums[i];
            // nums[i]=b;
        }
        return nums;
    }      
};
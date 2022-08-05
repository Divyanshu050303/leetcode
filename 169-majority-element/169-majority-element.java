class Solution {
    public int majorityElement(int[] nums) {
        int []arr=new int [50001];
        Arrays.fill(arr, 0);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[nums[i]]++;
            }
        }
        int a=0;
        int max=0;
        for(int i=0;i<50001;i++){
            if(max<arr[i]){
                max=arr[i];
                a=i;
            }
        }
        
        return a;
    }
}
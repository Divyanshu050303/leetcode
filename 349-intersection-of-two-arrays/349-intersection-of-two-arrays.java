class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>  array=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !array.contains(nums1[i])){
                    array.add(nums1[i]);
                }
            }
        }
        int []arr=new int[array.size()];
        for(int i=0 ;i< array.size();i++){
            arr[i]=array.get(i);
        }
        
         
        return arr;
        
    }
}
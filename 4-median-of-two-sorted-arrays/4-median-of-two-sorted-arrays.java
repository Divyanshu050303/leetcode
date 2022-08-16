class Solution {
     public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int j : nums1) {
            arrayList.add(j);
        }
        for (int j : nums2) {
            arrayList.add(j);
        }
        Collections.sort(arrayList);
        int arrayLength=arrayList.size();
        if(arrayList.size()%2!=0){
            return arrayList.get(arrayLength/2);
        }
        else{
            double time=arrayList.get((arrayLength-1)/2)+arrayList.get((arrayLength+1)/2);
            return time/2;
        }
    }
}
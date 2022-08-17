class Solution {
    public void sortColors(int[] a) {
      int low=0, mid=0,high=a.length-1;

        while(mid<=high){
            if(a[mid]==0){
                swap(a, mid, low);
                low++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
             swap(a, mid, high);
                high--;
            }
        }
       
        }
     private void swap(int []a, int low, int high){
             int temp=a[low];
                a[low]=a[high];
                a[high]=temp; 
    }
}
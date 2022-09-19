class Solution {
    public boolean isHappy(int n)
    {
         ArrayList<Integer>arr=new ArrayList<>();
        
        while(n!=1){
            int rem=n;
            n=0;
        while(rem>0){
            n=n+(int)Math.pow((rem%10), 2);
            rem=rem/10;
           
            
        }
             if(arr.contains(n)){
                return false;
            }
            arr.add(n);
        }
        return true;
    }
}
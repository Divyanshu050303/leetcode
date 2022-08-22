class Solution {
    public boolean isPowerOfFour(int n) {
         while (n>1 && n%4==0){
            n/=4;
        }
    
        if(n==1.0){
            return true;
        }
    
        return false;
        
    }
}
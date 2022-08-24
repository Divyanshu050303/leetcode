class Solution {
    public boolean isPowerOfThree(int n) {
         while (n>1 && n%3==0){
            n/=3;       }
    
        if(n==1.0){
            return true;
        }
    
        return false;
        
    }
}
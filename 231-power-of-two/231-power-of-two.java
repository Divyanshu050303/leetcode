class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)return false;
         
//          while (n>1 && n%2==0){
//             n/=2;
//         }
    
//        return n==1.0;
        long x=(long)n;
        return (x & (x-1))==0;
    }
}
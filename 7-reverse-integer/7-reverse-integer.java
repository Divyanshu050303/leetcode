class Solution {
    public int reverse(int x) {
      
        long rem=0;
        while(x!=0){
            
            rem=rem*10+x%10;
             if (rem >= Integer.MAX_VALUE||rem <= Integer.MIN_VALUE ) 
                 return 0;
             // if (rem < Integer.MIN_VALUE || (rem == Integer.MIN_VALUE))
             //    return 0;
           
            x/=10;
        }
        return (int)rem;
        
    }
}
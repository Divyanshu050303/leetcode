class Solution {
    
    public int addDigits(int num) {
    // int sum = 0;
    //     while(num>0 || sum>9){
    //         if(num==0){
    //             num = sum;
    //             sum = 0;
    //         }
    //         sum += num%10;
    //         num = num/10;
    //     }
    //     return sum;
         int rem=0;
        if(num<10){
            return num;
        }
        while(num>0){
            rem+=num%10;
            num=num/10;
        }
        num=rem;
        return addDigits(  num);
    }
    
}
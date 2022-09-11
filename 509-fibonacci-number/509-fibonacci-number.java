class Solution {
    
    public int fib(int n) {
        if(n<=1)    
            return n;
        // int []fibArray=new int[n+1];
        // Arrays.fill(fibArray, -1);
    //     if(n<=1)
    //         return n;
    //     if(fibArray[n]!=-1)
    //         return fibArray[n];
        // fibArray[0]=1;
        // fibArray[1]=1;
        // for(int i=2;i<=n;i++){
        //     fibArray[n]=fibArray[i-1]+fibArray[i-2];
        // }
        int []fiboArray=new int[n+1];
        Arrays.fill(fiboArray, -1);
        fiboArray[0]=0;
        fiboArray[1]=1;
        for (int i = 2; i <=n ; i++) {
            fiboArray[i]=fiboArray[i-1]+fiboArray[i-2];
        }
        
      return fiboArray[n];
        
    }
}
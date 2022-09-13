class Solution {
    public int climbStairs(int n) {
         
        if(n==1)
            return 1;
        int []fiboArray=new int[n+1];
        Arrays.fill(fiboArray, -1);
        fiboArray[0]=1;
        fiboArray[1]=1;
        for (int i = 2; i <=n ; i++) {
            fiboArray[i]=fiboArray[i-1]+fiboArray[i-2];
        }
        return fiboArray[n];
        
    }
}
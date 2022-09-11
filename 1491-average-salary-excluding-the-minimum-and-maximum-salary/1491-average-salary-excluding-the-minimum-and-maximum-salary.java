class Solution {
    public double average(int[] salary) {
         int max=salary[0];
        int min=salary[0];
        for(int i=0;i<salary.length;i++){
           if(max<salary[i]){
               max=salary[i];
           }
            if(min>salary[i]){
                min=salary[i];
            }  
        }
         double sum=0;
        for (int i=0;i<salary.length;i++){
            if(min!=salary[i] && max!=salary[i]){
                sum+=salary[i];
            }
        }
        return   sum/(salary.length-2);
        
    }
}
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
          String d="123456789";
        List<Integer> list=new ArrayList<>();
        for(int l=1;l<=9;l++){
            for(int i=0;i+l<=d.length();i++){
                String sub=d.substring(i,i+l);
                int val=Integer.parseInt(sub);
                if(val>=low && val<=high){
                    list.add(val);
                }
            }
        }
        return list;
        
    }
}
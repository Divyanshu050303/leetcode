class Solution {
    public int numJewelsInStones(String J, String s) {
        int sum=0;
        for(int i=0;i<J.length();i++){
            for(int j=0;j<s.length();j++){
                if(J.charAt(i)==s.charAt(j)){
                    sum++;
                }
            }
        }
        return sum;
        
    }
}
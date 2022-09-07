class Solution {
    public int firstUniqChar(String s) {
        int re=Integer.MAX_VALUE;
        for(char c='a';c<='z';c++){
            int index=s.indexOf(c);
            if(index!=-1 && index==s.lastIndexOf(c)){
                re=Math.min(re, index);
            }
        }
        return re==Integer.MAX_VALUE?-1:re;
        
    }
}
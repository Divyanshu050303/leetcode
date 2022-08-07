class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        String st="";
        if(s.isEmpty()){
            return max;
        }
        else if(s.length()==1){
            return 1;
        }
        for(char c:s.toCharArray()){
            String t=s.valueOf(c);
            if(st.contains(t)){
                st=st.substring(st.indexOf(t)+ 1);
            }
            st+=String.valueOf(c);
            max=Math.max(st.length(), max);
        }
        return max;
    }
}
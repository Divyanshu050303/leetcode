class Solution {
    public int lengthOfLastWord(String s) {
        String []word=s.split(" ");
        int n=word.length;
        String str=word[n-1];
        return str.length();
        
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        // String []word=s.split(" ");
        // int n=word.length;
        // String str=word[n-1];
        // return str.length();
            int count=0;
    for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)!=' '){
           count++;
        }
        else{
            if (count>0){
               return count;  
            }
        }
        
    }
        return count;
        
    }
}
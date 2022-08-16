import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {    
        // int num, rev_num=0;
        // num=n;
        // if(n>=0)
        // {
        //     while (num > 0) 
        //     {
        //     rev_num = rev_num * 10 + num % 10;
        //     num = num / 10;
        //     }
        //     if(n==rev_num)
        //     {
        //     return true;
        //     }
        //     return false;
        // } 
        // return false;
         String s="";
        String X=x+"";
        if(X.charAt(0)=='-'){
            return false;
        }
        if(X.charAt(X.length()-1)=='0' && X.charAt(0)!='0'){
            return false;
        }
        for(int i=X.length()-1;i>=0;i--){
            s+=X.charAt(i);
        }
        if(s.equals(X)){
            return true;
        }
        return false;
    }
}
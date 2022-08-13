class Solution {
    public int strStr(String X, String Y) {
         if (X == null || Y.length() > X.length()) {
            return -1;
        }
        if (Y == null || Y.length() == 0) {
            return 0;
        }
        for (int i = 0; i <= X.length() - Y.length(); i++)
        {
            int j;
            for (j = 0; j < Y.length(); j++) {
                if (Y.charAt(j) != X.charAt(i + j)) {
                    break;
                }
            }
 
            if (j == Y.length()) {
                return i;
            }
        }
 
        return -1;
        
    }
}
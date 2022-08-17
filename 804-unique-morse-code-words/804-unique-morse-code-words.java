class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String []mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            Set<String> hash=new HashSet<>();
        
        for(int i=0;i<words.length;i++){
            String s=words[i];
            String time="";
            for(int j=0;j<s.length();j++){
                 time += mos[s.charAt(j) - 'a'];
            }
            hash.add(time);
        }
        return hash.size();
        
    }
}
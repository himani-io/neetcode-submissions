class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            boolean visited = false;

            char ch = s.charAt(i);
            
            for(int k=0; k<i; k++){
                if(s.charAt(k) == ch){
                    visited = true;
                    break;
                }
            }

            if(visited){
                continue;
            }

            int s_count = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == ch){
                    s_count ++;
                }
            }

            int t_count = 0;
            for(int j=0; j<t.length(); j++){
                if(t.charAt(j) == ch){
                    t_count ++;
                }
            }

            if(t_count != s_count){
                return false;
            }
        }

        return true;
    }
}

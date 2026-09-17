class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder r=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                r.append(Character.toLowerCase(c));
            }
        }
        return r.toString().equals(r.reverse().toString());
    }
}

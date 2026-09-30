class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder se=new StringBuilder();
        for(char c:s.toCharArray()){
           if(Character.isLetterOrDigit(c)){
            se.append(Character.toLowerCase(c));
           }
        }
        return se.toString().equals(se.reverse().toString());
    }
}

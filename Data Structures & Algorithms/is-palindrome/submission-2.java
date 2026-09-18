class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder se=new StringBuilder();
        for(char r:s.toCharArray()){
            if(Character.isLetterOrDigit(r)){
                    se.append(Character.toLowerCase(r));
            }
        }
        return se.toString().equals(se.reverse().toString());
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c=s.toCharArray();
        char []k=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(k);
        if(Arrays.equals(c,k)){
            return true;
        }
        return false;
    }
}

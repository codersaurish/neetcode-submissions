class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int res=0;
        Set<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            res=Math.max(res,i-l+1);
        }
        return res;
    }
}

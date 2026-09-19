class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int res=0;
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                l=Math.max(l,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            res=Math.max(res,i-l+1);
        }
        return res;
    }
}

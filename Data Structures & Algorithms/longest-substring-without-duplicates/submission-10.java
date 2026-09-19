public class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashMap<Character,Integer>map=new HashMap<>();
    int l=0;
    int r=0;
    for(int i=0;i<s.length();i++){
        if(map.containsKey(s.charAt(i))){
         l=Math.max(map.get(s.charAt(i))+1,l);
        }
     
   
    map.put(s.charAt((i)),i);
    r=Math.max(r,i-l+1);
    }
    return r;
    }
}   
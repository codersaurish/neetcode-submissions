class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>r=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String k=new String(c);
             r.putIfAbsent(k,new ArrayList<>());
            r.get(k).add(s);
            
             }
             return new ArrayList<>(r.values());
        }
    }
 
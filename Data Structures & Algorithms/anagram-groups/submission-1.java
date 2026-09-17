class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            char []arr= s.toCharArray();
            Arrays.sort(arr);
            String k=new String(arr);
            map.putIfAbsent(k,new ArrayList<>());
            map.get(k).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

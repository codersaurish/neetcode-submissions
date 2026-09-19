class Solution {
    public int characterReplacement(String s, int k) {
        
        int res=0;
        Set<Character>set=new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        for(char c:set){
            int count =0,l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
            while((i-l+1)-count>k){
                if(s.charAt(l)==c){
                    count--;
                }
                l++;
            }
            res=Math.max(res,i-l+1);    
        }


        }
        return res;
    }
}

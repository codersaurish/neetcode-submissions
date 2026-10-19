class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer>list=new ArrayList<>();
        for(int s:stones){
            list.add(s);
        }
        while(list.size()>1){
            Collections.sort(list);
            int curr=list.remove(list.size()-1)-list.remove(list.size()-1);
            if(curr!=0){
                list.add(curr);
            }
        }
        return list.isEmpty()?0:list.get(0);
    }
}

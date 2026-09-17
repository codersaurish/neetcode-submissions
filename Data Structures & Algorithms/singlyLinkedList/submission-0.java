class LinkedList {
     java.util.LinkedList<Integer> l;
    public LinkedList() {
        l=new java.util.LinkedList<>();
    }

    public int get(int index) {
        try{
            return l.get(index);
        }
        catch(IndexOutOfBoundsException e){
            return -1;
        }
    }

    public void insertHead(int val) {
        l.addFirst(val);
    }

    public void insertTail(int val) {
        l.addLast(val);
    }   

    public boolean remove(int index) {
       if(index<0|| index>=l.size()){
        return false;
       }
       
        l.remove(index);
        return true;
       
    }
    
    public ArrayList<Integer> getValues() {
            ArrayList<Integer>r=new ArrayList<>();
            r.addAll(l);
            return r;
    }
}

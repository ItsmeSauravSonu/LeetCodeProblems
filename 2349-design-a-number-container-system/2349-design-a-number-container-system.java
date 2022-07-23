class NumberContainers {
    TreeMap<Integer,Integer> map ;
    public NumberContainers() {
        this.map = new TreeMap<>();
    }
    
    public void change(int index, int number) {
        map.put(index,number);
    }
    
    public int find(int number) {
        for(int x: map.keySet())
        {
           if(map.get(x)==number){
               return x;
           }
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
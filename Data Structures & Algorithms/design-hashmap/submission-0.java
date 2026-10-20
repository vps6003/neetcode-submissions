class MyHashMap {
    class Pair {
        int key;
        int value;

        Pair(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    ArrayList<Pair>map;
    public MyHashMap() {
        this.map = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        int idx = containsKey(key);
        Pair p = new Pair(key,value);
        if(idx == -1) {
            map.add(p);
            return;
        }
        map.get(idx).value = value;
    }
    
    public int get(int key) {
        int idx = containsKey(key);
        return idx == -1 ? idx : map.get(idx).value;
    }
    
    public void remove(int key) {
        int idx = containsKey(key);
        if(idx != -1){
            map.remove(idx);
        }
    }

    public int containsKey(int key){
        // boolean present = false;

        for(int i=0 ; i<map.size();i++){
            if(map.get(i).key == key)
            return i;
        }

        return -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
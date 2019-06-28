package Hash;

import java.util.HashMap;

public class MyHashMap<K,V> {
    private HashMap<K,MyValue<V>>  bMap;
    private long time;
    private MyValue<V> setAll;
    public MyHashMap() {
        this.bMap = new HashMap<K, MyValue<V>>();
        this.time = 0;
        this.setAll = new MyValue<V>(null, -1);
    }
    public boolean containsKey(K key){
        return this.bMap.containsKey(key);

    }
    public void put(K key,V value){
        this.bMap.put(key,new MyValue<V>(value,this.time++));
    }
   public void setAll(V value){
        this.setAll=new MyValue<V>(value,this.time++);
   }
   public V get(K key){
        if(this.containsKey(key)){
            if(this.bMap.get(key).getTime()>this.setAll.getTime()){
                return this.bMap.get(key).getValue();
            }
            else{
                return this.setAll.getValue();
            }
        }
        else{
            return null;
        }
   }

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(20,"zhangsan");
        hashMap.put(18,"gao");
        hashMap.put(18,"hao");
        hashMap.put(23,"yuan");
        System.out.println(hashMap);
        hashMap.get(18);
        System.out.println(hashMap);
        System.out.println(hashMap.containsKey(21));
//        hashMap.setAll();
    }
}
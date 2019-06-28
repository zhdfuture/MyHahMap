package Hash;

public class MyValue<V> {
    private V value;
    private long time;

    public MyValue(V value,long time){
              this.value=value;
              this.time=time;
    }
    public V getValue(){
        return this.value;
    }
    public long getTime(){
        return this.time;
    }

}

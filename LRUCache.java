import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LRUCache {
    LinkedHashMap <Integer,Integer>lp;
    Integer capacity;
    public LRUCache(int capacity) {
        lp = new LinkedHashMap(capacity);        
        this.capacity = new Integer(capacity);
    }
    
    public int get(int key) {
        
        if(lp.containsKey(key))
        {
            int val = lp.get(key);
            lp.remove(key);
            lp.put(key, val);
            return val;
        }
        else
        {
            return -1;
        }
    }
    
    public void set(int key, int value) {
        if(lp.containsKey(key))
        {
            lp.remove(key);
            lp.put(key, value);
        }
        else
        {
           if(lp.size() >= capacity )
           {               
               Set s = lp.keySet();               
               Iterator it = s.iterator();            
               lp.remove(it.next());
               lp.put(key, value);             
           }
           else
           {
               lp.put(key, value);
           }
    }
  }
}
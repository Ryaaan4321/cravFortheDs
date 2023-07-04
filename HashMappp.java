package classWork;
import java.util.*;

public class HashMappp {
    // hashmap is a another intresting stuff where we are storing the value with alongside its key value 
    // and the value can be accesed by its key 
    // and the one key can be in a map only for a single time or we can say each indidvidual key is unique in itslef in the map
   // it cant be presented in the map for more than a one time..
    static void HashMapp(){
        Map<Integer , Integer> mpp = new HashMap<>();
        mpp.put(1, 1);
        mpp.put(2, 2);
        mpp.put(3, 3);
        mpp.put(4, 4);
        mpp.put(5, 5);
        mpp.put(6, 6);
        mpp.put(5, 11);
        // and if i reffered a new value to the key than it will override to the last value like i do in 5 so now in the key 5 the value is : 11 not 5
        System.out.println("the elements of the map are : " + mpp);
    } 

    static void treeemap(){
        // so in the tree map all the value follows the order of the key the way the values of keys are initialized on the same way the values of the treemap willl be printed 
        // and p
        TreeMap<Integer , Integer > tm = new TreeMap<>();
        tm.put(1, 13);
        tm.put(2, 14);
        tm.put(3, 11);
        tm.put(4, 15);
        tm.put(5, 17);
       tm.put(2, 20);
       // one more thing to remember is that ki it does inherits all the properties of the hashmap ..^_^

        System.out.println("the elements of the treemap are : " +tm);
      
    }
    public static void main(String[]args){
        HashMapp();
        treeemap();
    }
}

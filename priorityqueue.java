package classWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class priorityqueue {
    static void priorityqueuee(){
        PriorityQueue<Integer> qq = new PriorityQueue<>(6);
       


        qq.add(1);
        qq.add(2);
        qq.add(3);
        qq.add(4);
        qq.add(5);
        qq.offer(6);
         int p = qq.remove();
         System.out.println("the poll element is " + p);
         int q = qq.peek();
         System.out.println("the peek element is " +q);
         int w = qq.poll();
         System.out.println(w);
      
    }

    // sp the hashset is famous for storing only the unique element into the hashset
    static void hashsett(){
        HashSet<Integer> hh = new HashSet<>(0);
         
        hh.add(1);
        hh.add(6);
        hh.add(3);
        hh.add(4);
        hh.add(5);
        System.out.println("hashset : " +hh);
        hh.add(4);
       
        hh.add(3);
    }
    // much same like hashset bt it does have properties f the linkedlist so linkedlist and hashset bhai bhai..(●'◡'●)
    static void Linkedhashset(){
        LinkedHashSet<Integer> lh = new LinkedHashSet<>(0);
        lh.add(1);
        lh.add(4);
        lh.add(2);
        lh.add(3);
        lh.add(5);
        lh.add(7);
        System.out.println("LinkedHashset :" +lh);
    }
    
    public static void main(String[]args){
        Linkedhashset();
        priorityqueuee();
        hashsett();
    

    }
    
}

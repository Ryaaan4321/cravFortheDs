package classWork;
import java.util.*;

public class Reorderqueue {
    // okk so u guys are ready to know the intution behind this questionn?
    // so for tht question we  have a lerage of using a extra space
    // so i m using stack bcx the stack adn queue are in a mutual realtionship (●'◡'●)


    
    public static Queue<Integer> reorder(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        // we took a stack and push the first half of the queue
        // if the queue is(1 ,2 , 3, 4 , 5 ,6 , 7 ,8) then the [ 1, 2 ,3 ,4]
        // are now in the stack and [ 5 ,6  , 7 ,8] are in the queue;
        
        for(int i = 1; i <=(n/2) ; i++){
            st.push(q.remove()); // st : 1 , 2 , 3 , 4
          
            
        }
        // now poping out the element of the stack and adding them into the queue
        while(st.size()>0){
            q.add(st.pop());
            //q: [5 , 6 ,7 , 8 , 4 , 3 , 2 ,1]
        }

        
        // now again pushing the first half of the queue into the stack
        for(int i = 1; i <= (n/2); i++){
            st.push(q.remove());  // st : 8 ,  7 , 6 , 5 ;
        }
        // and once it is done poping out the element of the stack
        // and also removing the element of queues and adding them back into
        // the queue
        // till now the queue is : [ 4 , 3 , 2 ,1]
        // and stack : [8 , 7 ,6 ,5]
        // Point to remember and steps to folllow..
         // Step-1. pop the elements of the stack and add them into the queue
         // Step-2. removing the elements of the queue and adding them back into the queue
         
         
        
        for(int i = 1 ; i <= (n/2) ; i++){
           q.add(st.pop());
           q.add(q.remove());
           //after following these steps the queue will be look like something like this;
           // [3 , 2 , 1 ,8 ,4] // 8 from the stack and 4 from the queue adding it back into the queue
           // [2 ,1 8 ,4 , 6 , 3] // 6 from the stack and 3 from the queue 
           // [1 ,8, 4 , 6 , 3 , 7, 2] 7 from the stack and 2 from the queue
           // [8 , 4, 6 ,3 , 7 , 2 , 5 ,1] 5 from............
        }


        while(q.size() > 0){
            st.push(q.remove());
        }
        while(st.size() > 0){
            q.add(st.pop());
        }
        // reversing the queue :[1, 5 , 2 ,7 , 3 , 6 , 4 ,8] 
    
        return q;
    }
    public static void main(String[] args) {
    Queue<Integer> inputQueue = new LinkedList<>();
    inputQueue.add(1);
    inputQueue.add(2);
    inputQueue.add(3);
    inputQueue.add(4);
    inputQueue.add(5);
    inputQueue.add(6);
    inputQueue.add(7);
    inputQueue.add(8);
    
    Queue<Integer> reorderedQueue = reorder(inputQueue);
    
    System.out.println("Reordered Queue: " + reorderedQueue);
}

    
    
}

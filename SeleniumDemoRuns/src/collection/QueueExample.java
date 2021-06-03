package collection;

import java.util.*; 
class QueueExample { 
    public static void main(String args[]){ 
        PriorityQueue<String> queue=new PriorityQueue<String>(); 
        // creating priority queue 
        queue.add("Amit"); 
        // adding elements 
        queue.add("Rachit");
        queue.add("Rahul"); 
        System.out.println("head:"+queue.element()); 
        System.out.println("head:"+queue.peek()); 
        System.out.println("iterating the queue elements:"); 
        Iterator itr=queue.iterator(); 
        while(itr.hasNext()){ 
            System.out.println(itr.next()); 
        } 
        queue.remove(); 
        queue.poll(); 
        System.out.println("after removing two elements:"); 
        Iterator<String> itr2=queue.iterator(); 
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}


/*
Method	Description
 boolean add(object)	 Inserts the specified element into the queue and returns true if it is a success.
 boolean offer(object)	 Inserts the specified element into this queue.
 Object remove()	 	 Retrieves and removes the head of the queue.
 Object poll()	 		 Retrieves and removes the head of the queue, or returns null if the queue is empty.
 Object element()	 	 Retrieves, but does not remove the head of the queue.
 Object peek()	 		 Retrieves, but does not remove the head of this queue, or returns null if the queue is empty.
*/
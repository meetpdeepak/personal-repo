package collection;

import java.util.*;
 class ArrayListExample{
	 public static void main(String args[]){
	  
	 ArrayList al=new ArrayList();  // creating array list
	 al.add("Jack");                // adding elements    
	 al.add("Tyler");
     // at beginning itr(cursor) will point to index just before the first element in al
	 Iterator itr=al.iterator();
	// checking the next element availabilty
	 while(itr.hasNext()){
		//  moving cursor to next element
	 System.out.println(itr.next());
	 }
	}
 }
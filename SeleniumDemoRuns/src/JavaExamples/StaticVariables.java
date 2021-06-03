/*
 static keyword in Java is used for memory management mainly
 The static variable can be used to refer to the common property of all objects (which is not unique for each object), 
 for example, the company name of employees, college name of students, etc
 The static variable gets memory only once in the class area at the time of class loading.
 It makes your program memory efficient (i.e., it saves memory).
 
 */

package JavaExamples;

class StaticVariables{  
	   int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable  
	   //constructor  
	   StaticVariables(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	}  
	//Test class to show the values of objects  
	class TestStaticVariable1{  
	 public static void main(String args[]){  
		 StaticVariables s1 = new StaticVariables(111,"Karan");  
		 StaticVariables s2 = new StaticVariables(222,"Aryan");  
	 //we can change the college of all objects by the single line of code  
	 //Student.college="BBDIT";  
	 s1.display();  
	 s2.display();  
	 }  
	}
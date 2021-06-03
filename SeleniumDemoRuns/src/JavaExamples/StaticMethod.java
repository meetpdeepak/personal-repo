/*
 A static method belongs to the class rather than the object of a class.
 A static method can be invoked without the need for creating an instance of a class.
 The static method can not use non static data member or call non-static method directly.
 this and super cannot be used in static context.
 Why main method is static - It is because the object is not required to call a static method. If it were a non-static 
 method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.
 */


package JavaExamples;

class StaticMethod{  
    int rollno;  
    String name;  
    static String college = "ITS";  
    //static method to change the value of static variable  
    static void change(){  
    college = "BBDIT";  
    }  
    //constructor to initialize the variable  
    StaticMethod(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display values  
    void display(){System.out.println(rollno+" "+name+" "+college);}  
}  
//Test class to create and display the values of object  
class TestStaticMethod{  
   public static void main(String args[]){  
	   StaticMethod.change();//calling change method  
   //creating objects  
	   StaticMethod s1 = new StaticMethod(111,"Karan");  
	   StaticMethod s2 = new StaticMethod(222,"Aryan");  
	   StaticMethod s3 = new StaticMethod(333,"Sonoo");  
   //calling display method  
   s1.display();  
   s2.display();  
   s3.display();  
   }  
}
/* Abstract classes are similar to interfaces. 
   You cannot instantiate them, and they may contain a mix of methods declared with or without an implementation. 
   With abstract classes, you can declare fields that are not static and final, and define public, protected, 
   and private concrete methods. With interfaces, all fields are automatically public, static, and final, and all methods 
   that you declare or define (as default methods) are public. 
   In addition, you can extend only one class, whether or not it is abstract, whereas you can implement any number of 
   interfaces.
*/

package JavaExamples;

abstract class MyTest 
{ 
  abstract void calculate(int a, int b); // No body. 
 } 
class Addition extends MyTest 
{ 
  void calculate(int a, int b)
  { 
    int x = a + b; 
    System.out.println("Sum: "+x); 
   } 
} 
class Subtraction extends MyTest 
{ 
  void calculate(int a, int b)
  { 
    int y = a - b; 
    System.out.println("Subtract: " +y); 
  } 
} 
class Multiplication extends MyTest 
{ 
  void calculate(int a, int b)
  { 
    int z = a * b; 
    System.out.println("Multiply: " +z); 
  } 
} 
public class AbstractDemo 
{ 
 public static void main(String[] args) 
 { 
   Addition a = new Addition(); 
   Subtraction s = new Subtraction(); 
   Multiplication m = new Multiplication(); 
    
    a.calculate(20, 30); 
    s.calculate(10, 5); 
    m.calculate(10, 20); 
  } 
}
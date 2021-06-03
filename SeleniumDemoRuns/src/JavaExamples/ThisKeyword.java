/*
this is used to refer current-class’s instance as well as static members.

to refer instance variable of current class
to invoke or initiate current class constructor
can be passed as an argument in the method call
can be passed as argument in the constructor call
can be used to return the current class instance
 
 */

package JavaExamples;

class ThisKeyword  {
 // instance variable
 int a = 10;

 // static variable
 static int b = 20;

 void GFG()
 {
     // referring current class(i.e, class RR)
     // instance variable(i.e, a)
     this.a = 100;

     System.out.println(a);

     // referring current class(i.e, class RR)
     // static variable(i.e, b)
     this.b = 600;

     System.out.println(b);
 }

 public static void main(String[] args)
 {
     // Uncomment this and see here you get
     // Compile Time Error since cannot use
     // 'this' in static context.
     // this.a = 700;
     new ThisKeyword ().GFG();
 }
}
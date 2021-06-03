/*
 It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods 
 of the interface.
 You cannot instantiate an interface.
 An interface does not contain any constructors.
 All of the methods in an interface are abstract.
 An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static 
 and final.
 An interface can extend multiple interfaces.
 
 */

package JavaExamples;

import java.text.DecimalFormat;

interface Shape {
	public void draw();
	public void getArea();

}

class Circle implements Shape { 
	double radius = 8;
public void draw(){ 
	System.out.println("Drawing Circle"); 
	} 
	public void getArea(){ 
	double Area = Math.PI*radius*radius;
	DecimalFormat df = new DecimalFormat("###.##");		//rouding off number to 2 decimal places
	System.out.println("Area is: "+df.format(Area));
} 
public double getRadius(){
	return radius; 
} 
}

class Square implements Shape{
	public int side=9;		//instance variable
	public void draw() {
		System.out.println("Drawing Square"); 		
	}
	
	public void getArea() {
	double Area = this.side* this.side;			//referring instance variable
	System.out.println("Area of square is: "+Area);
	}
}
public class InterfaceDemo { 
	public static void main (String args[]){
	Shape c = new Circle();
	Shape s = new Square();
	c.draw();
	c.getArea();
	s.draw();
	s.getArea();

}
}



/*
super is used to refer super-class’s instance as well as static members.
super is also used to invoke super-class’s method or constructor.
super is used to access methods of the Parent class 

 */

package JavaExamples;

class SuperKeyword {
	  void eat() {
	    System.out.println("animal : eat");
	  }
	}

	class Dog extends SuperKeyword {
	  void eat() {
	    System.out.println("dog : eat");
	  }
	  void anotherEat() {
	    super.eat();
	  }
	}

	class Test {
	  public static void main(String[] args) {
		  SuperKeyword a = new SuperKeyword();
	    a.eat();
	    Dog d = new Dog();
	    d.eat();
	    d.anotherEat();
	  }
	}
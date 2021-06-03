package JavaExamples;

	class Teacher{
	String designation = "Teacher";
	String collegeName = "Edureka";
	void does()
		{
		System.out.println("Teaching");
	}
}
	public class InheritanceDemo extends Teacher{
	String mainSubject = "Spark";
	public static void main(String args[]){
	InheritanceDemo obj = new InheritanceDemo();
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
	System.out.println(obj.mainSubject);
	obj.does();
}
}
	
	/* Rules in Inheritance
	RULE: Multiple Inheritance is NOT permitted in Java. Achieved through Interface
	RULE: Private members do NOT get inherited.
	RULE: Constructors cannot be Inherited in Java (A constructor cannot be inherited, 
	as the subclasses always have a different name.)
	RULE: 
	*/
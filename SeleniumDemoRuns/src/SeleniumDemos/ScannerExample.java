package SeleniumDemos;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	String name = obj.nextLine();
	int age = obj.nextInt();
	double salary = obj.nextDouble();
	
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Salary: "+salary);

	}

}

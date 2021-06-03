package SeleniumDemos;

import java.util.Scanner;

public class SquareOfNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = s.nextInt();
		int square = num*num;
		Double square_func = Math.pow(num, 3);		//can be used math.pow func for square as well by changing 3 to 2
		System.out.println("Square of " +num+" is: " +square);
		System.out.println("Three times of " +num+" is: " +square_func);
	}

}

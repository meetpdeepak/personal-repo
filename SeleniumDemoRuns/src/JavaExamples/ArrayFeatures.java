package JavaExamples;

public class ArrayFeatures {

public static void main(String args[]) {
		int a[]= new int[5];				//all three are valid definitions
		int[]b = new int[5];
		int[]c = new int[] {1,2,3,4,5};
	
		for(int i=0;i<c.length; i++) {
		System.out.println(c[i]);
	}
}}
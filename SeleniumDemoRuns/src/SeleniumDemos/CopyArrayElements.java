package SeleniumDemos;

import java.util.Arrays;

public class CopyArrayElements {

	public void copyarray() {
		int arr1[]= {1,2,3,4,5,6,6,9};
		int arr2[]= new int[arr1.length];
		
		for(int i=0; i < arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("Elements of original array 1: ");
		for (int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+ " , ");
        }

		
		System.out.println("\nElements of new arrray 2: ");
		for (int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i]+ " , ");
		}

	}

}

package SeleniumDemos;

public class ReverseOfArray {

	public void reversearray() {
		int[] arr1 = new int[] {1,2,3,4,5};
		System.out.println("Original array is: ");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("Reversed array is: ");
		for(int i= arr1.length-1;i>=0;i--) {
			System.out.println(arr1[i]);
		}

}}

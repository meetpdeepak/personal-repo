package SeleniumDemos;

public class LargestElementOfArray {

	public void LargestElement()  {
		int arr1[]= new int[] {4,9,11,33,456,22,76};
		int max = arr1[0];
		for (int i=0; i<arr1.length;i++) {
			if (arr1[i]>max)
				max=arr1[i];
		}
		System.out.println("Largest number of array is: " + max);

}}

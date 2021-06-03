package SeleniumDemos;

public class SumOfItemsInArray {

	public void SumOfItem() {
		int arr1[] = new int[] {2,3,5,6,9,10};
		int sum=0;
		
		for(int i=0; i<arr1.length;i++) {
			sum= sum+arr1[i];
		}
		System.out.println("Sum of all items in array is: " + sum);

}}

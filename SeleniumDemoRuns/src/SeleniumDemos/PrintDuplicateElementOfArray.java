package SeleniumDemos;

public class PrintDuplicateElementOfArray {

	public void duplicatearray() {
		int arr1[]= new int[] {1,2,3,6,77,3,1,7,6,9,10};
		
		System.out.println("Duplicate elements in given array: ");
		for(int i=0; i<arr1.length;i++) {
			for (int j=i+1;j<arr1.length;j++){
				if(arr1[j]==arr1[i])
					System.out.println(arr1[j]);
			}
		}

}}

package SeleniumDemos;

public class ArrayPrint {

	public void printarray() {		//method has return type but constructor doesn't
		int myNum[] = new int[] {5, 10, 15, 20};
		String dogs[] = new String[] {"Pitbull", "Poodle", "Lab", "Pug"};
		
		for (int i=0; i<myNum.length; i++) {
		System.out.println(myNum[i]);
		}
		
		for (int i=0; i<dogs.length; i++) {
				System.out.println(dogs[i]);
		}

	}

}

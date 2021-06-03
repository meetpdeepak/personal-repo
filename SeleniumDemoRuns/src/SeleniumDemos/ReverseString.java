package SeleniumDemos;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Dream Big";
		String reverse = "";
		for (int i = str.length()-1; i>=0;i--) {
		reverse= reverse + str.charAt(i);
		}
		System.out.println("Original string: "+ str);
		System.out.println("Reversed string is: "+ reverse);

	}

}

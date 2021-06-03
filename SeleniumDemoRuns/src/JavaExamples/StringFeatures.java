package JavaExamples;


	public class StringFeatures {
		public static void main(String args[]){ 
		String s1="Hello"; 
		String s2="hello";
		String s3="hemlo"; 
		String s4="flag";
		String s5 = s1.concat(" how are you");
		String s6 ="";
		String s7="HELLO HOW Are You?";
		String s8="hello how are you";
		
		System.out.println("string length is: "+s1.length());  // Java String length():
		System.out.println("string length is: "+s4.length()); 
		System.out.println(s1.compareTo(s2)); // 0 because both are equal
		System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m" 
		System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
		System.out.println(s5); 			//concat() method
		System.out.println(s6.isEmpty());	//isEmpty() method
		System.out.println(s5.isEmpty());
		System.out.println(s7.toLowerCase());	//tolowercase() method
		System.out.println(s8.toUpperCase());	//touppercase() method

}
}
	

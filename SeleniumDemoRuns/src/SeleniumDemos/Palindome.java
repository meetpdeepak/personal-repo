package SeleniumDemos;

class Palindome {
	
public void palindome() {
    int temp, reverse=0, remainder;
    int num=31443; // Palindome num are those remain same when reversed
    temp=num;
 

    while (num>0) 
    {
    	remainder = num%10;
        reverse = reverse*10 + remainder;
        num= num/10;        
     }

    	System.out.println(reverse);
    
		if ( temp==reverse) {  
		System.out.println("Palindrome number");
		}
		
		else {
			System.out.println("not palindome number");
		}
		
		
		}
}
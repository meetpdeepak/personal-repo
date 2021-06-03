package SeleniumDemos;


class OddEven {
	
	public void even() {
		for(int i = 0;i<=100;i++) {
			if(i%2==0)		//'%' gives remainder and '/' gives qoutient
			{
				System.out.println(i+" is even number");
			}
		
	}
}
	public void odd() {
		for(int i=0;i<=100;i++) {
			if (i%2!=0)
			{
				System.out.println(i+" is odd number");
			}	
		}
	}
}


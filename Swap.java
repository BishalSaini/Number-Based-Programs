

public class Swap { 
	public static void main(String[] args) {
		int a=6; 
		int b=3; 
		
		//Swap using third variable 
		System.out.println("Using third variable");
		int temp=a; 
		a=b; 
		b=temp; 
		
		System.out.println("a="+a); 
		System.out.println("b="+b);  
		
		//Swap without using third variable  
		System.out.println("Without using third variable");
		int x=10;
		int y=55; 
		
		x=x+y; 
		y=x-y; 
		x=x-y; 
		
		System.out.println("x="+x); 
		System.out.println("y="+y);
		
	}

}

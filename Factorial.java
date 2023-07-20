
public class Factorial {  
	public static int factorial(int n){
		int f=1;  
		while(n>0) {  
			f=f*n; 
			n--;
		} 
		return f;
	} 
	public static void main(String[] args) {
		System.out.println(factorial(25));
	}

}

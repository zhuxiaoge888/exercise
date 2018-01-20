package exercise3_array;

public class Fibonacci {

	private int n0=0;
	private int n1=0;
	
	
	public Fibonacci(int n){
		if (n == 0)
			System.out.println(n0);
		else if(n==1)
			System.out.println(n1);
		
		else {
			int result=0;
			for(int i=2;i<=n;i++){
				result = n0+n1;
				n0 = n1;
				n1 = result;
			}
			
		System.out.println(result);	
			
		}
		
		
		
	}
	
	
}

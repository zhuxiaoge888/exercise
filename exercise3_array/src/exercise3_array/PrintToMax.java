package exercise3_array;

public class PrintToMax {
	
	public void print(int a)throws Exception{
		if (a<=0) throw new Exception ("no sense");
		
		int circle = 1;
		for(int i= 0 ; i <a; i++ ){
			
			circle = circle *10;
		}
		
		for (int i=1; i<= circle;i++){
			
			System.out.println(i);
			
			
		}	
	}
}

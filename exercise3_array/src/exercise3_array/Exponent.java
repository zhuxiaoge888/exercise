package exercise3_array;

public class Exponent {
	
	public double power(double a , int b) throws Exception{
		
		double result;
		if (a==0&&b<0){
			throw new Exception("no sense when input 0 with negativ Exponent");
		}
		
		if (b==0){
			return 1;
		}
		if (b==1){
			return a ;
		}
		
		if (b<0){
			b = -b;
			a = 1/a;
			result = powerWithExponent(a,b);
		}
		else {
			result = powerWithExponent(a,b);
		}
		return result;
	}


	public double powerWithExponent(double a , int b){
		
		double result=1;
		for(int i =0; i<b;i++){
			result = result*a; 
		}
		return result;
		
	}
	
	
	
}

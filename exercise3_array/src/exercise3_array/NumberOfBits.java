package exercise3_array;

public class NumberOfBits {
	
	public int number (int value){
		int count = 0;
		
		if (value!=0){
			
			value = (value-1) & value;
			count ++;
		}
		return count;
		
	}
	
	
	
}

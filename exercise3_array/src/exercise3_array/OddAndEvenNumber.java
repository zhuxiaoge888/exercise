package exercise3_array;

/** Between Arrays cant use "+" operator;
 * 
 */


public class OddAndEvenNumber {
	
	
	public int[] sort(int array[])throws Exception{
		
		if(array.length==0){
			throw new Exception("Array hat 0 Element");
		}
		
		int length = array.length;
		int newArray[]= new int[length];
		int count=0;
		for(int i =0; i<length;i++){
			if(array[i]%2!=0){
				newArray[count]=array[i];
				count++;
			}
		}
		
		for(int i =0; i<length;i++){
			if(array[i]%2==0){
				newArray[count]=array[i];
				count++;
			}
		}
		return newArray;
		
	}
	
	
}

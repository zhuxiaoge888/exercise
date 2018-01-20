package exercise3_array;

public class Rotate {
	
	Rotate(int array[]){
		int j =0;
		for (int i =0; i<array.length-1;i++){
			if(array[j]<array[i+1]){
			}
			else{
				j = i+1;
			}
		}
		int min = array[j];
		for (int i=j; i>0;i--){
			array[i]=array[i-1];	
		}
		array[0]=min;
		
		for(int i :array){
		System.out.println(array[i]);}
		
	}
}

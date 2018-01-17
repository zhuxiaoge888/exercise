package exercise3_array;

public class array {
	
	int count;
	public boolean find(int array[][], int number){
		if(array==null)
			return false;
		//int column = array[0].length;
		for (int row=0; row<array.length; row++){
			int column = array[row].length-1;     //for count 
			for(int i=0; i<=column;i++){
				if(array[row][i]==number){
					count++;
					System.out.println("row: "+row+" column: "+column+"value: "+array[row][i]);
				}
			}
			
		}
		if (count==0)
			return false;
		else return true;
	}
	
	
}

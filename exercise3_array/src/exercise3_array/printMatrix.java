package exercise3_array;

public class printMatrix {
	
	public void print(int matrix[][]){
		
	   int row = matrix.length;
	   int column = matrix[0].length;
		
		for(int i=0; i<=row-1; i++){
			
			if(i%2==0){
				for(int j=0;j<=column-1;j++ ){
					System.out.println(matrix[i][j]);
				}
			}	
			else {
				for(int j=column;j>=0;j-- ){
					System.out.println(matrix[i][j]);
				}
					
			}	
				
				
			}
			
			
		}
		
		
		
}
	
	
	


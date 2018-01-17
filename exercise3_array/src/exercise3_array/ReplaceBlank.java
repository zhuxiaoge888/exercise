package exercise3_array;

public class ReplaceBlank {
	
	public String replace(String input){
		if (input==null)
			return null;
		
		StringBuffer output = new StringBuffer();
		for(int i=0; i<=input.length()-1; i++){
			if (input.charAt(i)==' '){
					output.append("20%");
				
			}
			else {
				output.append(String.valueOf(input.charAt(i)));
			}
			
		}
		
		return new String(output);
	}
	
}

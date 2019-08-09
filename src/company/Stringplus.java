package company;

public class Stringplus {

	public static void main(String[] args) {
		String str = "mta";

		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i++) {   
              
			System.out.print(c[i]);
			
			if(i<c.length-1)
			System.out.print("+");

		}

		System.out.println();
	

	/*public static void main(String[] args) {	
	int [] c = {2,3,4,5};
	
	for (int i = 0; i < c.length; i++) {

		System.out.print(c[i]);
		
		if(i<c.length-1)     //2+3+4+5
		System.out.print("+");

	}

	System.out.println();
		
	*/

}





}





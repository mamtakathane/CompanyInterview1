package company;

public class FactorialNo {

	public static void main(String[] args) {

		int count = 5;
		int i=1;
		int fact=1;
		 
		while (i <= 5) {
			fact = i*fact;
			i++;
		}
		System.out.println(fact);
	}
}

	/*int num =5;
	int result=1;
	while(num>0)
	{
		result=result*num;
		num--;
		
	}
	System.out.println("Factorial of 5 is ="+result);
	}

}*/

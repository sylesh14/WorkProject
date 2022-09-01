package forloop;

public class FindFactorial {
	public static void main (String[] args) {
		
		int fact = 1; int num = 5;
		for (int i = 1; i<=num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is " + fact);
		

//		int fact1 = 1; int num1 = 5;
//		for (int i = 1; i<=num1; i++) {
//			fact1 = fact1 * i;
//			
//			System.out.println("factorial of " + i + " is " + fact1);
//			
//		}
	
	}

}


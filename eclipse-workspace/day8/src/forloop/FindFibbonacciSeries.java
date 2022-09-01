package forloop;

public class FindFibbonacciSeries {
	public static void main (String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int loop = 10;
		
		for (int i=1; i<=loop; i++) {
			
			System.out.println(num1);
			int num3 = num1 + num2;
		    num1 = num2;
		    num2 = num3;
			
		}
		
		
	}

}

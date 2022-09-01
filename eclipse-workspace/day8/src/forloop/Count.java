package forloop;

public class Count {
	public static void main (String[] args) {
		
		int count = 0; int total = 0;
		for (int i=1; i<=50; i++) {
			
			total = total + i;
			count = count + 1;
			
		}
		System.out.println(total);
		System.out.println(count);
		System.out.println(total/count);
		
	}

}

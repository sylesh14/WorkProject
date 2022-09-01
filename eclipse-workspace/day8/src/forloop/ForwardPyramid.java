package forloop;

public class ForwardPyramid {
	public static void main(String[] args) {
		
		String word = "onesoft";
		String forward = "";
		
		for (int i=0; i < word.length(); i++) {
			
			forward = forward + word.charAt(i);
			System.out.println(forward);
			
			
		}
		
		
	}

}

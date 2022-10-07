package October_03;

public class IsFactorial {
	
	public static boolean isFactorial(int num) {
	
		int product = 1;
		
		while (product <= num) {
			
			for (int x = 1; x <= num; x++) {
				product *= x;
				
				if (product == num) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		
		System.out.println(isFactorial(24));

	}

}

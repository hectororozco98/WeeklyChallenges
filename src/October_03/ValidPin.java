package October_03;

public class ValidPin {
	
	public static boolean validPin(String pin) {
		
		if (pin.length() == 6) {
			
			for (int x = 0; x < pin.length(); x++) {
				
				if (pin.charAt(x) < 48 || pin.charAt(x) > 57) {
					return false;
				}
			}
			return true;
		} else if (pin.length() == 4) {
			
			for (int x = 0; x < pin.length(); x++) {
			
				if (pin.charAt(x) < 48 || pin.charAt(x) > 57) {
					return false;
				}
			}
			return true;	
		}
		return false;
	}

	public static void main(String[] args) {
		
		System.out.println(validPin("1234"));
	}
}

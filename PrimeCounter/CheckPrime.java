
public class CheckPrime {
	
	public boolean isPrime(double number) {
		double sqrtNumber = Math.sqrt(number);
		double sqrtNumberRoundedUp = Math.ceil(sqrtNumber);
		
		if (number % 2 == 0) {
			
			//System.out.println("Not prime");
			return false;
			
		}
		
		else {
		
		for (int i = 3; i <= sqrtNumberRoundedUp; i = i + 2) {
			if (number % i ==0) {
				//System.out.println("Not prime");
				return false;
			}
		}
		//System.out.println("This is a prime number!");
		return true;
	}
	}
	
	
}

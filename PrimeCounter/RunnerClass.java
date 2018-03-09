import java.util.ArrayList;

public class RunnerClass {
	public static void main(String[] args) {
		
		CheckPrime c = new CheckPrime();
		PrimeSearch p =new PrimeSearch();
		c.isPrime(29);
		
		//p.findPrimes(2000000000);
		
		
		ArrayList<Integer> n = new ArrayList<>();
		int a =2000000000;
		
		for (int i = 0; i < a; i++) {
			n.add(i + 1);
		}
		
		System.out.println(n.get(400));
	}
}

public class PrimeSearch {
	CheckPrime c = new CheckPrime();

	public int findPrimes(double number) {
		int counter = 1; // Starts at 1 to include the number 2.

		for (int i = 3; i < number; i = i + 2) {
			if (c.isPrime(i) == true) {
				counter++;
			}
		}
		System.out.println(counter);
		return counter;
	}

}
// 2hrs, might not finish, split(), charAt(), indexOF(), Collection.Sort().
package maths;

public class PrimeCalculator {

	public static void main(String[] args) {

		int N = 10000000;
		
		int count = 0;
		for (int i = 2; i <= N; i++) {
			if (isPrime(i)) {
//				System.out.println(i);
				count++;
			}
		}
		System.out.println("found " + count + " primes");
	}

	private static boolean isPrime(int n) {
		
		double maxFactor = Math.sqrt(n);
		
//		System.out.println("\t is this prime: " + n);
		for (int factor = 2; factor <= maxFactor; factor++) {
//			System.out.println("\t is this a factor: " + i);
			if (n % factor == 0) {
//				System.out.println("\t yes it is");
				return false;
			}
		}
		return true;

	}
}

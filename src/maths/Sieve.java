package maths;

public class Sieve {

	public static void main(String[] args) {

		int N;
		N = 10000000;
		boolean[] primes;
		primes = new boolean[N];

		for (int i = 0; i < N; i++) {
			primes[i] = true;
		}

		for (int i = 2; i < Math.sqrt(N); i++) {
			if (primes[i] == true) {
				for (int j = (i * i); j < N; j = j + i) {
					primes[j] = false;
				}
			}
		}

		int count = 0;
		for (int i = 2; i < N; i++) {
			if (primes[i]) {
//				System.out.println(i);
				count++;
			}
		}
		System.out.println("found " + count + " primes");
	}
}

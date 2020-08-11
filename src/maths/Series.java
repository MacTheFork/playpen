package maths;

// https://www.baeldung.com/java-calculate-factorial
// https://oss.sonatype.org
	
//import java.math.BigInteger;

//import com.google.common.math.BigIntegerMath;
//import org.apache.commons.math3.util.CombinatoricsUtils;

public class Series {

	public static void main(String[] args) {
		double x = 1.2;

		double tolerance = Math.pow(10, -8);
		double exp = 1;
		double term = 0;
		int n = 0;
		do {
			n++;
			term = Math.pow(x, n) / factorialUsingForLoop(n);
			exp += term;
//			System.out.println(term);
		} while (term > tolerance);
		
		System.out.println("Iterations: " + n);
		System.out.println("Estimate: " + exp);
		System.out.println("Better  : " + Math.exp(x));
	}

	private static long factorialUsingForLoop(int n) {
		long fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
//	public BigInteger factorialUsingGuava(int n) {
//	    return BigIntegerMath.factorial(n);
//	}
	

}

package com.habosa.euler;

import java.util.ArrayList;
import com.habosa.euler.Primes;

public class Fifty {
	
	public static void main(String[] args) {
		int million = 1000000;
		boolean[] isPrime = Primes.sieve(million);
		ArrayList<Integer> primes = Primes.primesFromSieve(isPrime);
			int max = 0;
			int maxterms = 0;
			for(int i = 0; i < primes.size(); i++) {
				int sum = primes.get(i);
				int index = i + 1;
				for(int j = i+1; j < primes.size() && sum <= million; j++) {
					sum += primes.get(j);
					if(sum <= million && isPrime[sum]) {
						int terms = (j - i + 1);
						if (terms >= maxterms) {
							maxterms = terms;
							max = sum;
						}
					}
				}
			}
		System.out.println("Terms: " + maxterms + ", sum: " + max);
	}

}

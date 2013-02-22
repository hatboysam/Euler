package com.habosa.euler;

import java.util.ArrayList;
import com.habosa.euler.Primes;

public class TwentySix {

	public static void main(String[] args) {
		ArrayList<Integer> primes = Primes.primesUpTo(1000);
		for(Integer i : primes) {
			double frac = 1.0/((double) i);
			System.out.println(frac);
		}
	}
}

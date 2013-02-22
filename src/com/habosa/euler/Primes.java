package com.habosa.euler;

import java.lang.Math.*;
import java.util.ArrayList;

public class Primes {

	/*
	 * Implement a sieve of Erasthones
	 */
	public static boolean[] sieve(int max) {
		boolean[] isPrime = new boolean[max+1];
		//Set all to true
		for (int i = 0; i < (max+1); i++) {
			isPrime[i] = true;
		}
		//Sieve
		double root = Math.sqrt(max);
		for (int i = 2; i <= root; i++) {
			if(isPrime[i]) {
				for(int j = i*i; j <= max; j += i) {
					isPrime[j] = false;
				}
			}
		}
		return isPrime;
	}

	public static ArrayList<Integer> primesUpTo(int max) {
		boolean[] isPrime = sieve(max);
		return primesFromSieve(isPrime);

	}

	public static ArrayList<Integer> primesFromSieve(boolean[] isPrime) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i]) {
				result.add(i);
			}
		}
		return result;	
	}

	/*
	 * Determine if a number is prime
	 */
	public static boolean isPrime(int num) {
		double root = Math.sqrt(num);
		for (int i = 2; i <= root; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Hello, primes!");
	}

}

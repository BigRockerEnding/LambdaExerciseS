package org.jointheleague.stephenh.anyexercises;

import java.util.function.Predicate;

public class FizzBuzzerS {
	private static Predicate<Integer> fizz = (n) -> n % 3 == 0;
	private static Predicate<Integer> buzz = (n) -> n % 5 == 0;
	private static Predicate<Integer> fizzbuzz = (n) -> fizz.test(n) && buzz.test(n);
	
	public static void fizzBuzz(int max) {
		for (int i = 1; i <= max; i++) {
			if (fizzbuzz.test(i)) {
				System.out.println("FizzBuzz");
			} else if (fizz.test(i)) {
				System.out.println("Fizz");
			} else if (buzz.test(i)) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}

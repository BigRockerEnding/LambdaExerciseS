package org.jointheleague.stephenh.anyexercises;

import java.util.List;
import java.util.function.Predicate;

public class IsUnique implements Predicate<List<Integer>> {
	private Predicate<Integer> predicate;
	
	public IsUnique(Predicate<Integer> p) {
		this.predicate = p;
	}
	
	public boolean test(List<Integer> a) {
		boolean unique = false;
		for (int i : a) {
			if (predicate.test(i)) {
				if (unique == false) { 
					unique = true;
				} else { 
					unique = false; 
					break;
				}
			}
		}
		return unique;
	}
}


package io.github.alanabarbosa;

import java.util.HashSet;
import java.util.Set;

public class Sets {
	public static void main(String[] args) {
		Set<String> setA = new HashSet<String>();
		Set<String> setB = new HashSet<String>();
		Set<String> setC = new HashSet<String>();
		
		setA.add("Apple");
		setA.add("Banana");
		setA.add("Orange");
		setA.add("Grape");
		setA.add("Pineapple");
		System.out.println("Set A: " + setA);		

		setB.add("Apple");
		setB.add("Banana");
		setB.add("Kiwi");
		setB.add("Pear");
		setB.add("Avocado");
		System.out.println("Set B: " + setB );		
		
		setC.add("Apple");
		setC.add("Banana");
		setC.add("Orange");
		setC.add("Grape");
		setC.add("Pineapple");
		setC.add("Lime");
		setC.add("Raspberry");
		setC.add("Coconut");
		setC.add("Plum");
		System.out.println("Set C: " + setC+ "\n");
		
		// Pertinencia
		if (setA.contains("Banana")) System.out.println("Banana pertence of Set A");		
		if (setB.contains("Pear")) System.out.println("Tangerine pertence of Set B\n");		
				
		if (setC.containsAll(setA)) {
		    System.out.println("Set A is contained in Set C (Set A ⊆ Set C)");
		} else {
		    System.out.println("Set A is not contained in Set C (Set A ⊄ Set C)");
		}

		if (setB.containsAll(setC)) {
		    System.out.println("Set B is contained in Set C (Set B ⊇ Set C)");
		} else {
		    System.out.println("Set B is not contained in Set C (Set B ⊈ Set C)");
		}

		if (setC.containsAll(setA)) {
		    System.out.println("C contains A (C ⊇ A)");
		} else {
		    System.out.println("C does not contain A (C ⊉ A)");
		}
     
		
		Set<String> union = new HashSet<String>(setA);
		union.addAll(setB);		
		System.out.println("\nUnion (Set A ∪ Set B): " + union);
		
		Set<String> intersection = new HashSet<String>(setA);
		intersection.retainAll(setB);
		System.out.println("Intersection (Set A ∩ Set B): " + intersection);
		
		Set<String> difference = new HashSet<String>(setA);
		difference.removeAll(setB);
		System.out.println("Difference (Set A - Set B): " + difference + "\n");	
	}
}

package com.futuregong;
import java.util.*;
/*
 * ºØ∫œ≤‚ ‘£¨P569
 */
public class test1 {
	public static void main(String[] args) {
		List<String> staff = new LinkedList<>();
		staff.add("A");
		staff.add("B");
		staff.add("C");
		Iterator iter = staff.iterator();
		String first = (String)iter.next();
		String second = (String)iter.next();
		System.out.println(first);
		System.out.println(second);
		iter.remove();
		String third = (String) iter.next();
		System.out.println(third);
		System.out.println("Now let's see what's gonna happen after the removal");
		for (int i = 0; i < staff.size(); i++) {
			System.out.println(staff.get(i));
		}
	}

}

package com.futuregong;
import java.util.*;

public class test1 {
	public static void main(String[] args) {
		
		/*
		 * 集合测试，P569
		 */
		System.out.println("集合测试");
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
		System.out.println();
		
		System.out.println("hashcode测试");
		String a ="fff";
		System.out.println(a.hashCode());
		String b ="ffe";
		System.out.println(b.hashCode());
		String c = "fff";
		System.out.println(c.hashCode());
		System.out.println();
		
		
	}

}

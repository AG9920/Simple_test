package com.futuregong;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		System.out.println("l :"+l);
		System.out.println("the second index of l:"+l.get(1));
		l.set(0, "D");
		System.out.println("l after initial change:"+l);
		// transmit value, not changing the initial element
		for(String t:l){
			t= "la";
			System.out.println(t);
		}
		System.out.println("l after second change"+l);
		l.remove(2);
		System.out.println("l after remove the last element"+l);
		System.out.println("size of l for the moment "+l.size());
	}
}

package com.futuregong;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class LinkedlistTest {
	public static void main(String[] args) {
		List<String> a = new LinkedList<>();
		a.add("Amy");
		a.add("Bob");
		a.add("Cathy");
		
		List<String> b = new LinkedList<>();
		b.add("Dougla");
		b.add("Eric");
		b.add("Fire");
		
		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter  = b.iterator();
		
		while(bIter.hasNext()){
			if(aIter.hasNext()) aIter.next();
			aIter.add(bIter.next());
		}
		System.out.println(a);
		

		bIter = b.iterator();
		while(bIter.hasNext()){
			bIter.next();
			if(bIter.hasNext()){
				bIter.next();
				bIter.remove();
			}

		}
		System.out.println(b);
		a.removeAll(b);
		System.out.println(a);
	}

}

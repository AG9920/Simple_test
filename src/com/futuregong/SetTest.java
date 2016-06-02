package com.futuregong;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> words = new HashSet<>();
		long totaltime = 0;
		Scanner in = new Scanner(System.in);
		
//		int total=0;
//		while(total<5000){
//			String word = in.next();
//			long callTime = System.currentTimeMillis();
//			words.add(word);
//			callTime = System.currentTimeMillis()-callTime;
//			totaltime+=callTime;
//			total++;
//		}
		
		while(in.hasNext()){
			String word = in.next();
			long callTime = System.currentTimeMillis();
			words.add(word);
			callTime = System.currentTimeMillis()-callTime;
			totaltime+=callTime;
			
		}
		
		Iterator<String> iter = words.iterator();
		for (int i = 0; i < 20&&iter.hasNext(); i++) {
			System.out.println(iter.next());
			System.out.println("...");
			System.out.println(words.size()+" distince words."+totaltime+"milliseconds.");
		}
		
		
	}

}

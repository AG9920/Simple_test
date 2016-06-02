package com.futuregong;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		PriorityQueue<String> ll = new PriorityQueue<>();
		ll.add("Michelle");
		ll.add("Alex");
		ll.add("Journey");
		System.out.println(ll.remove());
		pq.add(11);
		pq.add(1);
		pq.add(12);
		pq.add(18);
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		System.out.println(pq.remove().hashCode());
		System.out.println(Integer.hashCode(11));
		System.out.println(pq);
	}

}

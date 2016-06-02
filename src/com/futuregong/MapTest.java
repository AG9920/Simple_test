package com.futuregong;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		
		Map<String,Integer> p = new HashMap<>();
		
		//����ӳ��
		p.put("AA", 1);
		p.put("BB", 2);
		p.put("CC", 5);
		System.out.println(p);
		
		//����ɾ��
		p.remove("BB");
		System.out.println(p.remove("CC"));
		
		System.out.println(p);
		
		//�����滻ӳ��
		p.put("AA", 126);
		System.out.println(p);
		
		//���Բ���
		System.out.println(p.get("AA"));
		
		//ѭ��all entries
		for(Map.Entry<String, Integer> entry:p.entrySet()){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key="+key+" value="+value);
		}
	}

}

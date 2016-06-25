package com.futuregong.ceshi2;

/**
 * 
 * @author Administrator
 *
 */

public class ceshi {
	public static void main(String[] args) {
		//静态变量y的初始值为12
		jingtai a = new jingtai();
		jingtai b = new jingtai();
		jingtai.y+=5;
		a.y+=2;
		b.y+=1;
		System.out.println(jingtai.y+" "+a.y+" "+b.y);
		
		
		
		//关于字符串比较
		
		System.out.println("JOIN".equals("JOIN"));//true
		
		System.out.println("JOIN"=="JOIN");//true
		
		System.out.println("JOIN".equals(new String( "JOIN")));//true
		
		System.out.println("JOIN"== new String("JOIN"));//false

	}

}

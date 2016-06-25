package com.futuregong.ceshi;

public class ceshi {
	
	public static void main(String[] args) {
		
	
		/*下面这行代码编译时不会报错，但再执行时会报错
		 * yinyongzilei ss = (yinyongzilei) new yinyong();
		 */

		
		//赋值时转换
		yinyong a = new yinyongzilei();
		yinyongzilei b = (yinyongzilei) a;
		System.out.println(l(b));
		
		//调用参数的时候转换
		System.out.println(l((yinyongzilei)a));
		
		
	}
	
	public static yinyongzilei l (yinyongzilei t){
		return t;
	}
	
	public static yinyong ll(yinyong t){
		return t;
	}

}

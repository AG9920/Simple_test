package com.futuregong.ceshi1;

public class ceshi {
	
	public static void main(String[] args) {
		
	
		/*�������д������ʱ���ᱨ������ִ��ʱ�ᱨ��
		 * yinyongzilei ss = (yinyongzilei) new yinyong();
		 */

		
		//��ֵʱת��
		yinyong a = new yinyongzilei();
		yinyongzilei b = (yinyongzilei) a;
		System.out.println(l(b));
		
		//���ò�����ʱ��ת��
		System.out.println(l((yinyongzilei)a));
		
		System.out.println(123|12);
		
		
	}
	
	public static yinyongzilei l (yinyongzilei t){
		return t;
	}
	
	public static yinyong ll(yinyong t){
		return t;
	}

}

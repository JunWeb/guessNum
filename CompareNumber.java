package com.guessNum;

public class CompareNumber {
	
	public String compareNumber(String answer,String input){
		int A=0,B=0;
		for(int i=0;i<input.length();i++){
			//�ж�answer�ַ������Ƿ���input���ַ������ص����ַ�����λ��
			int index = answer.indexOf(input.charAt(i));
			//������λ����ȣ���A+1
			if(index == i){
				A = A + 1; 
			}
			//������λ�ò���ȣ���B+1
			else if(index != -1){
				B = B + 1;
			}
		}
		return A + "A" + B + "B";
	}
	
}

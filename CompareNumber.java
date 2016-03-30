package com.guessNum;

public class CompareNumber {
	
	public String compareNumber(String answer,String input){
		int A=0,B=0;
		for(int i=0;i<input.length();i++){
			//判断answer字符串中是否含有input的字符，返回的是字符所在位置
			int index = answer.indexOf(input.charAt(i));
			//包含且位置相等，则A+1
			if(index == i){
				A = A + 1; 
			}
			//包含但位置不相等，则B+1
			else if(index != -1){
				B = B + 1;
			}
		}
		return A + "A" + B + "B";
	}
	
}

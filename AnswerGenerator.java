package com.guessNum;

import java.util.Random;

public class AnswerGenerator {
	
	private Random random;

	//���캯��
	public AnswerGenerator(Random random){
		this.random = random;
	}
		
	//�����ĸ����ظ���0-9�������
	public String answerGenerator(){
		String answer = "";
		for(int i=0;i<4;i++){
			//ʹ��math.random()���������������math.floor()����ȡ��
			//int m = (int)Math.floor(Math.random()*10);
			//indexof()�õ�ĳ���ַ����ַ����е�λ�ã���������ڵĻ�����ֵΪ-1
			//if(answer.indexOf(Integer.toString(m)) == -1){
				//answer = answer + m;
			//}
			//else{
				//i = i-1;
			//}
			String m = Integer.toString(random.nextInt(10));
			if(answer.indexOf(m) == -1){
				answer += m;
			}
			else{
				i = i-1;
			}	
		}
		return answer;
	}
	
}

package com.guessNum;

import java.util.Random;

public class AnswerGenerator {
	
	private Random random;

	//构造函数
	public AnswerGenerator(Random random){
		this.random = random;
	}
		
	//产生四个不重复的0-9的随机数
	public String answerGenerator(){
		String answer = "";
		for(int i=0;i<4;i++){
			//使用math.random()产生随机数，利用math.floor()向下取整
			//int m = (int)Math.floor(Math.random()*10);
			//indexof()得到某个字符在字符串中的位置，如果不存在的话返回值为-1
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

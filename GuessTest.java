package com.guessNum;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class GuessTest {
	
	@Test
	public void return_correct_when_input_1243(){
		//mock���Ծ����ڲ��Թ����У�����ĳЩ�����׹�����߲����׻�ȡ�Ķ�����һ������Ķ����������Ա���ԵĲ��Է���
		AnswerGenerator answer = mock(AnswerGenerator.class);
		CompareNumber compare = mock( CompareNumber.class);
		
		//��������󱻵��õ�ʱ��ͨ������һ��ָ����ֵ
		when(answer.answerGenerator()).thenReturn("1234");
		//System.out.println(answer.answerGenerator());
		when(compare.compareNumber("1234", "1243")).thenReturn("2A2B");
		//System.out.println(compare.compareNumber("1234", "1243"));
		
		//AnswerGenerator answer = new AnswerGenerator();
		//CompareNumber compare = new CompareNumber();
		
		Guess guess = new Guess(answer, compare);	
		
		assertEquals(guess.guess("1243"),"2A2B");
	}
	
}

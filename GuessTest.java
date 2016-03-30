package com.guessNum;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class GuessTest {
	
	@Test
	public void return_correct_when_input_1243(){
		//mock测试就是在测试过程中，对于某些不容易构造或者不容易获取的对象，用一个虚拟的对象来创建以便测试的测试方法
		AnswerGenerator answer = mock(AnswerGenerator.class);
		CompareNumber compare = mock( CompareNumber.class);
		
		//当抽象对象被调用的时候，通常返回一个指定的值
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

package com.guessNum;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.CoreMatchers.is;

import java.util.Random;

//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class AnswerGeneratorTest {	
	
	@Test
	public void return_1234_when_input_12345(){
            //创建虚拟的random对象，random.nextInt(10)产生0-9的随机数
	    Random random = mock(Random.class);
	    //当调用方法时，Alternative, shorter version for consecutive stubbing:
            when(random.nextInt(10)).thenReturn(1,2,3,4,5);
            //System.out.println(random.nextInt(10));   
        
            AnswerGenerator answer = new AnswerGenerator(random);        
        
            String output = answer.answerGenerator();
        
            assertThat(output,is("1234"));
            //assertEquals(answer.answerGenerator(),"1234");
	}
	
	@Test
	public void return_1245_when_input_12245(){
		Radom random = mock(Random.class);
		when(random.nextInt(10)).thenReturn(1,2,2,4,5);
		AnswerGenerator answer = new AnswerGenerator(random);
		String output = answer.answerGenerator();
		assertThat(output,is("1245"));
	}
	
	
}

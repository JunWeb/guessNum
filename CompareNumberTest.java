package com.guessNum;


import static junit.framework.Assert.*;

import org.junit.Test;

import com.guessNum.CompareNumber;

public class CompareNumberTest {
	CompareNumber compare = new CompareNumber();
	
	@Test
	public void output_0A0B_when_input_different_number(){
		String result = compare.compareNumber("1234", "5678");
		assertEquals(result,"0A0B");

	}
	@Test
	public void output_4A0B_when_input_same_number(){
		String result = compare.compareNumber("1234", "1234");
		assertEquals(result,"4A0B");
	}
	@Test
	public void output_0A4B_when_input_differentposition_number(){
		String result = compare.compareNumber("1234", "4321");
		assertEquals(result,"0A4B");
	}
		
}

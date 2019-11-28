package com.testing.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleUtilTest {

	@Test
	public void testAdd()
	{
		System.out.println("Add");
		Integer a = 20;
		Integer b = 10;
		Integer expRes = 30;
		Integer result = SampleUtil.add(a, b);
		assertEquals(expRes, result);
		assertEquals(expRes, SampleUtil.add(15, 15));
		assertEquals(null, SampleUtil.add(null, 10));
		assertEquals(null, SampleUtil.add(null, null));
	}
	
	@Test
	public void testAdd1()
	{
		Integer a = 20;
		Integer b = 10;
		Integer expRes = 30;
		Integer result = SampleUtil.add(a, b);
		assertEquals(expRes, result);
	}
}

package com.ct.demo;

import org.junit.Assert;
import org.junit.Test;

import com.ct.demo.DemoCalculator;

public class DemoCalculatorTest {

	@Test
	public void test() {
		Assert.assertEquals(5, DemoCalculator.add(3, 2));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(6, DemoCalculator.multiply(3, 2));
	}

}

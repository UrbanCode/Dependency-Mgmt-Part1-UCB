package com.urbancode.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.urbancode.dependency.HelloWorldPrinter;

public class HelloWorldTest {
	@Test
	public void runTest() {
		assertEquals("Testing HelloWorld's output", "Hello World", HelloWorldPrinter.print());
	}
}

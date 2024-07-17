package com.junit;

import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemo {

	@Test
	void junitTest() {
		String name = "ritesh";
	}

	@Test
	void junitTest1() {
		String name = "patidar";
	}

	@BeforeClass
	static void beforeClass() {
		System.out.println("before class");
	}
}

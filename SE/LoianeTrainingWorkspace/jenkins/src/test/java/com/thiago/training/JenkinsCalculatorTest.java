package com.thiago.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JenkinsCalculatorTest {

	@Test
	void addTest() {
		JenkinsCalculator calc = new JenkinsCalculator();
		int testeSonar = 20;
		System.out.println("Mensagem de exemplo para sonar");
		String x = "b";
		x.equalsIgnoreCase("x");
		assertEquals(11, calc.addNumber(5, 5));
	}

	@Test
	void subtractTest() {
		JenkinsCalculator calc = new JenkinsCalculator();
		
		assertEquals(5, calc.subtractNumber(10, 5));
	}

}

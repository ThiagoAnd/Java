package com.healthycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class DietPlannerTest {
	
	private DietPlanner dietPlanner;
	
	//Trabalhando sem instanciar a classe DietPlanner, pois não é uma boa alternativa instanciar
	//Assim desse jeito é melhor que colocar new em cada uma delas, e colocar o new direto aqui em cima, pois torna os
	//metodos dependente uns dos outros
	//Essa função sera invocada antes de cada Unit test
	@BeforeEach
	void setup() {
		this.dietPlanner = new DietPlanner(20, 30, 50);
	}
	
	//O after each não é tão comum em ser usado, é mais utilizado em codigos complexos
	@AfterEach
	void afterEach() {
		//System.out.println("Um teste unitario foi finalizado");
	}

	//O nested é uma forma de organizar os testes por metodos
	@Nested
	class calculadoraTests {
		
		//Repetir o teste 10 vezes, util para algum numero randomico
		//@RepeatedTest(10)
		@RepeatedTest(value=10,name=RepeatedTest.LONG_DISPLAY_NAME)
		void should_ReturnCorrectDietPlan_When_CorrectCoder() {
			//given
			Coder coder = new Coder(1.82, 75.0, 26, Gender.MALE);
			DietPlan expected = new DietPlan(2202, 110, 73, 275);
			
			//when
			DietPlan actual = dietPlanner.calculateDiet(coder);
			//then
			
			assertAll(
					() -> assertEquals(expected.getCalories(), actual.getCalories()),
					() -> assertEquals(expected.getProtein(), actual.getProtein()),
					() -> assertEquals(expected.getFat(), actual.getFat()),
					() -> assertEquals(expected.getCarbohydrate(), actual.getCarbohydrate())
					
					
					);
		}
		
	}
	
	
	

}

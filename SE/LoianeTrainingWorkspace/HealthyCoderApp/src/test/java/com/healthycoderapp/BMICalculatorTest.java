package com.healthycoderapp;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class BMICalculatorTest {
	//Testando o before all
	//Ela executa um codigo uma vez, antes de todos os testes unitarios
	//É utilizado para funções custosas, como setar database ou iniciar um servidor
	@BeforeAll
	static void beforeAll() {
		//System.out.println("Before all unit tests");
	}
	
	//Utilizado para fechar conexão com database ou parar servidores
	@AfterAll
	static void afterAll() {
	//	System.out.println("After all unit tests");
		
	}

	// Coloque should e when no nome do metodo
	
	//Para trabalhar com varios parametros para testes(utilizado para testar e ter realmente a certeza, tsetando mais valores), é utilizado o parametized test
	//Se quiser mostrar de modo mais amigavel, coloque esses parametros no parameterized
	@ParameterizedTest(name="Peso={0},Altura={1}")
	//Depois de colocar o parameterized, colocamos o Valuesource, para começar a colocar valores a testar
	//@ValueSource(doubles = {89.0,95.0,110.0})
	//Depois utilize um parametro no metodo, que vai ser automaticamente injetado a cada rodada do teste
	//Para trabalhar com mais variaveis é utilizado o CsvSource ao inves do ValueSource que só pode fazer para uma variavel
	@CsvSource(value= {"89.0,1.72","95.0,1.75","110.0,1.78"})
	void should_ReturnTrue_When_DietRecommended(double coderWeight,double coderHeight) {
		// fail("Not yet implemented");
		// assertTrue passa no teste se voltar true
		// Para manter uma unidade de teste informativa, deve ser dividida em
		// Given = É a condição inicial , os input values
		//double peso = 89.0;
		double peso = coderWeight;
		double altura = coderHeight;
		// When = É onde invocamos o metodo de teste e normalmente guardamos o resultado
		// em uma variavel

		boolean recomendado = BMICalculator.isDietRecommended(peso, altura);
		// Then = É onde fica a afirmação
		assertTrue(recomendado);

	}

	// Devemos tambem escrever um teste para falso
	@Test
	void should_ReturnFalse_When_DietNotRecommended() {

		// give
		double peso = 50.0;
		double altura = 1.92;
		// when

		boolean recomendado = BMICalculator.isDietRecommended(peso, altura);
		// Then
		assertFalse(recomendado);

	}

	@Test
	void should_ThrowArithmeticException_When_AlturaZero() {

		// give
		double peso = 50.0;
		double altura = 0.0;

		// when = Para verificar throws, vc utiliza o Executable
		Executable executable = () -> BMICalculator.isDietRecommended(peso, altura);
		// Then
		assertThrows(ArithmeticException.class, executable);

	}

	@Test
	void should_ReturnCodeWithWorstBMI_When_CoderListNotEmpty() {

		// given
		List<Coder> coders = new ArrayList<Coder>();
		coders.add(new Coder(1.80, 60.0));
		coders.add(new Coder(1.82, 98.0));
		coders.add(new Coder(1.82, 64.7));

		// when
		Coder worstBMI = BMICalculator.findCoderWithWorstBMI(coders);

		// then = para checar igualdade é utilizado assertEquals aqui é colocado o valor
		// esperado, pela lista
		// ja da pra saber que é o segundo, então esperamos que apareça aqui
		// Para validar as duas ações é utilizado o assertAll, pois se a primeira
		// estiver errada, ele nunca vai ver a segunda
		//assertAll é utilizado para assertions que fazem sentido juntas
		assertAll(
				() -> assertEquals(1.82, worstBMI.getHeight()), 
				() -> assertEquals(98.0, worstBMI.getWeight())
				);

	}
	
	@Test
	void should_ReturnNullWorstBMI_When_CoderListIsEmpty() {

		// given
		List<Coder> coders = new ArrayList<Coder>();
	

		// when
		Coder worstBMI = BMICalculator.findCoderWithWorstBMI(coders);

		// then
		
		assertNull(worstBMI);

	}
	
	@Test
	void should_ReturnCorrectBMIScoreArray_When_CoderListNotEmpty() {

		// given
		List<Coder> coders = new ArrayList<Coder>();
		coders.add(new Coder(1.80, 60.0));
		coders.add(new Coder(1.82, 98.0));
		coders.add(new Coder(1.82, 64.7));
		
		//agora precisamos de um array de double de valores. Estes valores ja foram calculados
		double[] expected = {18.52,29.59,19.53};
	

		// when
		double[] bmiScores= BMICalculator.getBMIScores(coders);

		// then
		
		assertArrayEquals(expected, bmiScores);

	}
	
	

}

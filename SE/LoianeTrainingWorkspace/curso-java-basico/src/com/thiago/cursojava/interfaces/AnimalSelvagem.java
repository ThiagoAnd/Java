package com.thiago.cursojava.interfaces;

public interface AnimalSelvagem {
/* Toda interface é uma classe abstrata, é utilizada quando se quer fazer um 
 * contrato, quando é necessario utilizar mais de uma extensão de classe
 * como por exemplo: Classe Ave precisa ser Animal e AnimalSelvagem mas não
 * pode ter duas heranças, então usa interface  */
	
	void ataca();
}

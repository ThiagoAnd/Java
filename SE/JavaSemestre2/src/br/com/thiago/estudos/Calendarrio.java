package br.com.thiago.estudos;

import java.util.Calendar;

public class Calendarrio {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		System.out.println(hoje.getTime());
		System.out.println(hoje.get(Calendar.YEAR));
	}

}

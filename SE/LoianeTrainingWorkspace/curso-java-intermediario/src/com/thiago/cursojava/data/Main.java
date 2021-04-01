package com.thiago.cursojava.data;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GregorianCalendar data=new GregorianCalendar();
		
		//trabalhandocomdatas 
		
		int dia=data.get(data.DAY_OF_MONTH);
		int mes=data.get(data.MONTH)+1;
		int ano=data.get(data.YEAR);
		int hora=data.get(data.HOUR);
		int minuto=data.get(data.MINUTE);
		int segundo=data.get(data.SECOND);
		System.out.println("\nDATA ATUAL DO SISTEMA:"+dia+"/"+mes+"/"+ano); 
		System.out.println("\nHora:"+hora+":"+minuto+":"+segundo);

	}

}

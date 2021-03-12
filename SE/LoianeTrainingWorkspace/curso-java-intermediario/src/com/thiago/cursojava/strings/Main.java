package com.thiago.cursojava.strings;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		String email = "thiago@gmail.com";
		String domain = email.substring(email.indexOf('@')+1);
		System.out.println(domain);
		
		String st ;
		
		int x = 9 % 3;
		System.out.println(x);
		
		
		String[] oceans = {"Pacific","Southern","Atlantic","Indian","Arctic"};
		String s = "";
		
		for(int k = 0;k < oceans.length;k++) {
			s += oceans[k].charAt(k);
			System.out.println(s);
		}
		System.out.println("-------------");
		System.out.println(s);
	}

}

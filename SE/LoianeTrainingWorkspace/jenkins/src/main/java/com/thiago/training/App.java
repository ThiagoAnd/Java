package com.thiago.training;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public App() {
		System.out.println("test");
	}
	
	public void m1() {
		String s="";
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list =null;
		list.add(2);
		Object obj = getData();
	}
	
	public Object getData() {
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("iniciando");
		App app = new App();
		app.m1();

	}

}

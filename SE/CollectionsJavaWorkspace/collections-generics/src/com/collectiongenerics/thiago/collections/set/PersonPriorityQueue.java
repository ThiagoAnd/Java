package com.collectiongenerics.thiago.collections.set;

public class PersonPriorityQueue implements Comparable<PersonPriorityQueue>{

	private String name;
	private int age;

	public PersonPriorityQueue() {
		// TODO Auto-generated constructor stub
	}

	public PersonPriorityQueue(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person: " + this.name + " - " + this.age;
	}

	@Override
	public int compareTo(PersonPriorityQueue o) {
		
		return Integer.compare(this.age,o.getAge()); 
	}

}

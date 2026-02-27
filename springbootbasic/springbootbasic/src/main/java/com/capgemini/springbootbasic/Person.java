package com.capgemini.springbootbasic;

import java.util.List;

public class Person {
	private int id;
	private String name;
	
	private List<String> items;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}
	

	public Person(int id, String name, List<String> items) {
		super();
		this.id = id;
		this.name = name;
		this.items = items;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", items=" + items + "]";
	}
	
	

}

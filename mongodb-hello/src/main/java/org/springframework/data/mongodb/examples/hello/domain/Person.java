package org.springframework.data.mongodb.examples.hello.domain;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String id;
	
	private String name;
	
	private int age;
	
	private List<Account> accounts = new ArrayList<Account>();

	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age
				+ ", accounts=" + accounts + "]";
	}

}
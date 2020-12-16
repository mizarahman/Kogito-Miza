package org.acme;

import java.io.Serializable;
import org.acme.Account;

public class Current {

	private String name;
	private int age;

	public Current() {
		
	}

	public Current(String name, int age) {
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
		return "Current [name=" + name + ", age=" + age + "]";
	}

}

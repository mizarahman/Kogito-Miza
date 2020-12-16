package org.acme;

import java.io.Serializable;

public class Account {

	private String name;
	private int age;
	private int dqdays;
	private boolean delinquent;
	
	public Account() {	

	}

	public Account(String name, int age, int dqdays, boolean delinquent) {
		super();
		this.name = name;
		this.age = age;
		this.dqdays = dqdays;
		this.delinquent = delinquent;
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

	public int getDqdays() {
		return dqdays;
	}

	public void setDqdays(int dqdays) {
		this.dqdays = dqdays;
	}

	public boolean isDelinquent() {
		return delinquent;
	}

	public void setDelinquent(boolean delinquent) {
		this.delinquent = delinquent;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", age=" + age + ", dqdays=" + dqdays + ", delinquent=" + delinquent + "]";
	}

}

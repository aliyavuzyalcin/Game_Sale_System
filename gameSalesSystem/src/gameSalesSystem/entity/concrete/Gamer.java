package gameSalesSystem.entity.concrete;

import gameSalesSystem.entity.abstracts.Entity;

public class Gamer implements Entity {

	private int id;
	private String nationalIdentity;
	private String firstName;
	private String lastName;
	private int age;
	private long cardNumber;
	private String code;
	
	
	public Gamer(String nationalIdentity, String firstName, String lastName, int age, long cardNumber) {
		super();
		this.nationalIdentity = nationalIdentity;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.cardNumber = cardNumber;
	}


	public int getId() {
		int min = 111111111;
		int max = 999999999;
		id = (int) (Math.random()*(max - min + 1) + min);
		
		return id;		
	}

	public String getCode() {
		return this.lastName.substring(0, 3).toUpperCase() + getId();
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}


	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	
	
}

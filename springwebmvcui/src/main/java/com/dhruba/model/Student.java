package com.dhruba.model;

public class Student {
	
	private String name;
	private int age;
	private int id;
	private String password;
	private String address;
	private boolean male;
	private String[] favouriteFrameworks;
	private String gender;
	private int favouriteNumbers;
	public String country;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getFavouriteFrameworks() {
		return favouriteFrameworks;
	}
	public void setFavouriteFrameworks(String[] favouriteFrameworks) {
		this.favouriteFrameworks = favouriteFrameworks;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFavouriteNumbers() {
		return favouriteNumbers;
	}
	public void setFavouriteNumbers(int favouriteNumbers) {
		this.favouriteNumbers = favouriteNumbers;
	}
}

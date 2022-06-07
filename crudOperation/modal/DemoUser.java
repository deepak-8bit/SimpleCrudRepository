package com.demoBydeepak.crudOperation.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdemo")
public class DemoUser {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String name;
	private String address;
	private String city;
	
	
	public DemoUser(String name, String address, String city) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
	}
	
	public DemoUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DemoUser(int id, String name, String address, String city) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "DemoUser [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + "]";
	}
	

}

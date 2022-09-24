package com.spring.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_SYSTEM")
public class Employee {
	
	@Id
	private int id;
	private String fullname;
	private String jobTitle;
	private String phno;
	private String email;
	private String address;
	private String city;
	private String state;
	private String p_name;
	private String p_contact;
	private String p_relation;
	private String s_name;
	private String s_contact;
	private String s_relation;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullname=" + fullname + ", jobTitle=" + jobTitle + ", phno=" + phno
				+ ", email=" + email + ", address=" + address + ", city=" + city + ", state=" + state + ", p_name="
				+ p_name + ", p_contact=" + p_contact + ", p_relation=" + p_relation + ", s_name=" + s_name
				+ ", s_contact=" + s_contact + ", s_relation=" + s_relation + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_contact() {
		return p_contact;
	}
	public void setP_contact(String p_contact) {
		this.p_contact = p_contact;
	}
	public String getP_relation() {
		return p_relation;
	}
	public void setP_relation(String p_relation) {
		this.p_relation = p_relation;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_contact() {
		return s_contact;
	}
	public void setS_contact(String s_contact) {
		this.s_contact = s_contact;
	}
	public String getS_relation() {
		return s_relation;
	}
	public void setS_relation(String s_relation) {
		this.s_relation = s_relation;
	}
	
}

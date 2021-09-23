package com.technoelevate.springdemo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int conid;
	private String emailid;
	private String phoneno;
	
	@OneToMany(targetEntity = Address.class,cascade=CascadeType.ALL)
	@JoinColumn(name="ca_id",referencedColumnName="conid")
	private List<Address> address;
	
	public int getConid() {
		return conid;
	}
	public void setConid(int conid) {
		this.conid = conid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public Contact(int conid, String emailid, String phoneno) {
		super();
		this.conid = conid;
		this.emailid = emailid;
		this.phoneno = phoneno;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Contact [conid=" + conid + ", emailid=" + emailid + ", phoneno=" + phoneno + "]";
	}
	
	
}

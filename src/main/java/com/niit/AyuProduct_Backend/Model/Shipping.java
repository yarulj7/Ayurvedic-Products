package com.niit.AyuProduct_Backend.Model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Shipping")
@Component
public class Shipping 
{
	@Id
	  private String s_Id;
	  private String s_House_No;
	  private String s_Landmark;
	  private String country;
//	  private String email;
	  private String s_city;
	  private String state;
	  private String pincode;
	  
	  public Shipping()
	  {
	    	this.s_Id="SHIP"+UUID.randomUUID().toString().substring(30).toUpperCase();
	  }
public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	//	  private String mobile;
	public String getS_Id() {
		return s_Id;
	}
	public void setS_Id(String s_Id) {
		this.s_Id = s_Id;
	}
	public String getS_House_No() {
		return s_House_No;
	}
	public void setS_House_No(String s_House_No) {
		this.s_House_No = s_House_No;
	}
	public String getS_Landmark() {
		return s_Landmark;
	}
	public void setS_Landmark(String s_Landmark) {
		this.s_Landmark = s_Landmark;
	}
	public String getS_city() {
		return s_city;
	}
	public void setS_city(String s_city) {
		this.s_city = s_city;
	}
	  
}
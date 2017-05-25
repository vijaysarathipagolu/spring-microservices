/**
 * 
 */
package com.microservices.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * @author vijay
 *
 */

@Entity
public class User {

	
	@javax.persistence.Id 
	@GeneratedValue 
	String Id;
	String firstName;
	String lastName;
	String mobileNum;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
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
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
}

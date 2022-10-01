package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(length = 20)
	@NotBlank(message = "name must be supplied")
	private String userFirstName;
	@Column(length = 20)
	@NotBlank(message = "name must be supplied")
	private String userLastName;
	@Column(length = 20, unique = true)
	@NotBlank(message = "Email is required")
	@Email(message = "invalid email format")
	private String userEmail;
	private long userContact;
	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})")
	private String userPassword;
	@Enumerated(EnumType.STRING)
	private Role role;
	@JsonIgnoreProperties("user")
	@JsonIgnore
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<ComplaintArticle> complaintArticle = new ArrayList<ComplaintArticle>();
	
	@JsonIgnoreProperties("user")
	@JsonIgnore
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<ComplaintVehicle> complaintVehicle = new ArrayList<ComplaintVehicle>();

	public User() {
		System.out.println("in ctor of User" + getClass().getName());
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public long getUserContact() {
		return userContact;
	}

	public void setUserContact(long userContact) {
		this.userContact = userContact;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	

	public List<ComplaintArticle> getComplaintArticle() {
		return complaintArticle;
	}

	public void setComplaintArticle(List<ComplaintArticle> complaintArticle) {
		this.complaintArticle = complaintArticle;
	}
	
	
	public List<ComplaintVehicle> getComplaintVehicle() {
		return complaintVehicle;
	}

	public void setComplaintVehicle(List<ComplaintVehicle> complaintVehicle) {
		this.complaintVehicle = complaintVehicle;
	}

	//helper methods to add n remove complaintarticle
//	public void addComplaintArticle(ComplaintArticle ca) {
//		complaintArticle.add(ca);
//		ca.setUserA(this);
//	}
//	
//	public void removeComplaintArticle(ComplaintArticle ca) {
//		complaintArticle.remove(ca);
//		ca.setUserA(null);
//	}
	
	//helper methods to add n remove complaintvehicle
//	public void addComplaintVehicle(ComplaintVehicle cv) {
//		complaintVehicle.add(cv);
//		cv.setUserV(this);
//	}
//	
//	public void removeComplaintVehicle(ComplaintVehicle cv) {
//		complaintVehicle.remove(cv);
//		cv.setUserV(null);
//	}
	
	@Override
	public String toString() {
		return "User [userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userEmail=" + userEmail + ", userContact=" + userContact + ", userPassword=" + userPassword
				+ ", role=" + role + "]";
	}

}

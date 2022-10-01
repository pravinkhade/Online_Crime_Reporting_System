package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "police")
public class Police {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policeSrNumber;
	@Column(length = 10,unique = true)
	private int policeId;
	@Column(length = 20)
	@NotBlank(message ="name must be supplied")
	private String policeFirstName="abc";
	@Column(length = 20)
	@NotBlank(message ="name must be supplied")
	private String policeLastName="abc";
	@Column(length = 20,unique=true)
	@NotBlank(message ="Email is requried")
	@Email(message="Invalid email format")
	private String policeEmail;
	@Column(length = 10)
	private long policeContact;
	private String policeAddress;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate policeJoiningDate;
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private Status policeStatus;
	@Column(length = 20,nullable = false)
	@Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})")
	private String policePassword;
	@Enumerated(EnumType.STRING)
	private Post post;
	
	public Police() {
	
		System.out.println("in ctor of police "+getClass().getName());
	}

	public int getPoliceSrNumber() {
		return policeSrNumber;
	}

	public void setPoliceSrNumber(int policeSrNumber) {
		this.policeSrNumber = policeSrNumber;
	}

	public int getPoliceId() {
		return policeId;
	}

	public void setPoliceId(int policeId) {
		this.policeId = policeId;
	}

	public String getPoliceFirstName() {
		return policeFirstName;
	}

	public void setPoliceFirstName(String policeFirstName) {
		this.policeFirstName = policeFirstName;
	}

	public String getPoliceLastName() {
		return policeLastName;
	}

	public void setPoliceLastName(String policeLastName) {
		this.policeLastName = policeLastName;
	}

	public String getPoliceEmail() {
		return policeEmail;
	}

	public void setPoliceEmail(String policeEmail) {
		this.policeEmail = policeEmail;
	}

	

	public long getPoliceContact() {
		return policeContact;
	}

	public void setPoliceContact(long policeContact) {
		this.policeContact = policeContact;
	}

	public String getPoliceAddress() {
		return policeAddress;
	}

	public void setPoliceAddress(String policeAddress) {
		this.policeAddress = policeAddress;
	}

	public LocalDate getPoliceJoiningDate() {
		return policeJoiningDate;
	}

	public void setPoliceJoiningDate(LocalDate policeJoiningDate) {
		this.policeJoiningDate = policeJoiningDate;
	}

	public Status getPoliceStatus() {
		return policeStatus;
	}

	public void setPoliceStatus(Status policeStatus) {
		this.policeStatus = policeStatus;
	}

	public String getPolicePassword() {
		return policePassword;
	}

	public void setPolicePassword(String policePassword) {
		this.policePassword = policePassword;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Police [policeSrNumber=" + policeSrNumber + ", policeId=" + policeId + ", policeFirstName="
				+ policeFirstName + ", policeLastName=" + policeLastName + ", policeEmail=" + policeEmail
				+ ", policeContact=" + policeContact + ", policeAddress=" + policeAddress + ", policeJoiningDate="
				+ policeJoiningDate + ", policeStatus=" + policeStatus + ", policePassword=" + policePassword
				+ ", post=" + post + "]";
	}

		
		
}

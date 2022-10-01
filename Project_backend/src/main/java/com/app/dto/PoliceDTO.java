package com.app.dto;

import java.time.LocalDate;

import com.app.pojos.Post;
import com.app.pojos.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class PoliceDTO {
	private int polSrNumber;
	private int polId;
	private String polFirstName;
	private String polLastName;
	private String polEmail;
	private long polContact;
	private String polAddress;
	private LocalDate polJoiningDate;
	private Status polStatus;
	@JsonIgnore
	private String polPassword;
	private Post post;
	
	public PoliceDTO() {
	
	}

	public PoliceDTO(int polSrNumber, int polId, String polFirstName, String polLastName, String polEmail,
			long polContact, String polAddress, LocalDate polJoiningDate, Status polStatus, String polPassword,
			Post post) {
		super();
		this.polSrNumber = polSrNumber;
		this.polId = polId;
		this.polFirstName = polFirstName;
		this.polLastName = polLastName;
		this.polEmail = polEmail;
		this.polContact = polContact;
		this.polAddress = polAddress;
		this.polJoiningDate = polJoiningDate;
		this.polStatus = polStatus;
		this.polPassword = polPassword;
		this.post = post;
	}

	public int getPolSrNumber() {
		return polSrNumber;
	}

	public void setPolSrNumber(int polSrNumber) {
		this.polSrNumber = polSrNumber;
	}

	public int getPolId() {
		return polId;
	}

	public void setPolId(int polId) {
		this.polId = polId;
	}

	public String getPolFirstName() {
		return polFirstName;
	}

	public void setPolFirstName(String polFirstName) {
		this.polFirstName = polFirstName;
	}

	public String getPolLastName() {
		return polLastName;
	}

	public void setPolLastName(String polLastName) {
		this.polLastName = polLastName;
	}

	public String getPolEmail() {
		return polEmail;
	}

	public void setPolEmail(String polEmail) {
		this.polEmail = polEmail;
	}

	public long getPolContact() {
		return polContact;
	}

	public void setPolContact(long polContact) {
		this.polContact = polContact;
	}

	public String getPolAddress() {
		return polAddress;
	}

	public void setPolAddress(String polAddress) {
		this.polAddress = polAddress;
	}

	public LocalDate getPolJoiningDate() {
		return polJoiningDate;
	}

	public void setPolJoiningDate(LocalDate polJoiningDate) {
		this.polJoiningDate = polJoiningDate;
	}

	public Status getPolStatus() {
		return polStatus;
	}

	public void setPolStatus(Status polStatus) {
		this.polStatus = polStatus;
	}

	public String getPolPassword() {
		return polPassword;
	}

	public void setPolPassword(String polPassword) {
		this.polPassword = polPassword;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "PoliceDTO [polSrNumber=" + polSrNumber + ", polId=" + polId + ", polFirstName=" + polFirstName
				+ ", polLastName=" + polLastName + ", polEmail=" + polEmail + ", polContact=" + polContact
				+ ", polAddress=" + polAddress + ", polJoiningDate=" + polJoiningDate + ", polStatus=" + polStatus
				+ ", polPassword=" + polPassword + ", post=" + post + "]";
	}

	
		
}

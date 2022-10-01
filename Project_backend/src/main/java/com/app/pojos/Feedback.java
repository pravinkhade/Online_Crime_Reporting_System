package com.app.pojos;

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

@Entity
@Table(name = "feedback")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedbackSrNo;
	@Enumerated(EnumType.STRING)
	@Column(name = "feedback_type")
	private FeedbackType feedbackType;
	@Column(name = "Description")
	private String feedbackDescription;
	@Column(name = "first_name", length = 15)
	@NotBlank(message = "First name is requried")
	private String feedbackFirstName;
	@NotBlank(message = "last name is requried")
	@Column(name = "last_name", length = 15)
	private String feedbackLastName;
	@Column(name = "email")
	@NotBlank(message = "Email is requried")
	@Email(message = "Invalid email format")
	private String feedbackEmail;

	public Feedback() {

	}

	public int getFeedbackSrNo() {
		return feedbackSrNo;
	}

	public void setFeedbackSrNo(int feedbackSrNo) {
		this.feedbackSrNo = feedbackSrNo;
	}

	public FeedbackType getFeedbackType() {
		return feedbackType;
	}

	public void setFeedbackType(FeedbackType feedbackType) {
		this.feedbackType = feedbackType;
	}

	public String getFeedbackDescription() {
		return feedbackDescription;
	}

	public void setFeedbackDescription(String feedbackDescription) {
		this.feedbackDescription = feedbackDescription;
	}

	public String getFeedbackFirstName() {
		return feedbackFirstName;
	}

	public void setFeedbackFirstName(String feedbackFirstName) {
		this.feedbackFirstName = feedbackFirstName;
	}

	public String getFeedbackLastName() {
		return feedbackLastName;
	}

	public void setFeedbackLastName(String feedbackLastName) {
		this.feedbackLastName = feedbackLastName;
	}

	public String getFeedbackEmail() {
		return feedbackEmail;
	}

	public void setFeedbackEmail(String feedbackEmail) {
		this.feedbackEmail = feedbackEmail;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackSrNo=" + feedbackSrNo + ", feedbackType=" + feedbackType + ", feedbackDescription="
				+ feedbackDescription + ", feedbackFirstName=" + feedbackFirstName + ", feedbackLastName="
				+ feedbackLastName + ", feedbackEmail=" + feedbackEmail + "]";
	}

}

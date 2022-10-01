package com.app.dto;

import com.app.pojos.FeedbackType;

public class FeedbackDTO {
	private int feedbackSrNo;
	private FeedbackType feedbackType;
	private String feedbackDescription;
	private String feedbackFirstName;
	private String feedbackLastName;
	private String feedbackEmail;
	public FeedbackDTO(int feedbackSrNo, FeedbackType feedbackType, String feedbackDescription,
			String feedbackFirstName, String feedbackLastName, String feedbackEmail) {
		super();
		this.feedbackSrNo = feedbackSrNo;
		this.feedbackType = feedbackType;
		this.feedbackDescription = feedbackDescription;
		this.feedbackFirstName = feedbackFirstName;
		this.feedbackLastName = feedbackLastName;
		this.feedbackEmail = feedbackEmail;
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
		return "FeedbackDTO [feedbackSrNo=" + feedbackSrNo + ", feedbackType=" + feedbackType + ", feedbackDescription="
				+ feedbackDescription + ", feedbackFirstName=" + feedbackFirstName + ", feedbackLastName="
				+ feedbackLastName + ", feedbackEmail=" + feedbackEmail + "]";
	}
	
	
}

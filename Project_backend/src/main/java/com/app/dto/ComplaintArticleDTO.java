package com.app.dto;

import java.time.LocalDate;

import com.app.pojos.ArticleType;
import com.app.pojos.CompReportType;
import com.app.pojos.Status;

public class ComplaintArticleDTO {

	private int compArtId;
	private ArticleType articleType;
	private String compArtDescription;
	private String compName;
	private String compEmail;
	private long compContact;
	private String compAddress;
	private CompReportType compReportType;
	private LocalDate compDateTime;
	private String compArea;
	private String compDistrict;
	private String compState;
	private long compPincode;
	private Status status;
	public ComplaintArticleDTO(int compArtId, ArticleType articleType, String compArtDescription, String compName,
			String compEmail, long compContact, String compAddress, CompReportType compReportType,
			LocalDate compDateTime, String compArea, String compDistrict, String compState, long compPincode,
			Status status) {
		super();
		this.compArtId = compArtId;
		this.articleType = articleType;
		this.compArtDescription = compArtDescription;
		this.compName = compName;
		this.compEmail = compEmail;
		this.compContact = compContact;
		this.compAddress = compAddress;
		this.compReportType = compReportType;
		this.compDateTime = compDateTime;
		this.compArea = compArea;
		this.compDistrict = compDistrict;
		this.compState = compState;
		this.compPincode = compPincode;
		this.status = status;
	}
	public int getCompArtId() {
		return compArtId;
	}
	public void setCompArtId(int compArtId) {
		this.compArtId = compArtId;
	}
	public ArticleType getArticleType() {
		return articleType;
	}
	public void setArticleType(ArticleType articleType) {
		this.articleType = articleType;
	}
	public String getCompArtDescription() {
		return compArtDescription;
	}
	public void setCompArtDescription(String compArtDescription) {
		this.compArtDescription = compArtDescription;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompEmail() {
		return compEmail;
	}
	public void setCompEmail(String compEmail) {
		this.compEmail = compEmail;
	}
	public long getCompContact() {
		return compContact;
	}
	public void setCompContact(long compContact) {
		this.compContact = compContact;
	}
	public String getCompAddress() {
		return compAddress;
	}
	public void setCompAddress(String compAddress) {
		this.compAddress = compAddress;
	}
	public CompReportType getCompReportType() {
		return compReportType;
	}
	public void setCompReportType(CompReportType compReportType) {
		this.compReportType = compReportType;
	}
	public LocalDate getCompDateTime() {
		return compDateTime;
	}
	public void setCompDateTime(LocalDate compDateTime) {
		this.compDateTime = compDateTime;
	}
	public String getCompArea() {
		return compArea;
	}
	public void setCompArea(String compArea) {
		this.compArea = compArea;
	}
	public String getCompDistrict() {
		return compDistrict;
	}
	public void setCompDistrict(String compDistrict) {
		this.compDistrict = compDistrict;
	}
	public String getCompState() {
		return compState;
	}
	public void setCompState(String compState) {
		this.compState = compState;
	}
	public long getCompPincode() {
		return compPincode;
	}
	public void setCompPincode(long compPincode) {
		this.compPincode = compPincode;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ComplaintArticleDTO [compArtId=" + compArtId + ", articleType=" + articleType + ", compArtDescription="
				+ compArtDescription + ", compName=" + compName + ", compEmail=" + compEmail + ", compContact="
				+ compContact + ", compAddress=" + compAddress + ", compReportType=" + compReportType
				+ ", compDateTime=" + compDateTime + ", compArea=" + compArea + ", compDistrict=" + compDistrict
				+ ", compState=" + compState + ", compPincode=" + compPincode + ", status=" + status + "]";
	}
	
	

}

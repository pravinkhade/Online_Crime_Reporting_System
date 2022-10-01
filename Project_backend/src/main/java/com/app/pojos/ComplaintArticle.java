package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Complaint_article")
public class ComplaintArticle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int compArtId;
	@Enumerated(EnumType.STRING)
	private ArticleType articleType;
	private String compArtDescription;
	@Column(length = 20)
	private String compName;
	@Column(length = 20)
	private String compEmail;
	@Column(length = 20)
	private long compContact;
	private String compAddress;
	@Enumerated(EnumType.STRING)
	private CompReportType compReportType;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate compDateTime;
	@Column(length = 20)
	private String compArea;
	@Column(length = 20)
	private String compDistrict;
	@Column(length = 20)
	private String compState;
	@Column(length = 10)
	private long compPincode;
	@Enumerated(EnumType.STRING)
	private Status status;

	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonIgnoreProperties("complaintArticle")
	@JsonIgnore
	private User user;

	public ComplaintArticle() {
		// TODO Auto-generated constructor stub
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

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	@Override
	public String toString() {
		return "ComplaintArticle [compArtId=" + compArtId + ", articleType=" + articleType + ", compArtDescription="
				+ compArtDescription + ", compName=" + compName + ", compEmail=" + compEmail + ", compContact="
				+ compContact + ", compAddress=" + compAddress + ", compReportType=" + compReportType
				+ ", compDateTime=" + compDateTime + ", compArea=" + compArea + ", compDistrict=" + compDistrict
				+ ", compState=" + compState + ", compPincode=" + compPincode + ", status=" + status
				+ ", user="+ user + ""
						+ "]";
	}

	

}

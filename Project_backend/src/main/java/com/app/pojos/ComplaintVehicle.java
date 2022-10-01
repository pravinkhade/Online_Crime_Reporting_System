package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "complaint_vehicle")
public class ComplaintVehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int compVehicleId;
	@NotBlank(message = "vehicle number must be supplied")
	private String compVehicleNo;
	@Column(length = 15)
	private String compVehicleName;
	@Column(length = 15)
	private String compVehicleModel;
	private String compVehicleDescription;
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
	private CompStatus status;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonIgnoreProperties("complaintVehicle")
	@JsonIgnore
	private User user;
	public ComplaintVehicle() {
		// TODO Auto-generated constructor stub
	}

	public int getCompVehicleId() {
		return compVehicleId;
	}

	public void setCompVehicleId(int compVehicleId) {
		this.compVehicleId = compVehicleId;
	}

	public String getCompVehicleNo() {
		return compVehicleNo;
	}

	public void setCompVehicleNo(String compVehicleNo) {
		this.compVehicleNo = compVehicleNo;
	}

	public String getCompVehicleName() {
		return compVehicleName;
	}

	public void setCompVehicleName(String compVehicleName) {
		this.compVehicleName = compVehicleName;
	}

	public String getCompVehicleModel() {
		return compVehicleModel;
	}

	public void setCompVehicleModel(String compVehicleModel) {
		this.compVehicleModel = compVehicleModel;
	}

	public String getCompVehicleDescription() {
		return compVehicleDescription;
	}

	public void setCompVehicleDescription(String compVehicleDescription) {
		this.compVehicleDescription = compVehicleDescription;
	}
	

	public User getUser() {
		return user;
	}

	public void setUserV(User user) {
		this.user = user;
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

	public CompStatus getStatus() {
		return status;
	}

	public void setStatus(CompStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ComplaintVehicle [compVehicleId=" + compVehicleId + ", compVehicleNo=" + compVehicleNo
				+ ", compVehicleName=" + compVehicleName + ", compVehicleModel=" + compVehicleModel
				+ ", compVehicleDescription=" + compVehicleDescription + ", compName=" + compName + ", compEmail="
				+ compEmail + ", compContact=" + compContact + ", compAddress=" + compAddress + ", compReportType="
				+ compReportType + ", compDateTime=" + compDateTime + ", compArea=" + compArea + ", compDistrict="
				+ compDistrict + ", compState=" + compState + ", compPincode=" + compPincode + ", status=" + status
				//+ ", user=" + user 
				+ "]";
	}

	
	
}

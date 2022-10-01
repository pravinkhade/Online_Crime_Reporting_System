package com.app.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.app.pojos.CompReportType;
import com.app.pojos.Status;

public class ComplaintVehicleDTO {
	private int compVehicleId;
	private String compVehicleNo;
	private String compVehicleName;
	private String compVehicleModel;
	private String compVehicleDescription;
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

	public ComplaintVehicleDTO(int compVehicleId, String compVehicleNo, String compVehicleName, String compVehicleModel,
			String compVehicleDescription, String compName, String compEmail, long compContact, String compAddress,
			CompReportType compReportType, LocalDate compDateTime, String compArea, String compDistrict,
			String compState, long compPincode, Status status) {
		super();
		this.compVehicleId = compVehicleId;
		this.compVehicleNo = compVehicleNo;
		this.compVehicleName = compVehicleName;
		this.compVehicleModel = compVehicleModel;
		this.compVehicleDescription = compVehicleDescription;
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
		return "ComplaintVehicleDTO [compVehicleId=" + compVehicleId + ", compVehicleNo=" + compVehicleNo
				+ ", compVehicleName=" + compVehicleName + ", compVehicleModel=" + compVehicleModel
				+ ", compVehicleDescription=" + compVehicleDescription + ", compName=" + compName + ", compEmail="
				+ compEmail + ", compContact=" + compContact + ", compAddress=" + compAddress + ", compReportType="
				+ compReportType + ", compDateTime=" + compDateTime + ", compArea=" + compArea + ", compDistrict="
				+ compDistrict + ", compState=" + compState + ", compPincode=" + compPincode + ", status=" + status
				+ "]";
	}

}
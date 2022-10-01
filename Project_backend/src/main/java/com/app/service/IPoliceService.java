package com.app.service;

import java.util.List;

import com.app.dto.PoliceDTO;
import com.app.pojos.ComplaintVehicle;
import com.app.pojos.Police;
import com.app.pojos.User;

public interface IPoliceService {
	List<PoliceDTO> getAllPolice();
	//method for police login
	Police authenticatePolice(String email,String pwd);
	
	List<ComplaintVehicle> getVehicleComplaints();
	
	void updateComplaintStatus(int complaintId, String status);
	
	ComplaintVehicle getVehicleComplaint(int id);
}

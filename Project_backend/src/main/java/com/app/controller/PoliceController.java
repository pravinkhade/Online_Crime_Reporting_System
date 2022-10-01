package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LoginRequest;
import com.app.dto.ResponseDTO;
import com.app.service.IPoliceService;
@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/police")
public class PoliceController {
	//dependancy: service layer i/f
	@Autowired
	private IPoliceService policeService;
	
	public PoliceController() {
		System.out.println("in ctor of"+getClass().getName());
	}
	
	@GetMapping
	public ResponseDTO<?> getAllPolice(){
		System.out.println("in get all police");
		return new ResponseDTO<>(HttpStatus.OK,"fetching Police list successfully",policeService.getAllPolice());
	}
	
	@PostMapping("/signin")
	public ResponseEntity<?> authenticatePolice(@RequestBody LoginRequest request){
		System.out.println("in authentication "+request);
		return new ResponseEntity<>(
			policeService.authenticatePolice(request.getuserEmail(), request.getuserPassword()), HttpStatus.OK);
	}
	
	@GetMapping("/vehicle_complaints")
	public ResponseDTO<?> getAllComplaints(){
		System.out.println("in get all complaints");
		return new ResponseDTO<>(HttpStatus.OK,"fetching complaints successfully",policeService.getVehicleComplaints());
	}
	
	@GetMapping("/getVehicleComplaint")
	public ResponseDTO<?> getVehicleComplaint(int id){
		System.out.println("in get all complaints");
		return new ResponseDTO<>(HttpStatus.OK,"fetching complaints successfully",policeService.getVehicleComplaint(id));
	}
	
	@PutMapping("/update_complaint_status")
	public ResponseDTO<?> updateComplaintStatus(int complaintId, String status){
		System.out.println("updating complaint status");
		policeService.updateComplaintStatus(complaintId, status);
		return new ResponseDTO<>(HttpStatus.OK,"updated complaint status successfully",null);
	}
}

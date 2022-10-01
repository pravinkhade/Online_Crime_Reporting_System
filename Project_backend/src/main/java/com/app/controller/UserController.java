package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ComplaintArticleDTO;
import com.app.dto.ComplaintVehicleDTO;
import com.app.dto.FeedbackDTO;
import com.app.dto.LoginRequest;
import com.app.dto.ResponseDTO;
import com.app.dto.UserDTO;
import com.app.pojos.ComplaintArticle;
import com.app.pojos.ComplaintVehicle;
import com.app.pojos.Role;
import com.app.service.IUserService;
@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {
	//dependancy: service layer i/f
	@Autowired
	private IUserService userService;
	
	public UserController() {
		System.out.println("in ctor of"+getClass().getName());
	}
	
	
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest request){
		System.out.println("in authentication "+request);
		return new ResponseEntity<>(
			userService.authenticateUser(request.getuserEmail(), request.getuserPassword()), HttpStatus.OK);
	}
	
	//REST handling method to add new user
	@PostMapping("/signup")
	public ResponseDTO<?> addUserDetails(@RequestBody UserDTO userDTO) {
		System.out.println("in add user details" + userDTO);
		userDTO.setRole(Role.USER);
		return new ResponseDTO<>(HttpStatus.OK, "User details added", userService.addUserDetails(userDTO));
	}
	
	@PostMapping("/feedback")
	public ResponseDTO<?> addFeedback(@RequestBody FeedbackDTO feedbackDTO) {
	
		System.out.println("in feedback "+feedbackDTO);
		return new ResponseDTO<>(HttpStatus.OK,"Feedback added", userService.addFeedback(feedbackDTO));
	}	
	
	@PostMapping("/complaintarticle")
	public ResponseDTO<?> addCompArticle(@RequestBody ComplaintArticleDTO complaintArticleDTO){
		System.out.println("in add complaint article"+complaintArticleDTO.toString());
		return new ResponseDTO<>(HttpStatus.OK,"complaint article added",userService.addCompArticle(complaintArticleDTO));
	}
	
	@GetMapping("/viewcomplaint")
	public List<ComplaintArticle> getAllCompArticle() {
		return userService.getAllCompArticle();
	}
	
	@PostMapping("/complaintvehicle")
	public ResponseDTO<?> addCompVehicle(@RequestBody ComplaintVehicleDTO complaintVehicleDTO){
		System.out.println("in add complaint vehicle"+complaintVehicleDTO);
		return new ResponseDTO<>(HttpStatus.OK,"complaint vehicle added",userService.addCompVehicle(complaintVehicleDTO));
	}
	
	@GetMapping("/viewcompVehicle")
	public List<ComplaintVehicle> getAllCompVehicle() {
		return userService.getAllCompVehicle();
	}
}

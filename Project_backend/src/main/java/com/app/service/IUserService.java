package com.app.service;

import java.util.List;

import com.app.dto.ComplaintArticleDTO;
import com.app.dto.ComplaintVehicleDTO;
import com.app.dto.FeedbackDTO;
import com.app.dto.UserDTO;
import com.app.pojos.ComplaintArticle;
import com.app.pojos.ComplaintVehicle;
import com.app.pojos.Feedback;
import com.app.pojos.User;

public interface IUserService {
	User authenticateUser(String email,String pwd);
	
	User addUserDetails(UserDTO user);
	
	Feedback addFeedback(FeedbackDTO feedback);
	
	ComplaintArticle addCompArticle(ComplaintArticleDTO complaintArticle);
	
	public List<ComplaintArticle> getAllCompArticle();
	
	ComplaintVehicle addCompVehicle(ComplaintVehicleDTO complaintVehicle);
	
	public List<ComplaintVehicle> getAllCompVehicle();
	}

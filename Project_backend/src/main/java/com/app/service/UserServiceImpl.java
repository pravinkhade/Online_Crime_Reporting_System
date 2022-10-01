package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excs.UserHandlingException;
import com.app.dao.CompArticleRepository;
import com.app.dao.CompVehicleRepository;
import com.app.dao.FeedbackRepository;
import com.app.dao.UserRepository;
import com.app.dto.ComplaintArticleDTO;
import com.app.dto.ComplaintVehicleDTO;
import com.app.dto.FeedbackDTO;
import com.app.dto.UserDTO;
import com.app.pojos.CompStatus;
import com.app.pojos.ComplaintArticle;
import com.app.pojos.ComplaintVehicle;
import com.app.pojos.Feedback;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	// dependancy : DAO layer
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private FeedbackRepository feedbackRepo;
	@Autowired
	private CompArticleRepository compArticleRepo;
	@Autowired
	private CompVehicleRepository compVehicleRepo;

	@Override
	public User authenticateUser(String userEmail, String userPassword) {

		return userRepo.validateUser(userEmail, userPassword).orElseThrow(() -> new UserHandlingException("Invalid Credentials!"));
	}

	@Override
	public User addUserDetails(UserDTO userDTO) {
		// JSON representation of UserDTO will be sent from front end --> back end-->
				// Rest Controller(unmarshelling) --> service layer
				// copy state of UserDTo --> User Entity
				//API of o.s.beans.BeanUtils
		User u = new User();
		BeanUtils.copyProperties(userDTO, u);
		System.out.println("add user: "+userDTO);
		System.out.println(u);
		//invikedao's method for persistance
		return userRepo.save(u);
		
	}//returns detatched pojo reference to the caller

	@Override
	public Feedback addFeedback(FeedbackDTO feedbackDTO) {
		Feedback fb = new Feedback();
		BeanUtils.copyProperties(feedbackDTO, fb);
		System.out.println("add feedback: "+feedbackDTO);
		System.out.println(fb);
		return feedbackRepo.save(fb);
	}

	@Override
	public ComplaintArticle addCompArticle(ComplaintArticleDTO complaintArticleDTO) {
		ComplaintArticle compArt = new ComplaintArticle();
		BeanUtils.copyProperties(complaintArticleDTO, compArt);
		System.out.println("add complaint article: "+complaintArticleDTO);
		System.out.println(compArt);
		return compArticleRepo.save(compArt);
	}

	@Override
	public List<ComplaintArticle> getAllCompArticle() {
		List<ComplaintArticle> complaints = new ArrayList<>();
		compArticleRepo.findAll().forEach(complaints::add);
		return complaints;
	}
	
	@Override
	public ComplaintVehicle addCompVehicle(ComplaintVehicleDTO complaintVehicleDTO) {
		ComplaintVehicle compVeh = new ComplaintVehicle();
		BeanUtils.copyProperties(complaintVehicleDTO, compVeh);
		compVeh.setStatus(CompStatus.NOT_YET_STARTED);
		System.out.println("add compalint vehicle"+complaintVehicleDTO);
		System.out.println(compVeh);
		return compVehicleRepo.save(compVeh);
	}
	
	@Override
	public List<ComplaintVehicle> getAllCompVehicle() {
		List<ComplaintVehicle> comp = new ArrayList<>();
		compVehicleRepo.findAll().forEach(comp::add);
		return comp;
	}
}

package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excs.PoliceHandlingException;
import com.app.dao.CompVehicleRepository;
import com.app.dao.PoliceRepository;
import com.app.dto.PoliceDTO;
import com.app.pojos.CompStatus;
import com.app.pojos.ComplaintArticle;
import com.app.pojos.ComplaintVehicle;
import com.app.pojos.Police;

@Service
@Transactional
public class PoliceServiceImpl implements IPoliceService{
	//dependancy : DAO layer
	@Autowired
	private PoliceRepository policeRepo;
	@Autowired
	private CompVehicleRepository compVehicleRepository;
	
	
	@Override
	public List<PoliceDTO> getAllPolice() {
		List<PoliceDTO> list = new ArrayList<>();
		for(Police p: policeRepo.findAll()) {
			PoliceDTO policeDTO = new PoliceDTO(p.getPoliceSrNumber(), p.getPoliceId(), p.getPoliceFirstName(), 
					p.getPoliceLastName(), p.getPoliceEmail(), p.getPoliceContact(), p.getPoliceAddress(),
					p.getPoliceJoiningDate()	,p.getPoliceStatus(), p.getPolicePassword(), p.getPost());
			//BeanUtils.copyProperties(u, userDTO,"pwd");
			
			list.add(policeDTO);
		}
		System.out.println("dto list"+list);
		return list;
	}


	@Override
	public Police authenticatePolice(String email, String pwd) {
		
		return policeRepo.findByPoliceEmailAndPolicePassword(email, pwd).orElseThrow(()-> new PoliceHandlingException("invalid Credentials!"));
	}
	
	@Override
	public List<ComplaintVehicle> getVehicleComplaints() {
		return compVehicleRepository.findAll();
	}
	
	@Override
	public ComplaintVehicle getVehicleComplaint(int id) {
		return compVehicleRepository.findById(id).orElseThrow(()-> new PoliceHandlingException("invalid Credentials!"));
	}
	
	@Override
	public void updateComplaintStatus(int complaintId, String status) {
		ComplaintVehicle complaintVehicle = compVehicleRepository.findById(complaintId).orElseThrow(()-> new PoliceHandlingException("invalid Credentials!"));
		complaintVehicle.setStatus(CompStatus.valueOf(status));
		compVehicleRepository.save(complaintVehicle);
	}
	
	
	

}

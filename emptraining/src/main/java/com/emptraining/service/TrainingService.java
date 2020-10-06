package com.emptraining.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emptraining.entity.TrainingEntity;
import com.emptraining.model.TrainingModel;
import com.emptraining.repository.TrainingRepository;

@Service
public class TrainingService {
	
	
	@Autowired
	public TrainingRepository tr;
	
	public void AddCourse(TrainingEntity ten)
	{
		TrainingModel tmodel = new TrainingModel();
		 tmodel.setCourseCode(ten.getCourseCode());
		 tmodel.setCourseName(ten.getCourseName());
		 tmodel.setDate(ten.getDate());
		 tmodel.setHours(ten.getHours());
		 tmodel.setScore(ten.getScore());
		 tmodel.setStatus(ten.getStatus());
		 tr.saveAndFlush(tmodel);
			
	}
	
	public Iterable<TrainingModel> showTrainings()
	{
		return tr.findAll();
	}
	
	public void removeTraining(int code)
	{
		TrainingModel tmodel = new TrainingModel();
		tr.deleteById(code);
		tr.save(tmodel);
		
		
	}
	
	public TrainingModel findbyId(int id)
	{
		Optional<TrainingModel> optional = this.tr.findById(id);
		return optional.get();
		
		
	}
	
	
	

}

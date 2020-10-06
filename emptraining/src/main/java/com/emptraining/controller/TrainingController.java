package com.emptraining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.emptraining.entity.TrainingEntity;
import com.emptraining.model.TrainingModel;
import com.emptraining.repository.TrainingRepository;
import com.emptraining.service.TrainingService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
//@RequestMapping("/training")
@Api(value=".TrainingController , Rest Apis that deal with Trainig DTO")
public class TrainingController {
	
	@Autowired
	public TrainingService ts;
	
	@PostMapping("/addTraining")
	@ApiOperation(value = "Add Training to TrainingData ", response =  TrainingEntity.class , tags = "addTraining")
	@ApiResponses(value = {@ApiResponse(code = 200 , message = "Added the Training Successfully"),
			@ApiResponse(code = 404 , message = "Training could not be added")
	})
	public String addTraining(@RequestBody TrainingEntity ten)
	{
		ts.AddCourse(ten);
		return "Training with Code " + ten.getCourseCode() + "added successfully";
		
	}
	
	@RequestMapping("/training")
	@ApiOperation(value = "Show Training Details ", response =  TrainingEntity.class , tags = "training")
	@ApiResponses(value = {@ApiResponse(code = 200 , message = "Viewed the Trainings successfully"),
			@ApiResponse(code = 404 , message = "Training could not be viewed")
	})
	public Iterable<TrainingModel> showTrainings(){
		return ts.showTrainings();
	}
	
	@DeleteMapping("/deleteTraining")
	@ApiOperation(value = "Delete a Specific Training ", response =  TrainingEntity.class , tags = "deleteTrainings")
	@ApiResponses(value = {@ApiResponse(code = 200 , message = "Deleted the Trainings successfully"),
			@ApiResponse(code = 404 , message = "Training could not be deleted")
	})
	public String deleteTraining(@RequestBody TrainingEntity ten)
	{
		ts.removeTraining(ten.getCourseCode());
		return "Employee with Course Code " + ten.getCourseCode() + "is removed Successfully";
	}
	
	@GetMapping("/showTrainings/{id}")
	@ApiOperation(value = "Show Training Details with specific Course COde ", response =  TrainingEntity.class , tags = "showTrainings/{id}")
	@ApiResponses(value = {@ApiResponse(code = 200 , message = "Viewed the Trainings successfully"),
			@ApiResponse(code = 404 , message = "Training could not be viewed")
	})
	public ResponseEntity<TrainingModel> findbyId(@PathVariable int id)
	{
		return ResponseEntity.ok().body(ts.findbyId(id));
	}

	
	
	
	
	
}

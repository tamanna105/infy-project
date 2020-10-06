package com.emptraining.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emptraining.model.TrainingModel;


@Repository
public interface TrainingRepository extends JpaRepository<TrainingModel , Integer > {

}

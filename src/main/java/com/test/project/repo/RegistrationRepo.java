package com.test.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.project.model.RegistrationModel;

@Repository
public interface RegistrationRepo extends JpaRepository<RegistrationModel, Integer> {

	RegistrationModel findByEmlId(String emailId);

}

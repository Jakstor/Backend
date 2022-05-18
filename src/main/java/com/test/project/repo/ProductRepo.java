package com.test.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.project.model.ProductModel;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel, Integer> {

}

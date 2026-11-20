package com.swati.spring_data_rest_demo.repo;

//Mocking as a DataBase

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swati.spring_data_rest_demo.model.JobPost;

@Repository 
public interface JobRepo extends JpaRepository<JobPost, Integer> {

        List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
        
}
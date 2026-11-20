package com.swati.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swati.JobApp.model.JobPost;
import com.swati.JobApp.repo.JobRepo;

//Helps to provide service like helps in sending and getting data from repo layer
@Service 
public class JobService {

    @Autowired 
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
}

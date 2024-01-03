package com.suresh.microservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suresh.microservice.model.Rate;
import com.suresh.microservice.repository.RateRepository;

@Service
public class RateServiceImpl {
	
	@Autowired
    private RateRepository repository;

    public Rate getRateByType(String type) {
        return repository.findByType(type);
    }

}

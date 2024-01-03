package com.suresh.microservice.repository;

import org.springframework.stereotype.Repository;

import com.suresh.microservice.model.Rate;

@Repository
public class RateRepository {

	public Rate findByType(String type) {
		return Rate.builder().id(1).type("PERSONAL").rateValue(10.0).build();
	}

}

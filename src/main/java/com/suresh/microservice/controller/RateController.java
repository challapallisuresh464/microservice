package com.suresh.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.microservice.model.Rate;
import com.suresh.microservice.serviceImpl.RateServiceImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/v1/api/rates")
@Tag(name="Rate Controller")
public class RateController {
	
	    @Autowired
	    private RateServiceImpl rateService;

	    @GetMapping(path = "/rates/{type}")
	    @Operation(summary = "fetch rates", description = "fetch rates based on type")
	    @ApiResponse(responseCode = "200", description = "successful")
	    public ResponseEntity<Rate> getRateByType(@PathVariable("type") String type) {
	        return ResponseEntity.ok().body(rateService.getRateByType(type));
	    }

}

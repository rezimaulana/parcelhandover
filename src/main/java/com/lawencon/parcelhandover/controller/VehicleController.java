package com.lawencon.parcelhandover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.vehicle.VehicleInsertReqDto;
import com.lawencon.parcelhandover.service.VehicleService;

@RestController
@RequestMapping("vehicles")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping
	public ResponseEntity<TransactionResDto<InsertResDto>> insert(@RequestBody final VehicleInsertReqDto data){
		final TransactionResDto<InsertResDto> result = vehicleService.insert(data);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}

}

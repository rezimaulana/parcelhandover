package com.lawencon.parcelhandover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lawencon.parcelhandover.dto.response.DataListResDto;
import com.lawencon.parcelhandover.dto.response.DataResDto;
import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.vehicle.VehicleDataDto;
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
	
	
	
	@GetMapping
	public ResponseEntity<DataResDto<VehicleDataDto>> getById(@RequestParam(required = true) final String id){
		final DataResDto<VehicleDataDto> result = vehicleService.getById(id);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("data")
	public ResponseEntity<DataListResDto<VehicleDataDto>> getAll(@RequestParam(required = true) final Integer page,
			@RequestParam(required = true) final Integer limit) {
		final DataListResDto<VehicleDataDto> result = vehicleService.getAll(page, limit);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}

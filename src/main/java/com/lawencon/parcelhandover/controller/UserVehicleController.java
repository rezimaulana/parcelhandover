package com.lawencon.parcelhandover.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lawencon.parcelhandover.dto.response.DataListResDto;
import com.lawencon.parcelhandover.dto.response.DataResDto;
import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.response.UpdateResDto;
import com.lawencon.parcelhandover.dto.uservehicle.UserVehicleDataDto;
import com.lawencon.parcelhandover.dto.uservehicle.UserVehicleInsertReqDto;
import com.lawencon.parcelhandover.dto.uservehicle.UserVehicleUpdateReqDto;
import com.lawencon.parcelhandover.service.UserVehicleService;

@RestController
@RequestMapping("user-vehicle")
public class UserVehicleController {
    
    @Autowired
	private UserVehicleService userVehicleService;
	
	@PostMapping
	public ResponseEntity<TransactionResDto<InsertResDto>> insert(@RequestBody @Valid final DataListResDto<UserVehicleInsertReqDto> data){
		final TransactionResDto<InsertResDto> result = userVehicleService.insert(data);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<TransactionResDto<UpdateResDto>> update(@RequestBody @Valid final UserVehicleUpdateReqDto data){
		final TransactionResDto<UpdateResDto> result = userVehicleService.update(data);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<DataResDto<UserVehicleDataDto>> getById(@RequestParam(required = true) final String id){
		final DataResDto<UserVehicleDataDto> result = userVehicleService.getById(id);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("data")
	public ResponseEntity<DataListResDto<UserVehicleDataDto>> getAll(@RequestParam(required = true) final Integer page,
			@RequestParam(required = true) final Integer limit) {
		final DataListResDto<UserVehicleDataDto> result = userVehicleService.getAll(page, limit);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}

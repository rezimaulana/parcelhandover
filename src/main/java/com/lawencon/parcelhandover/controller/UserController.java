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
import com.lawencon.parcelhandover.dto.user.UserDataDto;
import com.lawencon.parcelhandover.dto.user.UserInsertReqDto;
import com.lawencon.parcelhandover.dto.user.UserUpdateReqDto;
import com.lawencon.parcelhandover.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
    
    @Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<TransactionResDto<InsertResDto>> insert(@RequestBody @Valid final UserInsertReqDto data){
		final TransactionResDto<InsertResDto> result = userService.insert(data);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<TransactionResDto<UpdateResDto>> update(@RequestBody @Valid final UserUpdateReqDto data){
		final TransactionResDto<UpdateResDto> result = userService.update(data);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<DataResDto<UserDataDto>> getById(@RequestParam(required = true) final String id){
		final DataResDto<UserDataDto> result = userService.getById(id);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("data")
	public ResponseEntity<DataListResDto<UserDataDto>> getAll(@RequestParam(required = true) final Integer page,
			@RequestParam(required = true) final Integer limit) {
		final DataListResDto<UserDataDto> result = userService.getAll(page, limit);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}

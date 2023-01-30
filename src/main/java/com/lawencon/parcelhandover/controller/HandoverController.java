package com.lawencon.parcelhandover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lawencon.parcelhandover.dto.handover.HandoverDataDto;
import com.lawencon.parcelhandover.dto.handover.HandoverInsertReqDto;
import com.lawencon.parcelhandover.dto.handover.HandoverUpdateReqDto;
import com.lawencon.parcelhandover.dto.response.DataListResDto;
import com.lawencon.parcelhandover.dto.response.DataResDto;
import com.lawencon.parcelhandover.dto.response.DeleteResDto;
import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.response.UpdateResDto;
import com.lawencon.parcelhandover.service.HandoverService;

@RestController
@RequestMapping("handover")
public class HandoverController {
    
    @Autowired
	private HandoverService handoverService;
	
	@PostMapping
	public ResponseEntity<TransactionResDto<InsertResDto>> insert(@RequestBody final HandoverInsertReqDto data){
        System.out.println(data.getArrivalTime());
		final TransactionResDto<InsertResDto> result = handoverService.insert(data);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}

    @PutMapping
	public ResponseEntity<TransactionResDto<UpdateResDto>> update(@RequestBody final HandoverUpdateReqDto data){
		final TransactionResDto<UpdateResDto> result = handoverService.update(data);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

    @GetMapping
	public ResponseEntity<DataResDto<HandoverDataDto>> getById(@RequestParam(required = true) final String id){
		final DataResDto<HandoverDataDto> result = handoverService.getById(id);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("data")
	public ResponseEntity<DataListResDto<HandoverDataDto>> getAll(@RequestParam(required = true) final Integer page,
			@RequestParam(required = true) final Integer limit) {
		final DataListResDto<HandoverDataDto> result = handoverService.getAll(page, limit);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

    @DeleteMapping
	public ResponseEntity<TransactionResDto<DeleteResDto>> delete(@RequestParam(required = true) final String id) {
		final TransactionResDto<DeleteResDto> result = handoverService.deleteById(id);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}

package com.lawencon.parcelhandover.controller;

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
import com.lawencon.parcelhandover.dto.warehouse.WarehouseDataDto;
import com.lawencon.parcelhandover.dto.warehouse.WarehouseInsertReqDto;
import com.lawencon.parcelhandover.dto.warehouse.WarehouseUpdateReqDto;
import com.lawencon.parcelhandover.service.WarehouseService;

@RestController
@RequestMapping("warehouses")
public class WarehouseController {
    
    @Autowired
	private WarehouseService warehouseService;
	
	@PostMapping
	public ResponseEntity<TransactionResDto<InsertResDto>> insert(@RequestBody final WarehouseInsertReqDto data){
		final TransactionResDto<InsertResDto> result = warehouseService.insert(data);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<TransactionResDto<UpdateResDto>> update(@RequestBody final WarehouseUpdateReqDto data){
		final TransactionResDto<UpdateResDto> result = warehouseService.update(data);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<DataResDto<WarehouseDataDto>> getById(@RequestParam(required = true) final String id){
		final DataResDto<WarehouseDataDto> result = warehouseService.getById(id);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("data")
	public ResponseEntity<DataListResDto<WarehouseDataDto>> getAll(@RequestParam(required = true) final Integer page,
			@RequestParam(required = true) final Integer limit) {
		final DataListResDto<WarehouseDataDto> result = warehouseService.getAll(page, limit);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}

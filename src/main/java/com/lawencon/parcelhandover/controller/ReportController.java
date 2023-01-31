package com.lawencon.parcelhandover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lawencon.parcelhandover.dto.handover.HandoverDataDto;
import com.lawencon.parcelhandover.dto.response.ReportResDto;
import com.lawencon.parcelhandover.service.ReportService;

@RestController
@RequestMapping("reports")
public class ReportController {
    
    @Autowired
    private ReportService reportService;

    @GetMapping
	public ResponseEntity<ReportResDto<HandoverDataDto>> getById(@RequestParam(required = true) final String startDate,
        @RequestParam(required = true) final String endDate){
		final ReportResDto<HandoverDataDto> result = reportService.summaryInOut(startDate, endDate);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}

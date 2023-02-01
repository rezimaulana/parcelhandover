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

    @GetMapping("summary")
	public ResponseEntity<ReportResDto<HandoverDataDto>> summaryInOut(@RequestParam(required = true) final String startDate,
        @RequestParam(required = true) final String endDate){
		final ReportResDto<HandoverDataDto> result = reportService.summaryInOut(startDate, endDate);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

    @GetMapping("summary/warehouse")
	public ResponseEntity<ReportResDto<HandoverDataDto>> summaryInOutWh(@RequestParam(required = true) final String startDate,
        @RequestParam(required = true) final String endDate,  @RequestParam(required = true) final String warehouseCode){
		final ReportResDto<HandoverDataDto> result = reportService.summaryInOutWh(startDate, endDate, warehouseCode);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

    @GetMapping("summary/driver")
	public ResponseEntity<ReportResDto<HandoverDataDto>> summaryInOutDriver(@RequestParam(required = true) final String startDate,
        @RequestParam(required = true) final String endDate,  @RequestParam(required = true) final String userCode){
		final ReportResDto<HandoverDataDto> result = reportService.summaryInOutDriver(startDate, endDate, userCode);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

    @GetMapping("sorting")
	public ResponseEntity<ReportResDto<HandoverDataDto>> sortingAvgInOut(@RequestParam(required = true) final String startDate,
        @RequestParam(required = true) final String endDate){
		final ReportResDto<HandoverDataDto> result = reportService.sortingAvgInOut(startDate, endDate);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("sorting/warehouse")
	public ResponseEntity<ReportResDto<HandoverDataDto>> sortingAvgInOutWh(@RequestParam(required = true) final String startDate,
        @RequestParam(required = true) final String endDate, @RequestParam(required = true) final String warehouseCode){
		final ReportResDto<HandoverDataDto> result = reportService.sortingAvgInOutWh(startDate, endDate, warehouseCode);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("sorting/driver")
	public ResponseEntity<ReportResDto<HandoverDataDto>> sortingAvgInOutDriver(@RequestParam(required = true) final String startDate,
        @RequestParam(required = true) final String endDate, @RequestParam(required = true) final String userCode){
		final ReportResDto<HandoverDataDto> result = reportService.sortingAvgInOutDriver(startDate, endDate, userCode);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}

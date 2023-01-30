package com.lawencon.parcelhandover.service;

import com.lawencon.parcelhandover.dto.handover.HandoverDataDto;
import com.lawencon.parcelhandover.dto.handover.HandoverInsertReqDto;
import com.lawencon.parcelhandover.dto.handover.HandoverUpdateReqDto;
import com.lawencon.parcelhandover.dto.response.DataListResDto;
import com.lawencon.parcelhandover.dto.response.DataResDto;
import com.lawencon.parcelhandover.dto.response.DeleteResDto;
import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.response.UpdateResDto;

public interface HandoverService {
    
    public TransactionResDto<InsertResDto> insert(HandoverInsertReqDto data);

    public TransactionResDto<UpdateResDto> update(HandoverUpdateReqDto data);

    public DataResDto<HandoverDataDto> getById(String id);

    public DataListResDto<HandoverDataDto> getAll(Integer page, Integer limit);

    public TransactionResDto<DeleteResDto> deleteById(String id);

}

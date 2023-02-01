package com.lawencon.parcelhandover.service;

import com.lawencon.parcelhandover.dto.response.DataListResDto;
import com.lawencon.parcelhandover.dto.response.DataResDto;
import com.lawencon.parcelhandover.dto.response.InsertResDto;
import com.lawencon.parcelhandover.dto.response.TransactionResDto;
import com.lawencon.parcelhandover.dto.response.UpdateResDto;
import com.lawencon.parcelhandover.dto.user.UserDataDto;
import com.lawencon.parcelhandover.dto.user.UserInsertReqDto;
import com.lawencon.parcelhandover.dto.user.UserUpdateReqDto;
import com.lawencon.parcelhandover.model.User;

public interface UserService {
    
    public TransactionResDto<InsertResDto> insert(UserInsertReqDto data);

    public TransactionResDto<UpdateResDto> update(UserUpdateReqDto data);

    public DataResDto<UserDataDto> getById(String id);

    public DataListResDto<UserDataDto> getAll(Integer page, Integer limit);

    public UserDataDto setToDto(User data);

}

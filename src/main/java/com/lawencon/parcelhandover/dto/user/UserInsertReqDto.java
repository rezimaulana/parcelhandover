package com.lawencon.parcelhandover.dto.user;

import javax.validation.constraints.NotBlank;

public class UserInsertReqDto {
    
    @NotBlank
    private String code;
    @NotBlank
    private String fullname;
    @NotBlank
    private String role;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

}

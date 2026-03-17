package com.ccc.admin.dto;

import java.util.Date;

public class AdminCompanyListDTO {

    private int userNumber;
    private String userId;
    private int companyNumber;
    private String companyName;
    private Date userJoinDate;
    private String companyState;

    public AdminCompanyListDTO() {}

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(int companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getUserJoinDate() {
        return userJoinDate;
    }

    public void setUserJoinDate(Date userJoinDate) {
        this.userJoinDate = userJoinDate;
    }

    public String getCompanyState() {
        return companyState;
    }

    public void setCompanyState(String companyState) {
        this.companyState = companyState;
    }
}
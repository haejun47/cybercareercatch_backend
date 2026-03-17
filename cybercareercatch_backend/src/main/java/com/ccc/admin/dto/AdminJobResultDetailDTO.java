package com.ccc.admin.dto;

import java.util.Date;

public class AdminJobResultDetailDTO {

    private int jobResultNumber;
    private int userNumber;
    private String userName;
    private String userId;
    private String jobResultStatus;
    private String jobName;
    private Date jobResultCreatedDate;
    private Date jobResultConfirmDate;
    private int jobQuestionNumber;
    private String jobQuestionContentSnapshot;
    private String answerContent;

    public AdminJobResultDetailDTO() {}

    public int getJobResultNumber() {
        return jobResultNumber;
    }

    public void setJobResultNumber(int jobResultNumber) {
        this.jobResultNumber = jobResultNumber;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getJobResultStatus() {
        return jobResultStatus;
    }

    public void setJobResultStatus(String jobResultStatus) {
        this.jobResultStatus = jobResultStatus;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Date getJobResultCreatedDate() {
        return jobResultCreatedDate;
    }

    public void setJobResultCreatedDate(Date jobResultCreatedDate) {
        this.jobResultCreatedDate = jobResultCreatedDate;
    }

    public Date getJobResultConfirmDate() {
        return jobResultConfirmDate;
    }

    public void setJobResultConfirmDate(Date jobResultConfirmDate) {
        this.jobResultConfirmDate = jobResultConfirmDate;
    }

    public int getJobQuestionNumber() {
        return jobQuestionNumber;
    }

    public void setJobQuestionNumber(int jobQuestionNumber) {
        this.jobQuestionNumber = jobQuestionNumber;
    }

    public String getJobQuestionContentSnapshot() {
        return jobQuestionContentSnapshot;
    }

    public void setJobQuestionContentSnapshot(String jobQuestionContentSnapshot) {
        this.jobQuestionContentSnapshot = jobQuestionContentSnapshot;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }
}
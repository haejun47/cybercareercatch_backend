package com.ccc.job.dto;

public class JobRecommendQuestionDTO {

    private int jobQuestionNumber;
    private String jobQuestionContent;

    public JobRecommendQuestionDTO() {}

    public int getJobQuestionNumber() {
        return jobQuestionNumber;
    }

    public void setJobQuestionNumber(int jobQuestionNumber) {
        this.jobQuestionNumber = jobQuestionNumber;
    }

    public String getJobQuestionContent() {
        return jobQuestionContent;
    }

    public void setJobQuestionContent(String jobQuestionContent) {
        this.jobQuestionContent = jobQuestionContent;
    }
}
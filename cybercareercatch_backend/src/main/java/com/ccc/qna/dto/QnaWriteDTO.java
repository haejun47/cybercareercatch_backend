package com.ccc.qna.dto;

public class QnaWriteDTO {
<<<<<<< HEAD
   private Long postNumber;
   private Long userNumber;
   private Long companyNumber;
   private String postTitle;
   private String postContent;
   private String postType;
   private String answerStatus;

   public QnaWriteDTO() {;}

   public Long getPostNumber() {
      return postNumber;
   }

   public void setPostNumber(Long postNumber) {
      this.postNumber = postNumber;
   }

   public Long getUserNumber() {
      return userNumber;
   }

   public void setUserNumber(Long userNumber) {
      this.userNumber = userNumber;
   }

   public Long getCompanyNumber() {
      return companyNumber;
   }

   public void setCompanyNumber(Long companyNumber) {
      this.companyNumber = companyNumber;
   }
=======
	private Integer postNumber;
	private Integer userNumber;
	private Integer companyNumber;
	private String postTitle;
	private String postContent;
	private String postType;
	private String answerStatus;

	public Integer getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(Integer postNumber) {
		this.postNumber = postNumber;
	}

	public Integer getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(Integer userNumber) {
		this.userNumber = userNumber;
	}

	public Integer getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(Integer companyNumber) {
		this.companyNumber = companyNumber;
	}
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)

   public String getPostTitle() {
      return postTitle;
   }

   public void setPostTitle(String postTitle) {
      this.postTitle = postTitle;
   }

   public String getPostContent() {
      return postContent;
   }

   public void setPostContent(String postContent) {
      this.postContent = postContent;
   }

   public String getPostType() {
      return postType;
   }

   public void setPostType(String postType) {
      this.postType = postType;
   }

   public String getAnswerStatus() {
      return answerStatus;
   }

<<<<<<< HEAD
   public void setAnswerStatus(String answerStatus) {
      this.answerStatus = answerStatus;
   }

   @Override
   public String toString() {
      return "QnaWriteDTO [postNumber=" + postNumber + ", userNumber=" + userNumber + ", companyNumber="
            + companyNumber + ", postTitle=" + postTitle + ", postContent=" + postContent + ", postType="
            + postType + ", answerStatus=" + answerStatus + "]";
   }
=======
	public void setAnswerStatus(String answerStatus) {
		this.answerStatus = answerStatus;
	}
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)
}
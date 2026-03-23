package com.ccc.qna.dto;

public class QnaDetailDTO {
<<<<<<< HEAD
   private Long postNumber;
   private String postTitle;
   private String postContent;
   private String memberId;
   private String postCreatedDate;
   private String answerStatus;
   private String companyName;
   
   public QnaDetailDTO() {;}
=======
	private Long postNumber;
	private Long userNumber;
	private Long companyNumber;
	private String postTitle;
	private String postContent;
	private String memberId;
	private String userId;
	private String postCreatedDate;
	private String postDate;
	private int viewCount;
	private String answerStatus;
	private String companyName;
	
	public QnaDetailDTO() {;}
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)

   public Long getPostNumber() {
      return postNumber;
   }

   public void setPostNumber(Long postNumber) {
      this.postNumber = postNumber;
   }

<<<<<<< HEAD
   public String getPostTitle() {
      return postTitle;
   }
=======
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

	public String getPostTitle() {
		return postTitle;
	}
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)

   public void setPostTitle(String postTitle) {
      this.postTitle = postTitle;
   }

   public String getPostContent() {
      return postContent;
   }

   public void setPostContent(String postContent) {
      this.postContent = postContent;
   }

   public String getMemberId() {
      return memberId;
   }

<<<<<<< HEAD
   public void setMemberId(String memberId) {
      this.memberId = memberId;
   }
=======
	public void setMemberId(String memberId) {
		this.memberId = memberId;
		this.userId = memberId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		this.memberId = userId;
	}
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)

   public String getPostCreatedDate() {
      return postCreatedDate;
   }

<<<<<<< HEAD
   public void setPostCreatedDate(String postCreatedDate) {
      this.postCreatedDate = postCreatedDate;
   }
=======
	public void setPostCreatedDate(String postCreatedDate) {
		this.postCreatedDate = postCreatedDate;
		this.postDate = postCreatedDate;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
		this.postCreatedDate = postDate;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)

   public String getAnswerStatus() {
      return answerStatus;
   }

   public void setAnswerStatus(String answerStatus) {
      this.answerStatus = answerStatus;
   }

   public String getCompanyName() {
      return companyName;
   }

   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

<<<<<<< HEAD
   @Override
   public String toString() {
      return "QnaDetailDTO [postNumber=" + postNumber + ", postTitle=" + postTitle + ", postContent=" + postContent
            + ", memberId=" + memberId + ", postCreatedDate=" + postCreatedDate + ", answerStatus=" + answerStatus
            + ", companyName=" + companyName + "]";
   }
=======
	@Override
	public String toString() {
		return "QnaDetailDTO [postNumber=" + postNumber + ", userNumber=" + userNumber + ", companyNumber="
				+ companyNumber + ", postTitle=" + postTitle + ", postContent=" + postContent + ", userId=" + userId
				+ ", postDate=" + postDate + ", viewCount=" + viewCount + ", answerStatus=" + answerStatus
				+ ", companyName=" + companyName + "]";
	}
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)
}
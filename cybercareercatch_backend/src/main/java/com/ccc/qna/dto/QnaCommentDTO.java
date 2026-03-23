package com.ccc.qna.dto;

public class QnaCommentDTO {
<<<<<<< HEAD
   private Long commentNumber;
   private Long postNumber;
   private Long userNumber;
   private String memberId;
   private String commentContent;
   private String commentCreatedDate;

   
   public QnaCommentDTO() {;}

   public Long getCommentNumber() {
      return commentNumber;
   }

   public void setCommentNumber(Long commentNumber) {
      this.commentNumber = commentNumber;
   }

   public Long getPostNumber() {
      return postNumber;
   }

   public void setPostNumber(Long postNumber) {
      this.postNumber = postNumber;
   }

   public Long getUserNumber() {
      return userNumber;
   }

   public void setUserNumber(Long i) {
      this.userNumber = i;
   }
=======
	private Integer commentNumber;
	private Integer postNumber;
	private Integer userNumber;
	private String memberId;
	private String commentContent;
	private String commentCreatedDate;

	public Integer getCommentNumber() {
		return commentNumber;
	}

	public void setCommentNumber(Integer commentNumber) {
		this.commentNumber = commentNumber;
	}

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
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)

   public String getMemberId() {
      return memberId;
   }

   public void setMemberId(String memberId) {
      this.memberId = memberId;
   }

   public String getCommentContent() {
      return commentContent;
   }

   public void setCommentContent(String commentContent) {
      this.commentContent = commentContent;
   }

   public String getCommentCreatedDate() {
      return commentCreatedDate;
   }

   public void setCommentCreatedDate(String commentCreatedDate) {
      this.commentCreatedDate = commentCreatedDate;
   }
}
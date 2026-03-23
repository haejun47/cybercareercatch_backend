package com.ccc.qna.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ccc.common.Execute;
import com.ccc.common.Result;
import com.ccc.qna.dao.QnaDAO;
import com.ccc.qna.dto.QnaWriteDTO;

public class QnaWriteController implements Execute {

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

<<<<<<< HEAD
      QnaDAO qnaDAO = new QnaDAO();
      Result result = new Result();
=======
		QnaDAO qnaDAO = new QnaDAO();
		Result result = new Result();
		HttpSession session = request.getSession(false);

		if (session == null || session.getAttribute("userNumber") == null) {
			result.setPath(request.getContextPath() + "/member/login.mefc");
			result.setRedirect(true);
			return result;
		}

		String userType = (String) session.getAttribute("userType");
		Integer userNumber = (Integer) session.getAttribute("userNumber");

		if (!"일반회원".equals(userType) || userNumber == null) {
			result.setPath(request.getContextPath() + "/qna/list.qfc");
			result.setRedirect(true);
			return result;
		}
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)

      String postTitle = request.getParameter("postTitle");
      String postContent = request.getParameter("postContent");
      String companyNumberStr = request.getParameter("companyNumber");

<<<<<<< HEAD
      System.out.println("게시글 등록 요청");
      System.out.println("postTitle : " + postTitle);
      System.out.println("postContent : " + postContent);
      System.out.println("companyNumberStr : " + companyNumberStr);

      if(postTitle == null || postTitle.trim().isEmpty()
            || postContent == null || postContent.trim().isEmpty()
            || companyNumberStr == null || companyNumberStr.trim().isEmpty()) {
         result.setPath(request.getContextPath() + "/app/main/qna/add-qna.jsp");
         result.setRedirect(true);
         return result;
      }

      Long companyNumber = Long.parseLong(companyNumberStr);

      QnaWriteDTO qnaWriteDTO = new QnaWriteDTO();

      // 로그인 없이 테스트용 고정 회원번호
      qnaWriteDTO.setUserNumber(1L);

      qnaWriteDTO.setCompanyNumber(companyNumber);
      qnaWriteDTO.setPostTitle(postTitle.trim());
      qnaWriteDTO.setPostContent(postContent.trim());
      qnaWriteDTO.setPostType("QNA_POST");
      qnaWriteDTO.setAnswerStatus("답변대기");
=======
		if (postTitle == null || postTitle.trim().isEmpty()
				|| postContent == null || postContent.trim().isEmpty()
				|| companyNumberStr == null || companyNumberStr.trim().isEmpty()) {
			result.setPath(request.getContextPath() + "/qna/write-form.qfc");
			result.setRedirect(true);
			return result;
		}

		postTitle = postTitle.trim();
		companyNumberStr = companyNumberStr.trim();

		int titleLength = postTitle.length();
		int contentLength = postContent.length();

		if (titleLength < 10 || titleLength > 100) {
			result.setPath(request.getContextPath() + "/qna/write-form.qfc");
			result.setRedirect(true);
			return result;
		}

		if (postContent.trim().isEmpty() || contentLength < 10 || contentLength > 1000) {
			result.setPath(request.getContextPath() + "/qna/write-form.qfc");
			result.setRedirect(true);
			return result;
		}

		int companyNumber = 0;

		try {
			companyNumber = Integer.parseInt(companyNumberStr);
		} catch (NumberFormatException e) {
			result.setPath(request.getContextPath() + "/qna/write-form.qfc");
			result.setRedirect(true);
			return result;
		}

		QnaWriteDTO qnaWriteDTO = new QnaWriteDTO();
		qnaWriteDTO.setUserNumber(userNumber);
		qnaWriteDTO.setCompanyNumber(companyNumber);
		qnaWriteDTO.setPostTitle(postTitle);
		qnaWriteDTO.setPostContent(postContent);
		qnaWriteDTO.setPostType("QNA_POST");
		qnaWriteDTO.setAnswerStatus("답변대기");
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)

      qnaDAO.insertQna(qnaWriteDTO);

<<<<<<< HEAD
      Long postNumber = qnaDAO.selectLastPostNumber();

      result.setPath(request.getContextPath() + "/qna/detail.qfc?postNumber=" + postNumber);
      result.setRedirect(true);

      return result;
   }
=======
		int postNumber = qnaDAO.selectLastPostNumber();

		result.setPath(request.getContextPath() + "/qna/detail.qfc?postNumber=" + postNumber);
		result.setRedirect(true);
		return result;
	}
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)
}
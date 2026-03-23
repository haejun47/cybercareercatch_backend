package com.ccc.qna.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ccc.common.Execute;
import com.ccc.common.Result;
import com.ccc.qna.dao.QnaDAO;
import com.ccc.qna.dto.QnaDetailDTO;

public class QnaDeleteController implements Execute {

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

      QnaDAO qnaDAO = new QnaDAO();
      Result result = new Result();

<<<<<<< HEAD
      String postNumberStr = request.getParameter("postNumber");

      System.out.println("게시글 삭제 요청 들어옴");
      System.out.println("postNumberStr : " + postNumberStr);
=======
		HttpSession session = request.getSession(false);

		if (session == null || session.getAttribute("userNumber") == null) {
			result.setPath(request.getContextPath() + "/member/login.mefc");
			result.setRedirect(true);
			return result;
		}

		Integer userNumber = (Integer) session.getAttribute("userNumber");
		String userType = (String) session.getAttribute("userType");

		String postNumberStr = request.getParameter("postNumber");
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)

      if (postNumberStr == null || postNumberStr.trim().isEmpty()) {
         result.setPath(request.getContextPath() + "/qna/list.qfc");
         result.setRedirect(true);
         return result;
      }

<<<<<<< HEAD
      Long postNumber = Long.parseLong(postNumberStr);

      // 1. 해당 게시글의 댓글 전체 삭제
      qnaDAO.deleteCommentsByPostNumber(postNumber);

      // 2. 게시글 삭제
      qnaDAO.deleteQna(postNumber);

      // 3. 목록으로 이동
      result.setPath(request.getContextPath() + "/qna/list.qfc");
      result.setRedirect(true);

      return result;
   }
=======
		int postNumber = 0;

		try {
			postNumber = Integer.parseInt(postNumberStr);
		} catch (NumberFormatException e) {
			result.setPath(request.getContextPath() + "/qna/list.qfc");
			result.setRedirect(true);
			return result;
		}

		QnaDetailDTO qna = qnaDAO.selectQnaDetail(postNumber);

		if (qna == null) {
			result.setPath(request.getContextPath() + "/qna/list.qfc");
			result.setRedirect(true);
			return result;
		}

		if (!"일반회원".equals(userType)
				|| userNumber == null
				|| qna.getUserNumber() == null
				|| qna.getUserNumber().intValue() != userNumber.intValue()) {
			result.setPath(request.getContextPath() + "/qna/detail.qfc?postNumber=" + postNumber);
			result.setRedirect(true);
			return result;
		}

		qnaDAO.deleteCommentsByPostNumber(postNumber);
		qnaDAO.deleteQna(postNumber);

		result.setPath(request.getContextPath() + "/qna/list.qfc");
		result.setRedirect(true);
		return result;
	}
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)
}
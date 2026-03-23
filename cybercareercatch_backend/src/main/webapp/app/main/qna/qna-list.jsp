<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="loginRequired" value="${empty requestScope.userNumber}" />
<c:set var="showCompanyDropdown" value="${requestScope.isMemberUser}" />
<c:set var="showWriteButton" value="${requestScope.isMemberUser}" />
<c:set var="isCompanyMember" value="${requestScope.isCompanyUser}" />
<c:set var="loginCompanyNumber" value="${requestScope.companyNumber}" />

<!DOCTYPE html>
<html lang="ko">
<head>
<<<<<<< HEAD
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>CyberCareerCatch - 기업 QnA 목록</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main/qna/qna-list.css?v=20260320" />
=======
  <meta charset="UTF-8">
  <title>기업 Q&A</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main/qna/qna-list.css">
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)
</head>
<body>
<<<<<<< HEAD
    <header></header>

    <main class="qna-list-main">
        <div class="qna-list-top">
            <h2 class="qna-list-title">기업 QnA</h2>
            <div class="qna-list-top-actions">
<a href="${pageContext.request.contextPath}/qna/write-form.qfc"
   class="qna-list-search-btn qna-list-search-btn-write">글쓰기</a>
            </div>
        </div>

        <!-- 기업 선택 form -->
        <form action="${pageContext.request.contextPath}/qna/list.qfc" method="get">
            <div class="qna-list-filter">
                <select class="qna-list-filter-sel"
                        name="companyNumber"
                        id="companyFilter"
                        onchange="this.form.submit()">
                    <option value="">기업선택</option>
                    <c:forEach var="company" items="${companyList}">
                        <option value="${company.companyNumber}"
                            ${companyNumber eq company.companyNumber.toString() ? 'selected' : ''}>
                            ${company.companyName}
                        </option>
                    </c:forEach>
                </select>
            </div>
        </form>

        <div class="qna-list-tbl">
            <div class="qna-list-tbl-row qna-list-tbl-header">
                <div class="qna-list-tbl-num">번호</div>
                <div class="qna-list-tbl-title">제목</div>
                <div class="qna-list-tbl-company">작성자</div>
                <div class="qna-list-tbl-date">작성일</div>
                <div class="qna-list-tbl-status">답변상태</div>
            </div>

            <div id="qna-tbl-body">
                <c:choose>
                    <c:when test="${not empty qnaList}">
                        <c:forEach var="post" items="${qnaList}">
                            <div class="qna-list-tbl-row" onclick="openPost(${post.postNumber})">
                                <div class="qna-list-tbl-num">${post.postNumber}</div>
                                <div class="qna-list-tbl-title">${post.postTitle}</div>
                                <div class="qna-list-tbl-company">${post.memberId}</div>
                                <div class="qna-list-tbl-date">${post.postCreatedDate}</div>
                                <div class="qna-list-tbl-status">
                                    <c:choose>
                                        <c:when test="${post.answerStatus eq '답변완료'}">
                                            <span class="qna-status qna-status-done">답변완료</span>
                                        </c:when>
                                        <c:otherwise>
                                            <span class="qna-status qna-status-wait">답변대기</span>
                                        </c:otherwise>
                                    </c:choose>
                                </div>
                            </div>
                        </c:forEach>
                    </c:when>
                    <c:otherwise>
                        <div class="qna-list-empty">검색 결과가 없습니다.</div>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>

        <!-- 제목/작성자 검색 form -->
        <form action="${pageContext.request.contextPath}/qna/list.qfc" method="get" class="qna-list-search">
            <select class="qna-list-search-sel" name="searchType">
                <option value="title" ${searchType eq 'title' ? 'selected' : ''}>제목</option>
                <option value="writer" ${searchType eq 'writer' ? 'selected' : ''}>작성자</option>
            </select>

            <input
                class="qna-list-search-inp"
                type="text"
                name="searchKeyword"
                placeholder="검색할 내용을 입력하세요"
                value="${searchKeyword}"
            />

            <button class="qna-list-search-btn" type="submit">검색</button>
        </form>
    </main>

    <script>
        const contextPath = "${pageContext.request.contextPath}";
    </script>
    <script src="${pageContext.request.contextPath}/assets/js/main/qna/qna-list.js"></script>
=======

  <jsp:include page="/app/main/header/header-logout.jsp" />

  <div id="qnaListPage"
       data-login-required="${loginRequired}"
       data-login-message="기업 Q&A는 로그인 후 이용 가능합니다."
       data-login-url="${pageContext.request.contextPath}/member/login.mefc"></div>

  <c:if test="${not loginRequired}">
    <div class="qnl-wrap">

      <div class="qnl-top">
        <h2 class="qnl-top-ttl">기업 Q&A</h2>
      </div>

      <div class="qnl-head">
        <div class="qnl-head-col-num">번호</div>
        <div class="qnl-head-col-ttl">제목</div>
        <div class="qnl-head-col-company">기업명</div>
        <div class="qnl-head-col-date">작성일</div>
        <div class="qnl-head-col-view">조회수</div>
        <div class="qnl-head-col-state">답변상태</div>
      </div>

      <div class="qnl-list">

        <c:if test="${not empty latestQnaNotice}">
          <div class="qnl-row qnl-row-notice">
            <div class="qnl-row-col-num">공지</div>

            <div class="qnl-row-col-ttl">
              <a class="qnl-link"
                 href="${pageContext.request.contextPath}/qna/detail.qfc?postNumber=${latestQnaNotice.postNumber}">
                <c:out value="${latestQnaNotice.postTitle}" />
              </a>
            </div>

            <div class="qnl-row-col-company">관리자</div>
            <div class="qnl-row-col-date"><c:out value="${latestQnaNotice.postDate}" /></div>
            <div class="qnl-row-col-view"><c:out value="${latestQnaNotice.viewCount}" /></div>
            <div class="qnl-row-col-state">-</div>
          </div>
        </c:if>

        <c:choose>
          <c:when test="${not empty qnaList}">
            <c:forEach var="qna" items="${qnaList}" varStatus="status">
              <div class="qnl-row js-qna-row"
                   data-detail-url="${pageContext.request.contextPath}/qna/detail.qfc?postNumber=${qna.postNumber}">
                <div class="qnl-row-col-num">
                  <c:out value="${listStartNumber - status.index}" />
                </div>

                <div class="qnl-row-col-ttl">
                  <a class="qnl-link js-qna-link"
                     href="${pageContext.request.contextPath}/qna/detail.qfc?postNumber=${qna.postNumber}">
                    <c:out value="${qna.postTitle}" />
                  </a>
                </div>

                <div class="qnl-row-col-company">
                  <c:out value="${qna.companyName}" />
                </div>

                <div class="qnl-row-col-date">
                  <c:out value="${qna.postDate}" />
                </div>

                <div class="qnl-row-col-view">
                  <c:out value="${qna.viewCount}" />
                </div>

                <div class="qnl-row-col-state">
                  <c:choose>
                    <c:when test="${qna.answerStatus eq '답변완료'}">
                      <span class="qnl-state-done">답변완료</span>
                    </c:when>
                    <c:otherwise>
                      <span class="qnl-state-wait">답변대기</span>
                    </c:otherwise>
                  </c:choose>
                </div>
              </div>
            </c:forEach>
          </c:when>

          <c:otherwise>
            <div class="qnl-row">
              <div class="qnl-row-col-empty">등록된 게시글이 없습니다.</div>
            </div>
          </c:otherwise>
        </c:choose>
      </div>

      <c:if test="${realEnd > 0}">
        <div class="qnl-pg">

          <c:if test="${startPage > 1}">
            <a class="qnl-pg-btn"
               href="${pageContext.request.contextPath}/qna/list.qfc?page=${startPage - 1}&searchType=${searchType}&searchKeyword=${searchKeyword}&companyNumber=${companyNumber}">
              &lt;
            </a>
          </c:if>

          <c:forEach var="i" begin="${startPage}" end="${endPage}">
            <c:choose>
              <c:when test="${i eq page}">
                <a class="qnl-pg-btn qnl-pg-btn-now"
                   href="${pageContext.request.contextPath}/qna/list.qfc?page=${i}&searchType=${searchType}&searchKeyword=${searchKeyword}&companyNumber=${companyNumber}">
                  <c:out value="${i}" />
                </a>
              </c:when>
              <c:otherwise>
                <a class="qnl-pg-btn"
                   href="${pageContext.request.contextPath}/qna/list.qfc?page=${i}&searchType=${searchType}&searchKeyword=${searchKeyword}&companyNumber=${companyNumber}">
                  <c:out value="${i}" />
                </a>
              </c:otherwise>
            </c:choose>
          </c:forEach>

          <c:if test="${endPage < realEnd}">
            <a class="qnl-pg-btn"
               href="${pageContext.request.contextPath}/qna/list.qfc?page=${endPage + 1}&searchType=${searchType}&searchKeyword=${searchKeyword}&companyNumber=${companyNumber}">
              &gt;
            </a>
          </c:if>
        </div>
      </c:if>

      <div class="qnl-sch">
        <form action="${pageContext.request.contextPath}/qna/list.qfc" method="get" class="qnl-sch-form">

          <c:if test="${showCompanyDropdown}">
            <select name="companyNumber" class="qnl-company-sel">
              <option value="">전체 기업</option>

              <c:forEach var="company" items="${companyList}">
                <c:choose>
                  <c:when test="${companyNumber ne null and companyNumber eq company.companyNumber.toString()}">
                    <option value="${company.companyNumber}" selected="selected">
                      <c:out value="${company.companyName}" />
                    </option>
                  </c:when>
                  <c:otherwise>
                    <option value="${company.companyNumber}">
                      <c:out value="${company.companyName}" />
                    </option>
                  </c:otherwise>
                </c:choose>
              </c:forEach>
            </select>
          </c:if>

          <c:if test="${isCompanyMember}">
            <input type="hidden" name="companyNumber" value="${loginCompanyNumber}" />
          </c:if>

          <select name="searchType" class="qnl-sel">
            <c:choose>
              <c:when test="${searchType eq 'writer'}">
                <option value="title">제목</option>
                <option value="writer" selected="selected">작성자</option>
              </c:when>
              <c:otherwise>
                <option value="title" selected="selected">제목</option>
                <option value="writer">작성자</option>
              </c:otherwise>
            </c:choose>
          </select>

          <input type="text"
                 name="searchKeyword"
                 class="qnl-inp"
                 value="${searchKeyword}"
                 placeholder="검색어를 입력하세요" />

          <button type="submit" class="qnl-btn">검색</button>
        </form>

        <c:if test="${showWriteButton}">
          <a href="${pageContext.request.contextPath}/qna/write-form.qfc" class="qnl-write-btn">글쓰기</a>
        </c:if>
      </div>

    </div>
  </c:if>

  <script src="${pageContext.request.contextPath}/assets/js/main/qna/qna-list.js"></script>
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)
</body>
</html>
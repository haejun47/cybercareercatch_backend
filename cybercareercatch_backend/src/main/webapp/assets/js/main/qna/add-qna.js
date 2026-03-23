<<<<<<< HEAD
const form = document.querySelector(".qna-write-form");

if (form) {
    form.addEventListener("submit", function (e) {
        const companyNumber = document.getElementById("companyNumber").value.trim();
        const postTitle = document.getElementById("postTitle").value.trim();
        const postContent = document.getElementById("postContent").value.trim();

        if (!companyNumber) {
            alert("기업을 선택하세요.");
            e.preventDefault();
            return;
        }

        if (!postTitle) {
            alert("제목을 입력하세요.");
            e.preventDefault();
            return;
        }

        if (!postContent) {
            alert("내용을 입력하세요.");
            e.preventDefault();
            return;
        }
    });
=======
/*
기업 QnA 글쓰기 페이지 스크립트

역할
1. 제목/내용 길이 검증
2. 등록 전 확인창 띄우기
*/

const qnaWriteForm = document.getElementById("qnaWriteForm");

if (qnaWriteForm) {
  qnaWriteForm.addEventListener("submit", function (e) {
    const companyNumber = document.getElementById("companyNumber").value;
    const postTitle = document.getElementById("postTitle").value.trim();
    const postContentElement = document.getElementById("postContent");
    const postContent = postContentElement.value;        // 공백 포함 길이 체크용
    const postContentTrimmed = postContentElement.value.trim(); // 공백만 입력 방지용

    if (!companyNumber) {
      alert("기업을 선택해주세요.");
      e.preventDefault();
      return;
    }

    if (postTitle.length < 10 || postTitle.length > 100) {
      alert("제목은 10자 이상 100자 이하로 입력해주세요.");
      return;
    }

    // 내용은 공백 포함 10자 이상 1000자 이하
    if (postContentTrimmed.length === 0 || postContent.length < 10 || postContent.length > 1000) {
      alert("내용은 공백 포함 10자 이상 1000자 이하로 입력해주세요.");
      e.preventDefault();
      return;
    }

    const ok = confirm("글을 생성하겠습니까?");
    if (!ok) {
      e.preventDefault();
    }
  });
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)
}
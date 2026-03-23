<<<<<<< HEAD
function openPost(id) {
   location.href = contextPath + "/qna/detail.qfc?postNumber=" + id;
}
=======
document.addEventListener("DOMContentLoaded", function () {
  const page = document.getElementById("qnaListPage");

  if (!page) {
    return;
  }

  const loginRequired = page.dataset.loginRequired === "true";
  const loginMessage = page.dataset.loginMessage;
  const loginUrl = page.dataset.loginUrl;

  if (loginRequired) {
    alert(loginMessage);
    location.href = loginUrl;
    return;
  }

  const rows = document.querySelectorAll(".js-qna-row");
  for (let i = 0; i < rows.length; i++) {
    rows[i].addEventListener("click", function () {
      const detailUrl = this.dataset.detailUrl;
      if (detailUrl) {
        location.href = detailUrl;
      }
    });
  }

  const links = document.querySelectorAll(".js-qna-link");
  for (let i = 0; i < links.length; i++) {
    links[i].addEventListener("click", function (e) {
      e.stopPropagation();
    });
  }
});
>>>>>>> de81b31 (20260323 이해준 자유게시판, 기업qna 수정)

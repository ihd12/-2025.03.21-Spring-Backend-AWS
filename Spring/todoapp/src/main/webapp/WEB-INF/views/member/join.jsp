<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 25. 6. 20.
  Time: 오전 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <!-- 부트스트랩 CSS를 CDN방식으로 다운로드 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
    <jsp:include page="../header.jsp" />
    <div class="row content">
        <div class="col">
            <div class="card">
                <div class="card-header">
                    회원 가입
                </div>
                <div class="card-body">
                    <form method="post" action="/member/join">
                        <div class="input-group mb-3">
                            <span class="input-group-text">ID</span>
                            <input type="text" name="id" class="form-control" placeholder="아이디"/>
                        </div>
                        <div class="input-group mb-3">
                            <span class="input-group-text">PASSWORD</span>
                            <input type="text" name="pw" class="form-control" placeholder="비밀번호"/>
                        </div>
                        <div class="input-group mb-3">
                            <span class="input-group-text">Email</span>
                            <input type="text" name="email1" class="form-control" placeholder="메일아이디"/>
                            <input type="text" name="email2" class="form-control" placeholder="메일주소"/>
                        </div>
                        <div class="my-4">
                            <div class="float-end">
                                <button type="submit" class="btn btn-primary">등록</button>
                                <button type="reset" class="btn btn-secondary">초기화</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="row content">
        <h1>Content</h1>
    </div>
    <jsp:include page="../footer.jsp" />
</div>
<!-- 부트스트랩 JavaScript를 CDN방식으로 다운로드 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>   
<h1>all</h1>
<h1>전체</h1>
<hr />

	
	<sec:authorize access="isAnonymous()">
		<a href="/sample/customLogin">로그인</a>
	</sec:authorize>
	<sec:authorize access="isAuthenticated()">
		로그인된 유저 정보 : <sec:authentication property="principal"/><br />
		MemberDTO : <sec:authentication property="principal.dto"/> <br />
		id : <sec:authentication property="principal.dto.userid"/><br/>
		name : <sec:authentication property="principal.dto.username"/><br/>
		regDate : <sec:authentication property="principal.dto.regDate"/><br/>
		
		<form method="post" action="/sample/customLogout">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" >
			<input type="submit" value="로그아웃" />
		</form>
	</sec:authorize>
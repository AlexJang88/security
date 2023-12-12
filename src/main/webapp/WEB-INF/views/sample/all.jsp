<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>all</h1>
<h1>전체</h1>
<form method="post" action="/sample/customLogout">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" >
	<input type="submit" value="로그아웃" />
</form>
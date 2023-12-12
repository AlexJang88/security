<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>admin</h1>
<h1>관리자만</h1>
<form method="post" action="/sample/customLogout">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" >
	<input type="submit" value="로그아웃" />
</form>
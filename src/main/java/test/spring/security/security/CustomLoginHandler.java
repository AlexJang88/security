package test.spring.security.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomLoginHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		List<String> roleNames = new ArrayList<String>();
		//security-context.xml 설정된 USER -모든 권한 이름 가져오귀~
		authentication.getAuthorities().forEach(au ->{
			roleNames.add(au.getAuthority());
		});
		String  rdir = "/sample/all";
		if(roleNames.contains("ROLE_ADMIN")) {
			rdir = "/sample/admin";
		}else if(roleNames.contains("ROLE_MEMBER")) {
			rdir="/sample/member";
		}
		response.sendRedirect(rdir);
		
	}

}

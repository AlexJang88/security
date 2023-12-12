package test.spring.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample/*")
public class SampleController {
	
	@RequestMapping("/all")
	public String doAll() {
		return "sample/all";
	}
	@RequestMapping("/member")
	public String doMember() {
		return "sample/member";
	}
	@RequestMapping("/admin")
	public String doAdmin() {
		return "sample/admin";
	}
	@RequestMapping("/accessError")
	public String accessError(Authentication auth) {
		System.out.println("access Denied ==>"+auth);
		return "sample/accessError";
	}
	@RequestMapping("/customLogin")
	public String login() {
		return "sample/login";
	}
	@RequestMapping("/customLogout")
	public String customLogout() {
		return "sample/logout";
	}
}

package test.spring.security.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import test.spring.security.bean.AuthDTO;
import test.spring.security.bean.MemberDTO;
import test.spring.security.repository.SecurityMapper;

public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private SecurityMapper mapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			MemberDTO dto= mapper.read(username);
			
		return dto==null ? null:new CustomUser(dto);
	}
	
}

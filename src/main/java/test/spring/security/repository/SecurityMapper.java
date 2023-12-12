package test.spring.security.repository;

import test.spring.security.bean.MemberDTO;

public interface SecurityMapper {
	public MemberDTO read(String userid);
}

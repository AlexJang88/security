package test.spring.security.bean;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class MemberDTO {
	
	private String userid;
	private String userpw;
	private String username; 
	private boolean enabled;  //유저 활성화
	private Date regDate; 	// 가입날짜
	private Date updateDate;	//정보 수정 날짜
	private List<AuthDTO> authList; //권한
}

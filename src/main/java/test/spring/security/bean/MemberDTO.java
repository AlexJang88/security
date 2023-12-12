package test.spring.security.bean;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class MemberDTO {
	
	private String userid;
	private String userpw;
	private String username; 
	private boolean enabled;  //���� Ȱ��ȭ
	private Date regDate; 	// ���Գ�¥
	private Date updateDate;	//���� ���� ��¥
	private List<AuthDTO> authList; //����
}

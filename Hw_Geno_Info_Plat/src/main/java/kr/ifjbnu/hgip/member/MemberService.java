package kr.ifjbnu.hgip.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	//회원가입
	public void addMember(MemberCommand memberCommand) {
		logger.debug("addMember(Member member) 메서드 member is {}", memberCommand);
		Member member = new Member();
		String cellphone1 = memberCommand.getCellphone1();
		String cellphone2 = memberCommand.getCellphone2();
		String cellphone3 = memberCommand.getCellphone3();
		
		String email1 = memberCommand.getEmail1();
		String email2 = memberCommand.getEmail2();
		
		String mId = memberCommand.getmId();
		String mPw = memberCommand.getmPw();
		String name = memberCommand.getName();
		String gender = memberCommand.getGender();
		
		String birth = memberCommand.getBirth();
		
		member.setmId(mId);
		member.setmPw(mPw);
		member.setName(name);
		member.setgender(gender);
		member.setBirth(birth);
		member.setCellphone(cellphone1+cellphone2+cellphone3);
		member.setEmail(email1+email2);
		/*String salt = SHA256Util.generateSalt();*/
		memberDao.signUp(member);
	}
	//로그인 정보조회
	public Member loginSelect(Member member) {
		logger.debug("loginSelect(Member member) 메서드 member is {}", member);
		Member memberInfo = memberDao.selectLogin(member);
		logger.debug("loginSelect(Member member) 메서드 memberInfo is {}", memberInfo);
		return memberInfo;
	}
}

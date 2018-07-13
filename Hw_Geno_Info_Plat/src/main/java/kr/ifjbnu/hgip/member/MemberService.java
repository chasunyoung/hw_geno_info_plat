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
	public void addMember(Member member) {
		logger.debug("addMember(Member member) 메서드 member is {}", member);
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

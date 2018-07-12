package kr.ifjbnu.hgip.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.ifjbnu.hgip.member.Member;

@Service
@Transactional
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	//회원가입
	public void addMember(Member member) {
		logger.debug("addMember(Member member) 메서드 member is {}", member);
		
		memberDao.signUp(member);
	}
}

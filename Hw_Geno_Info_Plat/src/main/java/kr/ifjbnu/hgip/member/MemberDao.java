package kr.ifjbnu.hgip.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberDao.class);
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	private final String nameSpace="kr.ifjbnu.hgip.member.MemberMapper.";
	
	//회원가입
	public void signUp(Member member) {
		logger.debug("signUp(Member member)메서드 member is {}", member);
		sqlSessionTemplate.insert(nameSpace+"signUp", member);
	}
}

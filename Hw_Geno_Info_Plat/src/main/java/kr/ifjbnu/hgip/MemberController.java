package kr.ifjbnu.hgip;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ifjbnu.hgip.member.Member;
import kr.ifjbnu.hgip.member.MemberService;


@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//회원가입페이지로 이동
	@RequestMapping(value="member/memberAdd", method = RequestMethod.GET)
	public String addMember() {
		logger.debug("addMember() 메서드 실행");
		return "member/memberAdd";
	}
	//회원가입
	@RequestMapping(value="member/memberAdd", method=RequestMethod.POST)
	public String memberAdd(Member member) {
		logger.debug("memberAdd(...) 메서드 member is {}", member);
		memberService.addMember(member);		
		return "home";
	}
}
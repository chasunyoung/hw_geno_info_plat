<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div>
	<h2>회원가입</h2>
	<div>
		<form action="${pageContext.request.contextPath}/member/memberAdd" method="post">
			<table>
				<tr>
					<td>아이디</td>
					<td><input class="" type="text" name="mId"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input class="" id="pw" type="password" name="mPw"></td>
				</tr>
				<tr>
					<td>비밀번호확인</td>
					<td>
						<input class="" id="pwcheck" type="password"> &nbsp;
						<font id="check" size="2" color="red"></font>
					</td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input class="" type="text" name="name"></td>	
				</tr>
				<tr>
					<td>생년월일</td>
					<td><input class="" type="text" name="birth"></td>	
				</tr>
				<tr>
					<td>성별</td>
					<td>
						<input type="radio" name="gender" value="남자" checked="checked"/>남자
						<input type="radio" name="gender" value="여자"/>여자
					</td>	
				</tr>
				<tr>
					<td>핸드폰번호</td>
					<td>
						<select name="cellphone1">
							<option value="010" selected>010</option>
							<option value="011">011</option>
							<option value="016">016</option>
							<option value="017">017</option>
							<option value="018">018</option>
							<option value="019">019</option>
						</select>
						&nbsp; - &nbsp;
						<input class="" type="text" name="cellphone2">
						&nbsp; - &nbsp;
						<input class="" type="text" name="cellphone3">
					</td>	
				</tr>
				<tr>
					<td>이메일</td>
					<td>
						<input class="" type="text" name="email1">
						<select name="email2" id="email2">
							<option value="">선택해주세요</option>
							<option value="naver.com" selected>naver.com</option>
							<option value="hanmail.net">hanmail.net</option>
							<option value="nate.com">nate.com</option>
							<option value="gmail.com">gmail.com</option>
							<option value="direct">직접입력</option>
						</select>
						<!-- select box에서 '직접입력'을 선택하면 나타날 인풋박스 -->
						<input type="text" id="selboxDirect"/>
					</td>	
				</tr>
			</table>
			<button id="addbtn" type="submit">가입</button>
		</form>
		</div>
	</div>
	<script>
		//비밀번호 확인
		 $(function(){
		  $('#pw').keyup(function(){
		   $('#check').text('');
		  }); //#pw.keyup
		
		  $('#pwcheck').keyup(function(){
		   if($('#pw').val()!=$('#pwcheck').val()){
		    $('#check').text('');
		    $('#check').html("비밀번호가 일치하지 않습니다");
		   }else{
		    $('#check').text('');
		   }
		  }); //#pwcheck.keyup
		 });
		 
		//이메일 
		 $(function(){

		//직접입력 인풋박스 기존에는 숨어있다가
		$("#selboxDirect").hide();
		$("#email2").change(function() {			

                //직접입력을 누를 때 나타남	
				if($("#email2").val() == "direct") {
	
					$("#selboxDirect").show();
	
				}  else {
	
					$("#selboxDirect").hide();	
				}		
			}) 		
		});
	</script>
</body>
</html>
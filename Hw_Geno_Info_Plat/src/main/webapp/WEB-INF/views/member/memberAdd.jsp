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
						<input type="radio" name="sex" value="남자" checked="checked"/>남자
						<input type="radio" name="sex" value="여자"/>여자
					</td>	
				</tr>
				<tr>
					<td>핸드폰번호</td>
					<td><input class="" type="text" name="cellphone"></td>	
				</tr>
				<tr>
					<td>이메일</td>
					<td><input class="" type="text" name="email"></td>	
				</tr>
			</table>
			<button id="addbtn" type="submit">가입</button>
		</form>
		</div>
	</div>
	<script>
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
	</script>
</body>
</html>
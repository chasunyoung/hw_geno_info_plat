<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>전북대학교 산합협력단 연구과제</title>
	<style>
		* {
		    padding: 0;
		    margin: 0;
		    border: 0;
		}
		.header_right_menu{
			float:right;
			height:100%;
			overflow:hidden;
		}
		.header{
			width:100%;
			height: 40px;
			border-bottom: 1px solid #dddddd;
		}
		.header_menu_line{
			width: 100%;
			height:40px;
			border-bottom:1px solid #dddddd;
			text-align: center;
		}
		.header_right_btn{
			font-size: 11pt;
			text-align: center;
			width: 100px;
			height: 100%;
			vertical-align: middle;
			cursor: pointer;
		}
		.header_right_btn1{
			border-left: 1px solid #dddddd;	
			background: #ffffff;
		}
		.header_right_btn2{
			border-left: 1px solid #dddddd;	
			background: #ffffff;
		}
		.login_btn{
			float:left;
		}
		.member_btn{
			float:left;
		}
	</style>
</head>
<body>
	<div class="hearder header_menu_line">
		<!-- 최상단 메뉴 -->
		<c:if test="${empty loginId}">
		<div class="header_right_menu">
			<div class="login_btn">
				<a id="memberlogin" href="${pageContext.request.contextPath}/member/login">
					<button class="header_right_btn header_right_btn1">로그인</button>
				</a>
			</div>
			<div class="member_btn">
				<a href="${pageContext.request.contextPath}/member/memberAdd">
					<button class="header_right_btn header_right_btn2">회원가입</button>
				</a>
			</div>
		</div>
		</c:if>
		<c:if test="${!empty loginId}">
		<div class="header_right_menu">
			<div class="login_btn">
				<a href="${pageContext.request.contextPath}/member/logout">
					<button class="header_right_btn header_right_btn1">로그아웃</button>
				</a>
			</div>
			<div class="member_btn">
				<a href="#">
					<button class="header_right_btn header_right_btn2">회원정보수정</button>
				</a>
			</div>
		</div>
		</c:if>
	</div>
	
</body>
</html>

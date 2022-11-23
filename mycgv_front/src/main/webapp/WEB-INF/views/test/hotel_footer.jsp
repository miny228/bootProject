<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.compInfo {
		position : relative;
		float : left;
		width : 158px;
		height : 100px
	}
	.linkInfo {
		position : relative;
		float : left;
		width : 553px;
		height : 100px;
	}
	.snsNews {
		position : relative;
		float : right;
		width : 117px;
		height : 100px;
	}
	.footer {
		width : 1200px;
		margin : 0 auto;
		height : 161px;
		position : relative;
		overflow : hidden;
	}
	
	.linkBox {
		position : absolute;
		width : 1010px;
		height : 60px;
	} 
	
	.footer .linkBox ul {
		position : absolute;
		top : 25px;
		width : 909px;
	}
	
	.footer .linkBox li{ 
		float:left; height:14px;
	}
	
	.footer .adressBox{
		position:absolute; 
		left:0; top:84px; height:23px; width:1200px; 
		display:block; line-height:100px; /* overflow:hidden; */
		/* text-indent:-9999% */
	}
	
	.footer .copyright{
		position:absolute;
		left:0; top:103px; width:1200px; height:30px;
		display:block; line-height:100px;  /* overflow:hidden */; 
		/* text-indent:-9999% */
	}
	
	
</style>
</head>
<body>
	<footer>
		<div class="foot hub_foot footdongtan">
			<div class="localBox">
				<div class="localBoxer">
					<div class="compInfo">
						<a href="index.do"><p class="logo">브랜드이름</p></a>
					</div>
					<div class="linkInfo">
						<ul class="Infolst">
							<li class="m1 first"><a href="#">호텔 소식</a></li>
							<li class="m2"><a href="#">게시판</a></li>
							<li class="m3 last"><a href="#">고객문의</a></li>
						</ul>
					</div>
					<div class="snsNews">
						<dl class="sns">
							<dt class="dt">SNS</dt>
							<dd class="facebook"><span>Facebook</span></a></dd>
							<dd class="instagram"><span>instagram</span></a></dd>
							<dd class="blog"><span>Blog</span></a></dd>
						</dl>
					</div>
				</div>
			</div>
			<div class="footer">
				<div class="linkBox">
					<ul>
						<li class="link1 first"><a href="#">브랜드이름 소개</a></li>
						<li class="link2"><a href="#">사이트맵</a></li>
						<li class="link3"><a href="#">개인정보취급방침</a></li> 
						<li class="link4 "><a href="#">이메일무단수집금지</a></li>
						<li class="link5 last"><a href="#">윤리경영(부정제보)</a></li>
						</ul>
				</div>
				<div class="selectLang">
					<ul>
						<li class="en first">English</a></li>
						<li class="ja">日本語</a></li>
						<li class="zh last">简体中文</a></li>
						</ul>
				</div>
				<div class="adressBox">
					<p>신라스테이 주식회사    서울특별시 중구 다산로 210  (우 : 04586)  TEL. 02-2230-3000   FAX. 02-2230-3800   사업자등록번호 201-86-40254   통신판매신고번호 중구0882호   대표이사 박상오</p>
				</div>
				<div class="copyright">COPYRIGHT © HOTEL SHILLA CO., LTD. ALL RIGHTS RESERVED. </div>
			</div>
		</div>
	
	</footer>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Inquiry</title>
</head>
<body>
	<!-- Header Include -->
	<iframe></iframe>

	<!---------------------------------------------->
	<!--------------- Content ---------------------->
	<!---------------------------------------------->
	
	<div class="contain">
		<div class="container">
			<div class="InArea MenuBar">
				<div class="MenuBar">
					<h2 class="">고객문의</h2>
						<ul class="menu">
							<li class="">
								<a href="customerInquiry_list.do" class="on"><span>문의글</span></a>
							</li>	
							<li class="">
								<a href="customerInquiry_write.do"><span>문의하기</span></a>
							</li>
							<li class="">
								<a href="myCustomerInquiry_list.do"><span>내문의함</span></a>
							</li>
						</ul>
				</div>
			</div>	
		</div>
		
		<div class="contents" id="contents">
			<div class="ctnInquires ctnCtUs">
				<div class="location">
					<p class="list">
						<span class="crPosit">현재 페이지 위치 : </span>
						" > 문의하기 >"
						<strong>Contact Us</strong>
					</p>
				</div>
				
				<!---------- content start ---------->
				<div class="account">
					<h3>문의글</h3>
					<img alt="연락처 설명 문구" src="">
					<table border=1 class="customerBoard">
						<tr>
							<th>문의유형</th>
							<td>분류</td>
							<th>등록일자</th>
							<td>2022-09-06 16:25:00</td>													
						</tr>
						<tr>
							<th>제목</th>
							<td>제목입니다.</td>
						</tr>
						<tr>
							<th>작성자</th>
							<td>test1</td>
						</tr>
						<tr>
							<th>내용</th>
							<td>예약문의</td>
							<!-- 파일첨부 내역 추가하기 -->
						</tr>

					</table>
					<a href="customerInquiry_update.do"><button type="button" id="btn_InquiryUpdate">수정하기</button></a>
					<button type="button" id="btn_InquiryDelete">삭제하기</button>
					<a href="customerInquiry_list.do"><button type="button" id="btnInquiryList">목록</button></a>
					
				</div>
				
			</div>					
		</div>

	
	
	
	</div>

	<!-- Footer Include -->
	<iframe></iframe>
</body>
</html>
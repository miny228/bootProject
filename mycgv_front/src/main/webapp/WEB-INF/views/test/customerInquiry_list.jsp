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
					<table class="customerBoard">
						<tr>
							<th>No.</th>
							<th>분류</th>
							<th>제목</th>
							<th>작성자</th>							
							<th>등록일자</th>							
						</tr>
						<tr>
							<td>1</td>
							<td>예약문의</td>
							<td><a href="customerInquiry_content.do">문의글</a></td>
							<td>test1</td>
							<td>2022-08-31</td>
						</tr>
						<tr>
							<td>2</td>
							<td>계정문의</td>
							<td>문의글2</td>
							<td>test2</td>
							<td>2022-08-30</td>
						</tr>
						<tr>
							<td>3</td>
							<td>예약문의</td>
							<td>문의글3</td>
							<td>test3</td>
							<td>2022-08-30</td>
						</tr>
						<tr>
							<td>4</td>
							<td>기타</td>
							<td>문의글4</td>
							<td>test4</td>
							<td>2022-08-29</td>
						</tr>
						<tr>
							<td>5</td>
							<td>기타</td>
							<td>문의글5</td>
							<td>test5</td>
							<td>2022-08-28</td>
						</tr>
						<tr>
							<td colspan="4"> << 1 2 3 4 5 >> </td>
						</tr>
					</table>
					<a href="customerInquiry_write.do"><button type="button" id="btnInquiry">문의하기</button></a>
					<span>검색어</span>
					<select type="text" name="search" id="search">
						<option value="default">분류</option>
						<option value="default">작성자</option>
						<option value="default">제목</option>
					</select>
					<input type="text" name="searchField" id="searchField">
					<button type="button" id="btnSearch">찾기</button>
				</div>
				
			</div>					
		</div>

	
	
	
	</div>

	<!-- Footer Include -->
	<iframe></iframe>
</body>
</html>
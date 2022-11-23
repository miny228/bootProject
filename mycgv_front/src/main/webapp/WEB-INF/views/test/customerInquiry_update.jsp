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
		<form name="inquireForm" id="inquireForm" method="post" enctype="multipart/form-data" action="#">
		<input type="hidden" name="bid"  value="id값" >
		<input type="hidden" name="cfile"  value="파일명1" >
		<input type="hidden" name="csfile"  value="파일명2" >
				<div class="ctnInquires  ctnCustomer">
					<div class="location">
						<p class="list">
							<span class="crPosit">현재 페이지 위치loc.title : </span>
							" > 고객문의 >"
							<strong>고객문의</strong>
						</p>
					</div>
					<div class="customerCenterTit">
						<h4 class="tit">문의하기</h4>
					</div>
					<!---------- content start ---------->
					<div class="inquiry">
						<h3>문의글</h3>
						<img alt="연락처 설명 문구" src="">
						<table border=1 class="customerBoard">
							<tr>
								<th>문의유형</th>
								<td>
									<div class="selector" id="uniform-askSrewardsClsCd1" style="width: 135px;">
											<span style="width: 110px; user-select: none;"></span>
											<select class="qCate uiform" id="askSrewardsClsCd1" name="askSrewardsClsCd1">
												<option value="">선택</option>
												<option value="defult" >선택</option>
												<option value="reserve_inquiry" title="예약문의">예약문의</option>
												<option value="account_inquiry" title="계정문의">계정문의</option>
												<option value="ETC_inquiry" title="기타">기타</option>
											</select>
										</div>
								</td>													
							</tr>
							<tr>
								<th>제목</th>
								<td><input type="text" name="" id="" value=""></td>
							</tr>
							<tr>
								<th>내용</th>
								<td><textarea name=""></textarea></td>
							</tr>
							<tr>
								<th>파일첨부</th>
								<td>
									<input type="file" name="file1">
									<span id=""></span>
								</td>
								<!-- 파일첨부 내역 추가하기 -->
							</tr>
	
						</table>
						<button type="button" id="btnInquiryUpdate">수정완료</button>
						<button type="reset" class="btn_style">Reset</button>
						<a href="customerInquiry_list.do"><button type="button" id="btnInquiryList">목록</button></a>
						
					</div>
					
				</div>					
			</div>
		</div>
	</form>
	
	<!-- Footer Include -->
	<iframe></iframe>
</body>
</html>
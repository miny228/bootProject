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
					<div class="account">
						<table class="tableTypeA tableCustomer">
							<colgroup>
				                <col width="16%" class="col1">
				                <col width="50%" class="col2">
				                <col width="18%" class="col3">
				                <col width="16%" class="col4">
	           				</colgroup>
	           				<tbody>
	           					<tr class="rq-type-rwd" id="show1" style="display: table-row;">
									<th scope="row">
										<label for="qCateSel" class="qCateSel"> <span class="ast">*</span> 질문유형 </label>
									</th>
									<td colspan="3">
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
								<tr id="showTitle">
									<th scope="row">
										<label for="askSubj" class="title"><span class="ast">*</span> 제목</label>
									</th>
									<td colspan="3">
										<input type="text" class="title uiform" id="askSubj" name="askSubj" size="70" title="제목입력(Please write subject)" autocomplete="off">
									</td>
								</tr>
								<tr id="inquiry_content">
									<th scope="row">
										<label for="askTxt" class="qMemo"><span class="ast">*</span> 내용<br></label>
									</th>
									<td colspan="3">
										<textarea cols="50" rows="5" class="memo uiform" id="askTxt" name="askTxt" onkeyup="checkAskTxtLengh();" autocomplete="off"></textarea>
									</td>
								</tr>
								<tr>
									<th>
										<label>파일첨부</label>
									</th>
									<td>
										<input type="file" name="file1">
										<span id="inquiry_upload_file">${vo.cfile}</span>
									</td>
								</tr>
								<tr>
									<th>설정</th>
										<td>
											<div class="form-check form-check-inline mt-3">
		   										<input class="form-check-input" type="checkbox" name="secret" id="secret">
		    									<label class="form-check-label">비밀글</label>
			    									<span>
				    									<lable>비밀번호</lable>
				    									<input type="password" name="inquiry_pass" id="inquiry_pass">
			    									</span>
											</div>
										</td>	
								</tr>
	           				</tbody>
						</table>
						<div class="privacyBox">			
							<div class="hTitS hTitS1">
								<h4 class="tit">필수적 개인정보 수집 및 이용에 대한 동의</h4>
							</div>
							<div class="clauseBox">
								<div class="scBox reg_cona newpd" tabindex="0">
									<a href="#">필수적 개인정보 수집 및 이용에 대한 동의 내용 보기</a><p>
												신라호텔 고객의 문의 및 의견과 관련하여 귀사가 아래와 같이 본인의 개인정보를 수집 및 이용하는데 동의합니다.<br><br>
												1. 필수적인 개인정보의 수집 ㆍ이용에 관한 사항<br>
												<b style="font-size:14px;">① 수집ㆍ이용&nbsp;항목 | 성명(국문·영문),&nbsp;이메일, 휴대전화</b><br>
									            <b style="font-size:14px;">② 수집ㆍ이용&nbsp;목적 | 문의에 대한 안내 및 서비스 제공</b><br>
												<b style="font-size:14px;">③ 보유ㆍ이용 기간&nbsp;|&nbsp;수집ㆍ이용 동의일로부터 5년간</b><br>
												※위 사항에 대한 동의를 거부할 수 있으나, 이에 대한 동의가 없을 경우 문의에 대한 안내 및 서비스 제공과 관련된 제반 절차 진행이 불가능 할 수 있음을 알려드립니다.</p>
								</div>
							</div>
							<div class="checkAgreeBox">
								<input type="checkbox" class="ckb checkbox" id="privacyChk" name="privacyChk" value="Y" autocomplete="off">
								<label for="privacyChk">동의함</label>
							</div>
						</div>
						<div class="privacyBox">			
							<div class="hTitS hTitS1">
								<h4 class="tit">선택적 개인정보 수집 및 이용에 대한 동의</h4>
							</div>
							<div class="clauseBox">
								<div class="scBox reg_cona newpd" tabindex="0">
									<a href="#">선택적 개인정보 수집 및 이용에 대한 동의 내용 보기</a><p>
		   										신라호텔 고객의 문의 및 의견과 관련하여 귀사가 아래와 같이 본인의 개인정보를 수집 및 이용하는데 동의합니다.<br><br>
		  										선택적인 개인정보의 수집 ㆍ이용에 관한 사항<br>
									   			<b style="font-size:14px;">① 수집ㆍ이용 항목 | 자택전화</b> <br>
							          			<b style="font-size:14px;">② 수집ㆍ이용 목적 | 문의에 대한 안내 및 서비스 제공</b><br>
												<b style="font-size:14px;">③ 보유ㆍ이용 기간 | 수집ㆍ이용 동의일로부터 5년간</b><br>
									 			※위 사항에 대한 동의를 거부할 수 있으나, 이에 대한 동의가 없을 경우 문의에 대한 안내 및 서비스 제공과 관련된 일반전화 안내 진행이 불가능 할 수 있음을 알려드립니다.</p>
								</div>
							</div>
						<div class="checkAgreeBox">
							<input type="checkbox" class="ckb checkbox" id="personInfoUseYn" name="personInfoUseYn" autocomplete="off" value="N">
							<label for="personInfoUseYn">동의함</label>          
						</div>
					</div>
						<div class="btnList">
							<a href="javascript:saveSubmit('KR');" class="btnRegist"><span>등록</span></a>
						</div>	
					</div>
				</div>					
			</div>
		</div>
	</form>
	<!-- Footer Include -->
	<iframe></iframe>
</body>
</html>
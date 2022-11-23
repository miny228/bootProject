
$(document).ready(function(){
	/******************
	 * 로그인 유효성 체크
	 ******************/
	$("#loginCheck").click(()=>{
		if($("#id").val()==""){
			$("#loginMsg").html("<b><u>아이디</u></b>를 입력해주세요.")
			.css("color","rgb(251,67,81)").css("font-size","12px");
			$("#id").focus();
			return false;
		}else if($("#pass").val()==""){
			$("#pass").focus();
			$("#loginMsg").html("<b><u>비밀번호</u></b>를 입력해주세요.")
			.css("color","rgb(251,67,81)").css("font-size","12px");
			return false;
		}else{
			//서버전송
			loginform.submit();
		}
	});//로그인
	
	
	/********************
	 * 회원가입 유효성 체크
	 ********************/
	$("#joinCheck").click(()=>{
		if($("#id").val()==""){
			alert("아이디를 입력해주세요.");
			$("#id").focus();
			return false;
		}else if($("#pass").val()==""){
			alert("비밀번호를 입력해주세요");
			$("#pass").focus();
			return false;
		}else if($("#cpass").val()==""){
			alert("비밀번호를 확인해주세요");
			$("#cpass").focus();
			return false;
		}else if($("#name").val()==""){
			alert("성명을 입력해주세요");
			$("#name").focus();
			return false;
		}else if($("input[name='gender']:checked").length==0){
			$("#g1").html("성별을 선택해주세요")
			.css("color","rgb(251,67,81)"),css("font-size","12px");
			return false;
		}else if($("#email").val()==""){
			alert("이메일을 입력해주세요");
			$("#email").focus();
			return false;
		}else if($("#email2").val()==""){
			alert("이메일 주소를 선택해주세요")
			$("#email3").focus();
			return false;
		}else if($("#addr1").val()==""){
			alert("주소를 입력해주세요");
			$("#addr1").focus();
			return false;
		}else if($("#addr2").val()==""){
			alert("상세주소를 입력해주세요");
			$("#addr2").focus();
			return false;
		}else if($("input[name='hp']:checked").length==0){
			$("#h1").html("통신사를 선택해주세요")
			.css("color","rgb(251,67,81)").css("font-size","12px");
		}else if($("#pnum1").val()=="default"){
			alert("핸드폰 번호를 선택해주세요");
			$("#pnum1").focus();
			return false;
		}else if($("#pnum2").val()==""){
			alert("핸드폰 번호를 입력해주세요")
			$("#pnum2").focus();
			return false;
		}else if($("#pnum3").val()==""){
			alert("핸드폰 뒷번호를 입력해주세요")
			$("#pnum3").focus();
			return false;
		}else if($("input[name='hobby']:checked").length==0){
			$("#hb1").html("취미를 선택하세요(다중입력가능)")
			.css("color","rgb(251,67,81)").css("font-size","12px");
			return false;
		}else{
			//서버전송
			joinForm.submit();
		}
		
		
	});//회원가입
	
	/**성별, 통신사, 취미 체크되면 태그 숨기기**/
	$("input[name='gender']").click(()=>{
		if($("input[name='gender']:checked").length!=0){
			$("#g1").css("display", "none");
		}
	});
	
	$("input[name='hp']").click(()=>{
		if($("input[name='hp']:checked").length!=0){
			$("#h1").css("display", "none");
		}
	});
	
	$("input[name='hobby']").click(()=>{
		if($("input[name='hobby']:checked").length!=0){
			$("#hb1").css("display", "none");
		}
	});
	
	
	/**이메일 주소 선택시 값 입력하기**/
	$("#email3").change(()=>{
		if($("#email3").val()=="default"){
			alert("이메일 주소를 선택해주세요");
			$("#email3").focus();
		}else if($("#email3").val()=="self"){
			$("#email2").val("").focus();
		}else{
			$("#email2").val($("#email3").val());
		}
	});
	
	/**비빌번호, 비밀번호 재확인 유효성 체크**/
	$("#cpass").blur(()=>{
		//값이 없을때
		if($("#pass").val()==0 && $("#cpass").val()==0){
			alert("비밀번호를 입력해주세요");
			$("#pass").focus();
		}else if($("#pass").val()==$("#cpass").val()){
			$("#passCheckMsg").html("<b>일치</b>")
			.css("color", "blue").css("font-size","12px");
		}else{
			$("#passCheckMsg").html("<b>비밀번호</b>가 다릅니다.")
			.css("color", "rgb(251,67,81)").css("font-size","12px");
			$("#cpass").val("");
			$("#pass").val("").focus();
		}
	});
	
	
	/***************************
	 * 게시판 글쓰기 제목 유효성 체크
	 ***************************/
	$("#boardWriteCheck").click(function(){
		if($("#btitle").val()==""){
			alert("제목을 입력해주세요!");
			$("#btitle").focus();
			return false;
		}else{
			//서버전송
			boardWriteForm.submit();
		}
	});
	
	
	/***************************
	 * 게시판 수정하기 제목 유효성 체크
	 ***************************/
	$("#boardUpdateCheck").click(function(){
		if($("#btitle").val()==""){
			alert("제목을 입력해주세요!");
			$("#btitle").focus();
			return false;
		}else{
			//서버전송
			boardUpdateForm.submit();
		}
	});
	
	
	/***************************
	 * 공지사항 글쓰기 제목 유효성 체크
	 ***************************/
	$("#noticeWriteCheck").click(function(){
		if($("#ntitle").val()==""){
			alert("제목을 입력해주세요!");
			$("#ntitle").focus();
			return false;
		}else{
			//서버전송
			boardWriteForm.submit();
		}
	});
	
	
	/***************************
	 * 공지사항 수정하기 제목 유효성 체크
	 ***************************/
	$("#noticeUpdateCheck").click(function(){
		if($("#ntitle").val()==""){
			alert("제목을 입력해주세요!");
			$("#ntitle").focus();
			return false;
		}else{
			//서버전송
			boardUpdateForm.submit();
		}
	});
	
	/*************************************
	 * 주소, 우편번호 찾기 카카오 주소찾기 api
	 *************************************/
	
	$("#addrSearch").click(()=>{
		new daum.Postcode({
			oncomplete: function(data) {
				// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
				// 예제를 참고하여 다양한 활용법을 확인해 보세요.
				$("#zonecode").val(data.zonecode);
				$("#addr1").val(data.address);
				$("#addr2").focus();
			}
		}).open();
	});//주소찾기()
	
	
	
});//ready()

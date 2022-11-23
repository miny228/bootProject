<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.mycgv.vo.CgvNoticeVO" %> 
<%@ page import="com.mycgv.dao.CgvNoticeDAO" %> 
<jsp:useBean id="vo" class="com.mycgv.vo.CgvNoticeVO"/>
<jsp:setProperty property="*" name="vo"/>

<%
	//값이 넘어오는 지 확인하기
	/* System.out.println(vo.getNid());
	System.out.println(vo.getNtitle());
	System.out.println(vo.getNcontent()); */
	
	CgvNoticeDAO dao = new CgvNoticeDAO();
	int result = dao.update(vo);
	if(result == 1){
		response.sendRedirect("admin_notice_list.jsp");
	}else{
		response.sendRedirect("../errorPage.jsp");
	}
%>


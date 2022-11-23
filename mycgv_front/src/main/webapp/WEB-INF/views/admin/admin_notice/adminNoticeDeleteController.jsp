<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.mycgv.vo.CgvNoticeVO" %> 
<%@ page import="com.mycgv.dao.CgvNoticeDAO" %>

<%
	//nid 하나만 넘어와서 vo를 쓰진 않음
	String nid =  request.getParameter("nid");
	CgvNoticeDAO dao = new CgvNoticeDAO();
	int result = dao.delete(nid);
	if(result==1){
		response.sendRedirect("admin_notice_list.jsp");
	}else{
		response.sendRedirect("../errorPage.jsp");
	}
	
%>


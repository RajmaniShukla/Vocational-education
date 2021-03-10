
<%@page import="MyPackage.DatabaseManager"%>

<%
String customername=request.getParameter("customername");
String gender=request.getParameter("gender");
long contactno=Long.parseLong(request.getParameter("contactno"));
String emailaddress=request.getParameter("emailaddress");
DatabaseManager dm=new DatabaseManager();
String query1="insert into register values('"+customername+"','"+gender+"','"+contactno+"','"+emailaddress+"')";
 if(dm.executeNonQuery(query1)==true)
 {
  out.print("<script>alert('Registration Successfull');window.location.href='../future.jsp';</script>"); 
 }
%>

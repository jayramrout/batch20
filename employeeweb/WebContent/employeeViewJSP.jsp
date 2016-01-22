<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@ page import="jrout.tutorial.domain.Employee" %>
<%@ page import="java.util.*" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	Employee emp = (Employee)request.getAttribute("employee");
	List<Employee> empList = (List<Employee>)request.getAttribute("employees");
%>
<%
	for(Employee emplyee : empList){
		
	}
%>
<body>
	Hello you are in the view JSP Details : Employee FN : <%=emp.getFirstName() %>
	<br> Employee LN : <%=emp.getLastName() %>
	<br> Employee Email : <%=emp.getEmail() %>
	<br> Please return to the
	<a href="http://localhost:8081/employeeweb">Home Page</a>.
</body>
</html>
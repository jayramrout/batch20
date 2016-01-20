<%@page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Hidden Form Fields</title>
</head>
<body>
	<%
	
		String name = (String)session.getAttribute("name");
		Integer count = (Integer)application.getAttribute("count");
		//String name = (String)request.getParameter("name");
	%>
	
	THis is Inbox for <%=name %> : Number of Hits : <%=count%>
	<a href="http://localhost:8081/employeeweb/session.html">Go to Home</a>.

</body>
</html>
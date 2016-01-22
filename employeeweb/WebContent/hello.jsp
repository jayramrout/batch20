<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
</body>
</html>
<%! int i = 0; %> 

<%! 
private String callMe(){
	return "Hello";
} 
%>

<table id="table-1">

	<thead>
		<tr>
			<th>A</th>
			<th>B</th>
			<th>C</th>
		</tr>
	</thead>
	<tbody>
	<%-- This comment will not be visible in the page source --%> 
	<!-- This comment will be visible-->
	<% 
	for(int i = 0 ; i < 10 ; i++) {
	%>
	<tr>
			<td><%=i+"A"+ callMe()%></td>
			<td><%=i+"B"%></td>
			<td><%=i+"C"%></td>
	</tr>
	<%
	}
	%>
		
	</tbody>
	<tfoot>
		<tr>
			<th>A</th>
			<th>B</th>
			<th>C</th>
		</tr>
	</tfoot>
	
</table>
<%@ include file="hellofooter.jsp" %>

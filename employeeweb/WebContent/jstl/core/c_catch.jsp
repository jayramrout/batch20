<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title> Tag Example</title>
</head>
<body>

<c:catch var ="catchException">
   <%
   	String value = request.getParameter("value");
   	
   int x = 100/Integer.parseInt(value);
   out.println(x);
   %>
</c:catch>

<c:if test = "${catchException != null}">
   <p>The exception is : ${catchException} <br />
   There is an exception: ${catchException.message}</p>
</c:if>

</body>
</html>

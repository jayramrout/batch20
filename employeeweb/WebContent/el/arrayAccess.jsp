<%@page isELIgnored="true" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<%-- ${5==2}

The Big Five are : ${bigFive}<br>

The first one is ${bigFive[0]}<br>

The second one is ${bigFive["1"]}<br>
 --%>
<c:out value="${name}"></c:out><br>
<c:out value="${bigFive}"></c:out><br>
<c:out value="${bigFive[0]}"></c:out><br>
<c:out value="${bigFive['1']}"></c:out>
<br>
<c:out value="${employee.firstName}" ></c:out>
<c:out value="${employee.lastName}" ></c:out>
<c:out value="${employee.email}" ></c:out>

<c:out value="${employee.address.streeName}" ></c:out>
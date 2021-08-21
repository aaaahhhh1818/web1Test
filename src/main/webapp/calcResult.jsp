<%--
  Created by IntelliJ IDEA.
  User: 이아현
  Date: 2021-08-05
  Time: 오후 7:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    String oper = request.getParameter("oper");
    int result = 0;
    
    if(oper.equals("+")) {
       result = num1+num2;
    }else if(oper.equals("-")) {
        result = num1-num2;
    }else if(oper.equals("*")) {
        result = num1*num2;
    }else if(oper.equals("/")) {
        result = num1/num2;
    }else if(oper.equals("%")) {
        result = num1%num2;
    }
%>

<html>
<head>
    <title>Calculator Result</title>
</head>
<body>
    <h1>Result</h1>
    <h1><%= num1%><%= oper%><%= num2%>=<%= result%></h1>

    <a href="calcInput.jsp">다시 시도</a>
</body>
</html>

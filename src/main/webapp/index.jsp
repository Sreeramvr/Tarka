
<%@ page import="java.sql.ResultSet" %>

<html>
<head>
    <title>Show Data</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>sl_no</th>
                <th>employee_name</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="row" items="${results}">
                <tr>
                    <td>${row.sl_no}</td>
                    <td>${row.employee_name}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <button onclick="getdata();"> click me </button>
</body>
<script>
function getdata() { alert("working");}
</script>
</html>

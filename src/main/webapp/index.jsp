 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
gitgit 
 <!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>TARKA</title>
    <style>
    body {
    color:red;
   background-color: bisque;
    }
    h1
    {
    color:blue;
    background-color: aliceblue;
    text-align: center;
    }
    table,th,td
    {
   border: 2px solid black;
   border-radius: 5px;
   }
   h4 { color:#808080}
</style>
</head>

<body>

   <h1> TARKA INFOTECH PVT LTD </h1>
  <button onclick="get();"> CLICK ME </button>
  <br> </br>
     <table>
            <tr>
                <th>SLNO</th>
                <th>EMPLOYEENAME</th>
                <th>ADRESS</th>
                <th>PHONENO</th>
                <th>CREATEDBY</th>
            </tr>
           <c:forEach var="rs" items="${rs.rows}">
           		<tr>
           			<td><c:out value="${rs.Sl_no}" /></td>
           			<td><c:out value="${rs.employee_name}" /></td>
           			<td><c:out value="${rs.adress}" /></td>
           			<td><c:out value="${rs.phone_no}" /></td>
           			<td><c:out value="${rs.created_by}" /></td>
           		</tr>
           	</c:forEach>

        </table>
        <h4>  This is a testing file </h4>
        <h5>  simple solutions for modern issues</h5>
        <h6> SOLUTIONS THAT WORKS </h6>
        <button onclick="data();"> click to approve </button>
</body>
<script>
function get ()
{
alert(id);
console.log("TARKA INFOTECH PVT LTD");
console.log(adress);
}
function data() { alert(" working"); console.log(" sreeram is a good boy ")}
</script>
</html>
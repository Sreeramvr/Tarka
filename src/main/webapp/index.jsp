 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
   <h6> SOLUTIONS THAT WORKS </h6>
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
           		<tr>
           		<td>01 </td>
           		<td> sreeram</td>
           		<td> Banglore </td>
           		<td>  9059498633 </td>
           		<td> 21 </td>
           		</tr>
           		<tr>
                           		<td>02</td>
                           		<td> Raghu</td>
                           		<td> Banglore </td>
                           		<td>  987654321 </td>
                           		<td> 21 </td>
                           		</tr>
           	</c:forEach>

        </table>
      
        <h5>  simple solutions for modern issues</h5>

        <button onclick="data();"> click to approve </button>

       
</body>
<script>
function get ()
{
alert(" sreeram ");
console.log("TARKA INFOTECH PVT LTD");

}
function data() { alert(" DEVOPS"); console.log(" sreeram is a good boy ")}
</script>
</html>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Student Form</title>
    <style>
    h1
    {
    color:red;
    }
    table
    {
   border: 2px solid black;
   }
     </style>
</head>

<body>

    <h1> TARKA INFOTECH PVT LTD </h1>
    <button onclick="get();"> CLICK ME </button>
     <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
            <tr th:each="user : ${users}">
                <td th:text="${user.sl_no}"></td>
                <td th:text="${user.employee_name}"></td>
            </tr>
        </table>


</body>
<script>
function get ()
{
alert("WORKING");
console.log("TARKA INFOTECH PVT LTD")
}
</script>
</html>

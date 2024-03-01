
<%@ page import="java.sql.ResultSet" %>

<html>
<head>
    <title>TARKA</title>
    <style>
    table,th,td { border:2px solid black;}
    </style>
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

                <tr>
                    <td>01</td>
                    <td> sreeram</td>
                </tr>

        </tbody>
    </table>
    <button onclick="getdata();"> click me </button>
</body>
<script>
function getdata() { alert("working");}
</script>
</html>

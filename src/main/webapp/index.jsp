<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Student Form</title>
    <style>
    h1
    {
    color:red;
    }
    table,th,td
    {
   border: 2px solid black;
   }
</style>
</head>

<body>

   <h1> TARKA INFOTECH PVT LTD </h1>
 <p>  <button> onclick="get();"> CLICK ME </button> </p>
  <br> </br>
     <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
            <tr>
            <td> 01</td>
            <td> sreeram </td>
            <td> sreeram@tarkasoft.com</td>
            </tr>
           <tr>
                 <td> 02</td>
                  <td> Raghu</td>
                  <td> Raghu@tarkasoft.com</td>
             </tr>
        </table> <br> </br>
        <h4>  This is a testing file </h4> <br> </br>
 <h4>  This is a testing file </h4> <br> </br>
 <h4>  This is a testing file </h4> <br> </br>
</body>
<script>
function get ()
{
alert("WORKING");
console.log("TARKA INFOTECH PVT LTD")
}
</script>
</html>

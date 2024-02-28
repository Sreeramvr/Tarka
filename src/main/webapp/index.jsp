<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Student Form</title>
</head>
<body>
    <h1>Student Form</h1>
    <form action="#" th:action="@{/submitForm}" th:method="post">
        <div>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" th:value="*{name}" required/>
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" th:value="*{email}" required/>
        </div>
        <div>
            <label for="course">Course:</label>
            <input type="text" id="course" name="course" th:value="*{course}" required/>
        </div>
        <div>
            <button type="submit">Submit</button>
        </div>
    </form>
</body>
</html>
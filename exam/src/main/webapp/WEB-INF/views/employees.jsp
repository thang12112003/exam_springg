<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employees Management</title>
</head>
<body>
<h1>Employees Management</h1>

<form method="POST" action="createEmployee">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>

    <label for="wage">Wage:</label>
    <input type="number" id="wage" name="wage" required>

    <button type="submit">Create Employee</button>
</form>

<h2>Employees List</h2>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Wage</th>
    </tr>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.wage}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

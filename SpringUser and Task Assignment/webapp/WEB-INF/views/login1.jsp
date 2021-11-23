<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:aqua;font-family:verdana;">
<h1>Login Details</h1>
<form method="post">
<table>
<tr><td>TaskId:</td><td><input type="number" name="taskid"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
<tr><td>Description:</td><td><input type="text" name="description"/></td></tr>
<tr><td>Status:</td><td><input type="text" name="status"/></td></tr>
<tr><td>Priority:</td><td><input type="number" name="priority"/></td></tr>
<tr><td>Notes:</td><td><input type="text" name="notes"/></td></tr>
<tr><td>Bookmark:</td><td><input type="text" name="bookmark"/></td></tr>
<tr><td>OwnerId:</td><td><input type="number" name="ownerid"/></td></tr>
<tr><td>CreatorId:</td><td><input type="number" name="creatorid"/></td></tr>
<tr><td>CreatedOn:</td><td><input type="datetime-local" name="createdon"/></td></tr>
<tr><td>ModifiedOn:</td><td><input type="datetime-local" name="modifiedon"/></td></tr>
<tr><td colspan="2"><input type="submit" value="Login"/></td></tr>
</table>
</form>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Books</title>

</head>
<body>

	  <div align="center">
        <table border="1">
            <caption>List of books</caption>
            <tr>
                <th>BookId</th>
                <th>Author</th>
                <th>Title</th>
               
            </tr>
            
            <c:forEach var="book" items="${booklist}">
                <tr>
                    <td><c:out value="${book.getBookId()}" /></td>
                    <td><c:out value="${book.getAuthor()}" /></td>
                    <td><c:out value="${book.getTitle()}" /></td>
                  
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
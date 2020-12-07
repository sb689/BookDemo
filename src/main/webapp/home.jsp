<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a Book record</title>
</head>
<body>

	<div>


		<form action="addNewBook">
			<table>
				<tr>
					<th colspan="2">Create a book</th>
				</tr>
				<tr>
					<td><label>Title: </label></td>
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<td><label>Author: </label></td>
					<td><input type="text" name="author"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit"></td>
				</tr>
			</table>
		</form>
	</div>
	<p>
	<div>

		<form action="getBook">
			<Table>


				<tr>
					<th colspan="2">Search book by id</th>
				</tr>
				<tr>
					<td><label>Book id: </label></td>
					<td><input type="text" name="bookid"></td>
				<tr>
					<td></td>
					<td><input type="submit"></td>
				</tr>
			</Table>
		</form>

	</div>

	<p>
	<div>

		<form action="updateBook">
			<Table>

				<tr>
					<th colspan="2">Update book record by id</th>
				</tr>
				<tr>
					<td><label>Book id: </label></td>
					<td><input type="text" name="bookid"></td>
				</tr>

				<tr>
					<td><label>Title: </label></td>
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<td><label>Author: </label></td>
					<td><input type="text" name="author"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit"></td>
				</tr>
			</Table>
		</form>

	</div>

	<p>
	<div>

		<form action="deleteBook">
			<Table>


				<tr>
					<th colspan="2">Delete book by id</th>
				</tr>
				<tr>
					<td><label>Book id: </label></td>
					<td><input type="text" name="bookid"></td>
				<tr>
					<td></td>
					<td><input type="submit"></td>
				</tr>
			</Table>
		</form>

	</div>

	<p>
	<div>

		<form action="findBooksByAuthor">
			<Table>

				<tr>
					<th colspan="2">Find books by author</th>
				</tr>
				<tr>
					<td><label>Author: </label></td>
					<td><input type="text" name="author"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit"></td>
				</tr>
			</Table>
		</form>

	</div>


	<p>
	<div>

		<form action="getAllBooks">

			<Table>
				<tr>
					<th colspan="3">Find all books</th>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td><input type="submit"></td>
				</tr>
			</Table>
		</form>

	</div>


</body>
</html>
# BookDemo

## Project Overview
This is a Spring boot application which has a MVC part to interact with different functionalities and also supports REST API. User can create a book record, update, delete and search with author from the home.jsp. User also can play around with the REST API calls (details provided below). The application utilizes Embedded database H2 to perform CRUD operations.

## App Features
- Follows MVC pattern 
- Implements REST API with GET, POST, DELETE, PUT
- Uses JPA, H2 as data persistance
- Consumes and produces json and xml
- Dependency injection

## How to work with the application
To work with the application please follow below steps.

1)Download the code, open with Eclipse or STS.
2) Clean and build.
2) Run as Spring Boot application
3) Open a browser and type "http://localhost:8080"
4) The above link will send you to the view - home.jsp, in this page, a user can search, create, update or delete a book record.
5) To work with the rest API, please use postman. below are the rest API  calls supported.
	a) http://localhost:8080/books (Get request)

	b) http://localhost:8080/books (Post request)- Provide a Http body as json.
   {
        "title": "Spring Flower",
        "author": "spring"
       
    }

    c) http://localhost:8080/books (Put request)- Provide a Http body as json to update an existing record(if not exists then create a new record).
   {
        "title": "Spring Star",
        "author": " late spring",
         "bookId": 6
     }
     d) http://localhost:8080/books/2 (Delete request)- Provide a book id to delete









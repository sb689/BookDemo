# BookDemo

## Project Overview
This is a Spring boot application that has an MVC part to interact with different functionalities and also supports REST API. Users can create a book record, update, delete, and search from the home.jsp. Users can also play around with the REST API calls (details provided below). The application utilizes Embedded database H2 to perform CRUD operations.

## App Features
- Follows MVC pattern 
- Implements REST API with GET, POST, DELETE, PUT
- Uses JPA, H2 as data persistence
- Consumes and produces json and xml
- Dependency injection

## How to work with the application
To work with the application please follow the below steps.

1. Download the code, open with Eclipse or STS.
2. Clean and build.
3. Run as Spring Boot application
4. Open a browser and type "http://localhost:8080"
5. The above link will send you to the view - home.jsp, in this page, a user can search, create, update, or delete a book record.
6. To work with the rest API, please use postman. below are the rest API  calls supported.
	* `http://localhost:8080/books (Get request)`

	* `http://localhost:8080/books (Post request)`
	Requires a Http body as json to create a book record.
   ```
   {
        "title": "Spring Flower",
        "author": "spring"
       
    }
    ```

    * `http://localhost:8080/books (Put request)`
    Requires a Http body as json to update an existing record(if not exists then create a new record).
   ```
   	{
        "title": "Spring Star",
        "author": " late spring",
         "bookId": 6
    }
    ```
     * `http://localhost:8080/books/2 (Delete request)`- Requires a book id to delete









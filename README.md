# Spring Boot API Example
This is a simple example of a RESTful API built with Spring Boot.


### Introduction
This project demonstrates the implementation of a basic API using Spring Boot. It provides endpoints to manage a collection of books, including adding new books, retrieving all books, and updating/deleting individual books.

### Features
- Spring Boot
- Create and add new books to the collection
- Retrieve a list of all books
- Update the details of a specific book
- Delete a book from the collection

### Technologies
- Java 8
- Spring Boot
- Maven

### Getting Started
To run this project locally, clone the repository and run the following commands:

```
mvn clean install
mvn spring-boot:run
```

### Usage
Once the application is running, you can access the API at `http://localhost:8080/api/books`. The following endpoints are available:

| Method | Endpoint | Description |
| ------ | -------- | ----------- |
| GET | /api/books | Retrieve a list of all books |
| POST | /api/books | Create and add a new book to the collection |

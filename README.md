# Spring Boot CRUD Application for Books

This repository contains a simple CRUD (Create, Read, Update, Delete) application implemented using Spring Boot framework. It provides basic RESTful APIs to perform CRUD operations on a collection of books.

## Features:

- **Create**: Add new books to the database.
- **Read**: Retrieve existing books from the database.
- **Update**: Modify existing books in the database.
- **Delete**: Remove books from the database.

## Technologies Used:

- **Spring Boot**: For rapid application development and dependency management.
- **Spring Data JPA**: For simplified data access and persistence.
- **H2 Database**: For storing book data during development. (You can easily switch to MySQL for production)
- **Maven**: For project build and dependency management.

## Usage:

1. Clone the repository: `git clone https://github.com/yourusername/spring-boot-crud.git`
2. Navigate to the project directory: `cd spring-boot-crud`
3. Run the application using Maven: `mvn spring-boot:run`
4. Access the application endpoints at `http://localhost:8080/api/books`

## API Endpoints:

- **GET `/api/books`**: Retrieve all books.
- **POST `/api/books`**: Create a new book.
- **PUT `/api/books/{id}`**: Update an existing book.
- **DELETE `/api/books/{id}`**: Delete a book by ID.

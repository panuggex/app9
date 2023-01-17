# app9
 
# RESTful API
 User and Task Management RESTful API

This is a RESTful API for managing users and tasks. It allows users to perform CRUD operations on both users and tasks.
Endpoints
Users

    GET /api/users: Retrieves all users
    GET /api/users/{userId}: Retrieves a specific user by their ID
    POST /api/users: Creates a new user
    PUT /api/users/{userId}: Updates an existing user
    DELETE /api/users/{userId}: Deletes an existing user

Tasks

    GET /api/tasks: Retrieves all tasks
    GET /api/tasks/{taskId}: Retrieves a specific task by its ID
    POST /api/users/{userId}/tasks: Creates a new task for a specific user
    PUT /api/tasks/{taskId}: Updates an existing task
    DELETE /api/tasks/{taskId}: Deletes an existing task

Users Tasks

    GET /api/users/{userId}/tasks: Retrieves all tasks for a specific user

Data Models
User

{
    "id": Long,
    "name": String,
    "email": String
}

Task

{
    "id": Long,
    "name": String,
    "description": String,
    "dueDate": Date,
    "userId": Long
}

Prerequisites

    Java 8 or later
    Maven
    Spring Boot
    H2 Database

Getting Started

    Clone the repository: git clone https://github.com/panuggex/user-task-api.git
    Build the project: mvn clean install
    Run the application: mvn spring-boot:run
    You can now access the API at http://localhost:8080

Testing

You can run the test cases using the command mvn test
Built With

    Spring Boot
    H2 Database
    Maven

Authors

    Panashe dube
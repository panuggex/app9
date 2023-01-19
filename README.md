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


Prerequisites

    Java 8 or later
    Maven
    Spring Boot
    H2 Database


Getting Started with the H2 Console:

    Clone the repository: git clone https://github.com/panuggex/app9
    Build the project: mvn clean install
    Run the application: mvn spring-boot:run
    Open a web browser and navigate to http://localhost:8080/h2-console
    In the JDBC URL field, enter "jdbc:h2:mem:testdb" (without the quotes)
    Leave the username and password fields untouched and click "Connect"
    Once connected, you will be able to create view and manipulate the data stored in the H2 database through the H2 console's web interface.
    Please keep in mind that above steps are assuming that you have JAVA and MAVEN installed on your machine


SQL Data model for H2 Database

    Creating Users
    INSERT INTO USERS (ID, NAME, EMAIL, PASSWORD)
    VALUES (1, 'John Doe', 'johndoe@example.com', 'password123');

    Deleting Users
    DELETE FROM users WHERE id = 1;

    Read/Listing Users
    SELECT * FROM users;

    Update Users
    UPDATE users SET email = 'newemail@example.com' WHERE id = 1;

    _____________________________________________________________________________________________________________________________

    Creating Tasks
    INSERT INTO tasks (name, description, date_time, user_id) VALUES ('Task name', 'Task description', '2022-01-01 12:00:00', 1);

    Reading Tasks
    SELECT * FROM tasks WHERE id = 1;

    Updating tasks
    UPDATE tasks SET name = 'New task name', description = 'New task description', date_time = '2022-02-01 12:00:00' WHERE id = 1;

    Deleting tasks
    DELETE FROM tasks WHERE id = 1;

Getting Started with Postman

    Clone the repository: git clone https://github.com/panuggex/app9
    Build the project: mvn clean install
    Run the application: mvn spring-boot:run
    Download and install Postman from https://www.postman.com/
    Open Postman and make a request to the API by entering the URL http://localhost:8080 in the address bar and selecting the appropriate HTTP method (e.g GET, POST, PUT, DELETE)
    You can now test the API's different endpoints and view the responses in Postman.



Data Models for Postman
User

{
    "id": Long,
    "name": String,
    "email": String,
    "password": String,
}

Task

{
    "id": Long,
    "name": String,
    "description": String,
    "dueDate": Date,
    "userId": Long,
}

Testing

You can run the test cases using the command mvn test
Built With

    Spring Boot
    H2 Database
    Maven

Authors

    Panashe dube
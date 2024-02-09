# Employee Manager

## Introduction
Employee Manager is a web application designed to simplify the management of employees within an organization. Built with Spring Boot and Angular, this application provides a user-friendly interface for adding, updating, and deleting employee records. Whether you're managing job titles, email addresses, or contact information, Employee Manager makes it easy to keep your team's data up to date.

## Technologies
- **Backend:** Spring Boot
- **Frontend:** Angular
- **Database:** MySQL (You can mention the database you are using)

## Features
- Create, read, update, and delete (CRUD) operations for employee data.
- Intuitive Angular-based UI for seamless user experience.
- RESTful API design.
- Secure application with Spring Security (if applicable).

## Getting Started

### Prerequisites
- Java 11 or later
- Gradle (for building the Spring Boot application)
- Node.js and npm (for the Angular frontend)
- MySQL (or your chosen database)

### Installation

#### Backend Setup
1. Clone the repository to your local machine.
2. Navigate to the `backend` directory (if your project is structured this way).
3. Configure the `application.properties` file with your database connection details:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```
4. Run the backend application:
    ```bash
    mvn spring-boot:run
    ```

#### Frontend Setup
1. Navigate to the `frontend` directory.
2. Install the dependencies:
    ```bash
    npm install
    ```
3. Run the Angular application:
    ```bash
    ng serve
    ```
4. Open your browser and navigate to `http://localhost:4200` to view the application.

## Usage
After launching the application, you will be presented with the Employee Manager interface. From here, you can:
- **Add a new employee:** Click on the "Add Employee" button and fill in the employee details.
- **View employee list:** All employees are listed on the main page.
- **Edit employee details:** Click the "Edit" button next to an employee to update their information.
- **Delete an employee:** Click the "Delete" button to remove an employee from the database.

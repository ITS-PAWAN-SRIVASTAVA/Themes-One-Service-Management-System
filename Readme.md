# 🌟 **Themes One - Spring Boot Application** 🌟

## Overview 🌐

Welcome to **Themes One One**! This project is a **Spring Boot application** that handles **user authentication**, **appointment management**, **project services**, and **email notifications**. The backend leverages **JWT authentication** for secure access control and uses several other services to manage user details, appointments, and projects.

----------------------------------------------------------------------------------------------------------------------------

## 🚀 **Features**

- **User Authentication**: Secure login system using **JWT** to authenticate users.
- **Appointment Management**: Create, view, and manage appointments within the system.
- **User Registration**: Create and manage users with encrypted passwords.
- **Project Management**: Create and manage projects, services, and their respective details.
- **Email Notifications**: Send notifications (e.g., user registration confirmation, password resets) via email.
- **Role-based Access Control**: Users can be assigned roles to limit access to certain endpoints.
- **Spring Security**: Configured with custom authentication filters for secure access.

----------------------------------------------------------------------------------------------------------------------------

## 🛠️ **Technologies Used**

- **Java**: The main programming language for the backend.
- **Spring Boot**: For building the application.
- **Spring Security**: To handle authentication and authorization via JWT tokens.
- **Spring Data JPA**: For database interactions with MySQL.
- **JWT (JSON Web Tokens)**: For user authentication and authorization.
- **Maven**: To manage dependencies.
- **JavaMailSender**: For sending emails.
- **Lombok**: To reduce boilerplate code in models.

----------------------------------------------------------------------------------------------------------------------------

## 📊 **Project Structure**
### 📁 File Structure

Themes One-One/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── ThemesOne/
│   │   │   │   │   ├── controllers/
│   │   │   │   │   ├── models/
│   │   │   │   │   ├── repository/
│   │   │   │   │   ├── security/
│   │   │   │   │   └── services/
│   ├── resources/
│   │   ├── application.properties
│   │   └── templates/
├── pom.xml
└── README.md


### Folder Breakdown:
controllers/: REST controllers to handle incoming requests.
models/: Contains domain models like User, Appointment, Project, etc.
repository/: Repositories for data access via Spring Data JPA.
security/: Security-related classes, including JWT filters and authentication entry points.
services/: Service layer for business logic like sending emails, managing appointments, and handling users.

----------------------------------------------------------------------------------------------------------------------------

## ⚙️ How to Run the Project

**1. Clone the Repository:**:
git clone https://github.com/yourusername/Themes One-one.git
cd Themes One-one
Install Dependencies: If you're using Maven, run:

**2. properties** :
-spring.datasource.url=jdbc:mysql://localhost:3306/Themes Oneone_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
Run the Application: You can run the project by using the following command:

**3. Run the Application**:
mvn spring-boot:run
The application will be available at http://localhost:8080.

**4.Access Endpoints**: 
Use tool Postman to interact with the RESTful API endpoints. Some key endpoints include:
POST /auth/login: Login and obtain a JWT token.
GET /appointments: Get all appointments (authentication required).
POST /appointments: Create a new appointment (authentication required)

----------------------------------------------------------------------------------------------------------------------------

## 🧑‍💻 Model and Authentication Details
### JWT Authentication
- The system uses JWT for user authentication. The user sends a username and password to the /auth/login endpoint to receive a JWT token.
- Every subsequent request requires the user to include this JWT token in the Authorization header to access protected resources.

### JWT Authentication Flow:
- User logs in with username/password.
- Server validates credentials and returns a JWT token.
- User includes the token in the Authorization header for future requests.
- The system validates the token and grants access based on user roles.

----------------------------------------------------------------------------------------------------------------------------

## 📧 Email Service
The application includes an Email Service that utilizes JavaMailSender to send:

- User registration emails.
- Password reset instructions.
- Appointment reminders

----------------------------------------------------------------------------------------------------------------------------

## 🔧 How to Use the Application
- User Registration & Login: Register a user and use the /auth/login endpoint to get a JWT token.

- Create and Manage Appointments: 
POST to /appointments to create a new appointment.
GET to /appointments to view all appointments for the authenticated user.

- Send Emails:
Use the SendMailService to send emails for notifications like registration confirmations or appointment reminders.

----------------------------------------------------------------------------------------------------------------------------

## ⚠️ Troubleshooting
CORS Issues: If you encounter CORS issues, ensure your frontend is running on the allowed origin (e.g., http://localhost:4200).
JWT Token Expiry: If your token expires, you will need to log in again to get a new token.
Database Connection Errors: Double-check your MySQL database configuration in application.properties.
🤝 Contributing
We welcome contributions! Feel free to fork this repository, make changes, and submit pull requests.

----------------------------------------------------------------------------------------------------------------------------

## 📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

----------------------------------------------------------------------------------------------------------------------------

## 🎯 Future Improvements
Advanced Role Management: Implement more granular role-based access control (e.g., admin, user, manager).
Appointment Notifications: Add more robust email reminders for upcoming appointments.
User Profile Management: Allow users to update their profile and change their password securely.
Enhanced Security: Introduce two-factor authentication for added security.

----------------------------------------------------------------------------------------------------------------------------

## ✨ What's New?
JWT Authentication: Added secure token-based authentication using JWT.
Appointment Management: Integrated appointment booking and viewing features.
Email Service: Implemented an email service for sending notifications and reminders.

----------------------------------------------------------------------------------------------------------------------------

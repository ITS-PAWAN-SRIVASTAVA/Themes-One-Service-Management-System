CREATE DATABASE themes;

USE themes;


CREATE TABLE User (
    id INT AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    phone VARCHAR(20),
    email VARCHAR(255) UNIQUE,
    password VARCHAR(255),
    username VARCHAR(255),
    createdDate VARCHAR(50),
    userType VARCHAR(50)
);

CREATE TABLE Appointment (
    id INT AUTO_INCREMENT PRIMARY KEY,
    aFirstname VARCHAR(255),
    aLastname VARCHAR(255),
    aEmail VARCHAR(255),
    aPhoneNumber VARCHAR(20),
    aCity VARCHAR(255),
    aState VARCHAR(255),
    aStreetAddress VARCHAR(255),
    aZipCode VARCHAR(20),
    createdDate DATE,
    aWorkingTime VARCHAR(50),
    aWorkType VARCHAR(50),
    status VARCHAR(50),
    aUserId INT,
    FOREIGN KEY (aUserId) REFERENCES User(id)
);

CREATE TABLE ContractorDetails (
    id INT AUTO_INCREMENT PRIMARY KEY,
    gender VARCHAR(10),
    aadharIdNo VARCHAR(50),
    username VARCHAR(255),
    flatNo VARCHAR(50),
    city VARCHAR(255),
    state VARCHAR(255)
);

CREATE TABLE Project (
    projectId INT AUTO_INCREMENT PRIMARY KEY,
    pCreatedDate DATE,
    pSerialNo VARCHAR(50),
    userId INT,
    FOREIGN KEY (userId) REFERENCES User(id)
);

CREATE TABLE ProjectAddressDetails (
    id INT AUTO_INCREMENT PRIMARY KEY,
    address1 VARCHAR(255),
    address2 VARCHAR(255),
    city VARCHAR(255),
    pinCode VARCHAR(20),
    latitude VARCHAR(20),
    longitude VARCHAR(20),
    projectId INT,
    FOREIGN KEY (projectId) REFERENCES Project(projectId)
);

CREATE TABLE ProjectServiceDetails (
    projectServiceId INT AUTO_INCREMENT PRIMARY KEY,
    serviceId INT,
    projectId INT,
    FOREIGN KEY (projectId) REFERENCES Project(projectId)
);

CREATE TABLE ProjectWorkerDetails (
    id INT AUTO_INCREMENT PRIMARY KEY,
    workerId INT,
    projectId INT,
    FOREIGN KEY (projectId) REFERENCES Project(projectId)
);

CREATE TABLE Service (
    serviceId INT AUTO_INCREMENT PRIMARY KEY,
    serviceName VARCHAR(255)
);

CREATE TABLE Skill (
    skillId INT AUTO_INCREMENT PRIMARY KEY,
    skillName VARCHAR(255)
);

CREATE TABLE JWTRequest (
    email VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255)
);

CREATE TABLE JWTResponse (
    username VARCHAR(255),
    token VARCHAR(255)
);

CREATE TABLE UserWithDetails (
    username VARCHAR(255),
    city VARCHAR(255)
);



-- Inserting Users
INSERT INTO User (firstname, lastname, phone, email, password, username, createdDate, userType) VALUES
('John', 'Doe', '1234567890', 'john.doe@example.com', 'password123', 'john.doe@example.com', '2024-01-01', 'user'),
('Jane', 'Smith', '0987654321', 'jane.smith@example.com', 'password456', 'jane.smith@example.com', '2024-01-01', 'admin');

-- Inserting Services
INSERT INTO Service (serviceName) VALUES
('Plumbing'),
('Electrical'),
('Cleaning');

-- Inserting Skills
INSERT INTO Skill (skillName) VALUES
('Carpentry'),
('Welding'),
('Masonry');

-- Inserting Projects
INSERT INTO Project (pCreatedDate, pSerialNo, userId) VALUES
('2024-01-01', 'P001', 1),
('2024-02-01', 'P002', 2);

-- Inserting Appointments
INSERT INTO Appointment (aFirstname, aLastname, aEmail, aPhoneNumber, aCity, aState, aStreetAddress, aZipCode, createdDate, aWorkingTime, aWorkType, status, aUserId) VALUES
('Alice', 'Johnson', 'alice@example.com', '1112223333', 'Springfield', 'IL', '123 Elm St', '62701', '2024-01-01', '9 AM - 5 PM', 'Consultation', 'Scheduled', 1);

-- Inserting ContractorDetails
INSERT INTO ContractorDetails (gender, aadharIdNo, username, flatNo, city, state) VALUES
('Female', '1234-5678-9012', 'alice.contractor', 'A1', 'Springfield', 'IL');

-- Inserting Project Address Details
INSERT INTO ProjectAddressDetails (address1, address2, city, pinCode, latitude, longitude, projectId) VALUES
('456 Oak St', 'Apt 2', 'Springfield', '62702', '40.123', '-89.123', 1);

-- Inserting Project Service Details
INSERT INTO ProjectServiceDetails (serviceId, projectId) VALUES
(1, 1), -- Plumbing for Project 1
(2, 2); -- Electrical for Project 2

-- Inserting Project Worker Details
INSERT INTO ProjectWorkerDetails (workerId, projectId) VALUES
(1, 1), -- Worker 1 assigned to Project 1
(2, 2); -- Worker 2 assigned to Project 2


SELECT * FROM User;
SELECT * FROM Appointment;
SELECT * FROM ContractorDetails;
SELECT * FROM Project;
SELECT * FROM ProjectAddressDetails;
SELECT * FROM ProjectServiceDetails;
SELECT * FROM ProjectWorkerDetails;
SELECT * FROM Service;
SELECT * FROM Skill;
SELECT * FROM JWTRequest;
SELECT * FROM JWTResponse;
SELECT * FROM UserWithDetails;



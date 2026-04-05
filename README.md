----------------------------💰 FINANCE DASHBOARD BACKEND PROJECT (Spring Boot) -----------------------------------
📌 Overview

This project is a backend system for a finance dashboard. It manages financial records, handles users, and gives meaningful insights. Built with care. Not just code, but a structured flow of logic.
It shows clean architecture. Role-based access. And proper REST API design. Simple on surface, but thoughtfully designed inside.

🚀 FEATURES :
👤 USER AND ROLE MANAGEMENT :

1] We have roles here. ADMIN, ANALYST, VIEWER. Each one behaves differently. That’s the idea.
2] Access is secured using Spring Security with JWT. Not just open endpoints. Everything controlled.
3] Users can be active or inactive. A small detail, but important in real systems.

💵 Financial RECORDS :

This part handles money data.
You can create, read, update, and delete records. Simple CRUD
Each record contains:
Amount
Type (INCOME / EXPENSE)
Category
Date
Notes
Soft delete is used. So data is not lost, just hidden. Safer this way.

📊 DASHBOARD SUMMARY :
Here comes the interesting part.
The system calculates:
Total Income
Total Expense
Net Balance
Category-based insights

🔐 SECURITY :
-Security is handled using JWT.
-Token-based authentication
-Role-based authorization
-Stateless sessions
-No unnecessary session storage. Clean and scalable approach.

🛠️ TECH STACK  : 
Java 17
Spring Boot
Spring Security
Spring Data JPA (Hibernate)
H2 Database
Maven

🏗️ PROJECT STRUCTURE :
com.example.financedashboard

├── controller       → API endpoints  
├── service          → Business logic  
├── repository       → Database layer  
├── entity           → JPA entities  
├── dto              → Data transfer objects  
├── security         → JWT & Security config  
├── exception        → Global exception handling  
└── enums            → Role definitions  

Everything has its place. Nothing random.

▶️ HOW TO RUN :
Clone the repository
Open it in Spring Tool Suite (STS)
Run as Spring Boot App

That’s it. Should work smoothly.

🌐 ACCESS : 
H2 Console is available here:
http://localhost:8081/h2-console
Use this JDBC URL: jdbc:h2:mem:testdb

🔑 API Testing :

Login (Get Token)
POST /api/auth/login?email=test@gmail.com&role=ADMIN
Use Token
Authorization: Bearer <token>

📊 Example APIs :
Method	Endpoint	Description
POST	/api/finance	Create record
GET	/api/finance	Get records
PUT	/api/finance/{id}	Update
DELETE	/api/finance/{id}	Soft delete

⚠️ ASSUMPTIONS :
Some shortcuts taken here. Just for simplicity.

Authentication is mocked using JWT
H2 database is used instead of production DB
Roles are passed during login, not fetched from DB
Not perfect. But good for learning and demonstration.

💡 DESIGN DECISION :

A few decisions shaped this project.
DTOs are used to separate layers. Keeps things clean.
Soft delete avoids data loss.
Service layer handles logic properly.
Pagination added for scalability.
Small choices. Big impact later.

📷POSTMAN API Testing :
==========These below are some testing in postman screenshots ========================
1] POST : http://localhost:8081/api/auth/login?email=admin@example.com&role=ADMIN
<img width="940" height="498" alt="image" src="https://github.com/user-attachments/assets/2c6aab50-1364-4172-9aed-d9b85c3e02d9" />

2]POST : http://localhost:8081/api/finance
<img width="940" height="529" alt="image" src="https://github.com/user-attachments/assets/29b2c0bb-5f31-4a6f-8e55-751f277faf52" />

 ------CREATE AN EXPENSE RECORD
3]POST : http://localhost:8081/api/finance
<img width="940" height="529" alt="image" src="https://github.com/user-attachments/assets/574d6284-7c4b-451e-a4c3-12b9571c7b84" />

<img width="940" height="529" alt="image" src="https://github.com/user-attachments/assets/f4e8bcab-e8fd-462b-9626-da855be81188" />

4] GET : http://localhost:8081/api/finance
<img width="940" height="529" alt="image" src="https://github.com/user-attachments/assets/735dadad-1bc1-4f41-906c-c74cd4c8459a" />
<img width="940" height="529" alt="image" src="https://github.com/user-attachments/assets/add11521-cbb9-4190-a5cb-e794bbdb1130" />

 PART 3: TEST SECURITY (VERY IMPORTANT)
This shows your role-based security is working!
<img width="940" height="529" alt="image" src="https://github.com/user-attachments/assets/c8b67235-05d8-4d96-a0ed-908a8bf5af1c" />
✅ This is CORRECT! VIEWER cannot access finance APIs - only ADMIN and ANALYST can.

<img width="940" height="529" alt="image" src="https://github.com/user-attachments/assets/b8a7d2bd-7678-4b1d-9274-066f7e519e9d" />



🧠LEARNINGS :

While building this, many things became clear.
Secure backend with Spring Security
Structuring APIs in a clean way
Handling validation and exceptions
Thinking beyond just “working code”
It’s more about building something maintainable.

👩‍💻 AUTHOR
Srushti Basavaraddi

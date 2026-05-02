# User Order System with Caching (Spring Boot + JPA)

## 📌 Project Description

This project is a simple backend system similar to an e-commerce application like Amazon/Flipkart. It demonstrates how a user can have multiple orders and how caching can be used to reduce database calls.

The application is built using Spring Boot and JPA (Hibernate) with MySQL as the database.

---

## 🎯 Objectives

* Understand One-to-Many relationship (User → Orders)
* Learn JPA/Hibernate mapping
* Implement caching using HashMap
* Reduce database calls using cache

---

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL
* Maven

---

## 📁 Project Structure

com.example.cachingdemo
│
├── entity → User, Order
├── repository → UserRepository
├── service → UserService (Caching Logic)
└── main class → CachingDemoApplication

---

## 🔗 Relationship

* One User → Many Orders
* Implemented using @OneToMany and @ManyToOne

---

## ⚙️ Configuration

Update database details in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/testdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8081

---

## ▶️ How to Run

1. Create database in MySQL:
   CREATE DATABASE testdb;

2. Open project in Eclipse / IntelliJ

3. Update database username and password

4. Run the main class:
   CachingDemoApplication.java

---

## ⚡ Functionality

When getUser(id) is called:

* First time → Data is fetched from database and stored in cache
* Second time → Data is fetched from cache

---

## ✅ Sample Output

Fetching from Database...
Akarsh Mobile Laptop

Fetching from Cache...
Akarsh Mobile Laptop

---

## 💡 Key Concepts

* JPA Entity Mapping
* One-to-Many Relationship
* Caching using HashMap
* Spring Boot Application Structure

---

## 📌 Conclusion

This project demonstrates how backend systems handle relationships and caching. It shows how caching improves performance by reducing database calls.

---



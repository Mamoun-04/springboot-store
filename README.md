# Car Dealership Manager – Spring Boot Backend

This is the backend API for the Car Dealership Manager project, built with **Spring Boot**.  
It provides endpoints to manage:
- Car inventory
- Salespeople
- Sales records

Deployed using **Docker** on [Render] @ (https://springboot-store.onrender.com/), with **Supabase Postgres** as the database.

---

## 🚗 Features
- **Cars**: Add, update, delete, and view cars (make, model, VIN, year, cost, sold flag)
- **Salespeople**: Manage team members and track number of sales
- **Sales**: Log sales with sale price, car ID, salesperson ID — automatically updates car as sold and salesperson’s count

---

## ⚙️ Tech Stack
- **Spring Boot 3**
- **Spring Data JPA / Hibernate**
- **Supabase Postgres** (SQL schema + hosted DB)
- **Docker** (containerized build and deployment)
- **Render** (deployment hosting)

---

## 📡 API Endpoints
- `/cars` – Manage car inventory
- `/salespeople` – Manage sales team
- `/sales` – Log and track sales  
   Example:  
   ```http
   POST /sales?carId=1&salespersonId=2&salePrice=20000

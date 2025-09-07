# 💳 Full-Stack Billing & Payment Application

A modern full-stack web application built with **Spring Boot**, **React (Vite)**, **MySQL**, **AWS**, and **Razorpay** for seamless billing and payment processing.

---

## 🚀 Features
- 🔐 **Admin-Only Authentication** – Only the **admin** can log in and create/manage user accounts.
- 👤 **Admin Credentials** –  
  - **Email:** `Admin@example.com`  
  - **Password:** `Admin@123`
- 📦 **Product & Category Management** – CRUD operations with MySQL.
- 🛒 **Cart & Orders** – Add/remove products, generate bills.
- 💳 **Payment Integration** – Razorpay integration for real-time payments.
- ☁️ **Cloud Deployment** – Hosted with AWS for scalability.
- 📊 **Analytics Dashboard** – Track sales, orders, and revenue.
- ⚡ **Frontend with React + Vite** – Super-fast and responsive UI.
- 🌐 **Backend with Spring Boot** – REST APIs with secure endpoints.
- 🧪 **API Testing with Postman** – All backend APIs tested with Postman collections.

---

## 🛠 Tech Stack
**Frontend**
- React + Vite
- Tailwind CSS / Bootstrap
- Axios (API calls)

**Backend**
- Spring Boot (Java 17)
- Spring Security (JWT Auth)
- Maven

**Database**
- MySQL 

**Payments**
- Razorpay API Integration

**Cloud / Infra**
- AWS (S3)

**Testing**
- Postman (API testing & collection export)

🔑 Authentication <br>

Only the admin can log in.
Admin can create and manage user accounts. <br>
Default Admin Credentials:<br>

Email: Admin@example.com<br>
Password: Admin@123<br>

🔑 Environment Variables  <br>
Backend (server/src/main/resources/application.properties) <br>
spring.datasource.url=jdbc:mysql://localhost:3306/billing_app <br>
spring.datasource.username=your_user <br>
spring.datasource.password=your_pass <br>

razorpay.key_id=your_key_id <br>
razorpay.key_secret=your_secret <br>

aws.access.key=YOUR_KEY_HERE <br>
aws.secret.key=YOUR_SECRET_HERE <br>
aws.region=ap-south-1 <br>
aws.bucket.name=YOUR_BUCKET_NAME <br>
Backend (server/src/main/resources/application.properties) <br>
spring.datasource.url=jdbc:mysql://localhost:3306/billing_app <br>
spring.datasource.username=your_user <br>
spring.datasource.password=your_pass <br>

razorpay.key_id=your_key_id <br>
razorpay.key_secret=your_secret

aws.access.key=YOUR_KEY_HERE <br>
aws.secret.key=YOUR_SECRET_HERE <br>
aws.region=ap-south-1 <br>
aws.bucket.name=YOUR_BUCKET_NAME <br>

Frontend (client/.env) <br>
VITE_API_BASE_URL=http://localhost:8080/api <br>
VITE_RAZORPAY_KEY=your_key_id <br>
VITE_API_BASE_URL=http://localhost:8080/api <br>
VITE_RAZORPAY_KEY=your_key_id <br>

🧪 API Testing with Postman <br>

All backend endpoints have been thoroughly tested using Postman. <br>
A Postman collection (postman.json) is included in the repo for easy import.

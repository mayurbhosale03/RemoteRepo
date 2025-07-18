# E-commerce Backend API

A robust and scalable e-commerce backend built with Spring Boot. This application provides a RESTful API for managing products, users, orders, and payment processing.

---

## 🚀 Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

* **Java Development Kit (JDK) 17 or higher**
* **Maven 3.8+** (or Gradle if you're using Gradle)
* **MySQL 8.0+** (or your preferred database)
* **IDE of your choice** (e.g., IntelliJ IDEA, VS Code)

### Installation

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/your-username/your-repo-name.git](https://github.com/your-username/your-repo-name.git)
    cd your-repo-name
    ```

2.  **Configure the database:**
    * Create a MySQL database named `ecommerce_db`.
    * Update the database configuration in `src/main/resources/application.properties` (or `application.yml`).
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
    spring.datasource.username=your-username
    spring.datasource.password=your-password
    spring.jpa.hibernate.ddl-auto=update
    ```

3.  **Build and run the application:**
    * **Using Maven:**
      ```bash
      ./mvnw clean install
      ./mvnw spring-boot:run
      ```
    * **From your IDE:**
      * Open the project in your IDE.
      * Locate the main application class (e.g., `EcommerceApplication.java`).
      * Right-click and run it.

---

## 🧩 API Endpoints

The API is documented using Swagger/OpenAPI. Once the application is running, you can access the documentation at:

**[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)**

### Key Endpoints:

* **Authentication:**
    * `POST /api/auth/register` - User registration
    * `POST /api/auth/login` - User login
* **Products:**
    * `GET /api/products` - Get all products
    * `GET /api/products/{id}` - Get a single product
    * `POST /api/products` - Create a new product (Admin only)
* **Orders:**
    * `POST /api/orders` - Place an order
    * `GET /api/users/{userId}/orders` - Get a user's order history

---

## 🛠️ Built With

* **Spring Boot 3.2.x** - The framework used for the backend.
* **Spring Security** - For authentication and authorization.
* **Spring Data JPA** - For data access and persistence.
* **MySQL** - The relational database.
* **Maven** - Dependency management.
* **Lombok** - To reduce boilerplate code.

---

## 🤝 Contributing

We welcome contributions! Please see the `CONTRIBUTING.md` file for details on how to get started.

---

## 🛡️ License

This project is licensed under the MIT License - see the `LICENSE` file for details.

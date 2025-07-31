# Gupshup.AI 🗳️

A social voting and suggestion platform built using Java and Spring Boot, where users can anonymously post thoughts, vote on suggestions, and receive structured, democratic feedback.

## 🚀 Features

- ✅ **Thought Posting**: Users can anonymously share their thoughts.
- 📥 **Public Suggestions**: Other users can provide suggestions on these thoughts.
- 👍 **Voting System**: Each suggestion can be upvoted or downvoted.
- 🔐 **OAuth 2.0 Authentication**: Secure user authentication and session management.
- 🧠 **Modular Design**: Follows SOLID principles and patterns like MVC, Strategy, and Builder.
- ✅ **RESTful APIs**: Clean, versioned, and tested API endpoints with Postman.
- 🧩 **Microservices Ready**: Architecture designed to be scalable and maintainable.
- 🐘 **PostgreSQL**: Integrated with relational database for storing all entities.
- 📄 **DTO Layer**: Clean separation between entity and response/request objects.
- 🧪 **Unit Tests**: Core functionality covered by test cases.

## 🛠️ Tech Stack

- **Backend**: Java 17, Spring Boot
- **Security**: OAuth 2.0, Spring Security
- **Database**: PostgreSQL
- **Testing**: JUnit, Mockito, Postman
- **Build Tool**: Maven
- **Architecture**: Follows MVC + SOLID + Design Patterns

## 🧪 API Testing

All major APIs have been tested using Postman for:
- Successful data flow (POST, GET, DELETE)
- Validation errors
- Security and access control

## 📌 How to Run

```bash
# Step 1: Clone the repository
git clone https://github.com/NUPUR0307/Gupshup.AI.git

# Step 2: Navigate to project directory
cd Gupshup.AI

# Step 3: Run using Maven
./mvnw spring-boot:run

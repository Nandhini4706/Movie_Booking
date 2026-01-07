# 🎬 Movie Ticket Booking System (Console – Java)

A simple console-based Movie Ticket Booking application developed using Java.  
This project is designed to demonstrate object-oriented programming concepts, clean architecture, and logical flow handling.

---

## 📌 Project Overview

The Movie Ticket Booking System allows a user to:
- View available movies
- Book one or multiple tickets for a selected movie
- View all booked tickets
- Calculate total ticket price dynamically

The application follows a **service-based design** with proper separation of concerns.

---

## 🧱 Project Structure

src/
├─ Model/
│ ├─ User.java
│ ├─ Movie.java
│ └─ Ticket.java
├─ Service/
│ └─ BookingService.java
└─ Main.java

---

## 🧠 Design Approach

- **Class Diagram First**: The system was designed using a class diagram before coding.
- **Separation of Concerns**:
  - Model classes store data only
  - Service class handles business logic
  - Main class controls user interaction and flow
- **HAS-A Relationships**:
  - Ticket has a User
  - Ticket has a Movie
- **Service Layer Pattern**:
  - All booking logic is handled inside `BookingService`

---

## 🧩 Classes Description

### 🔹 User
Stores user-related details.
- userId
- userName

### 🔹 Movie
Stores movie information.
- movieId
- movieName
- moviePrice
- movieClass

### 🔹 Ticket
Represents a booked ticket.
- ticketId
- user (HAS-A)
- movie (HAS-A)
- theatre
- finalPrice

### 🔹 BookingService
Handles business logic.
- calculateBill()
- bookTicket()
- viewTickets()

### 🔹 Main
- Handles user input
- Displays menu
- Calls BookingService methods

---

## ⚙️ Key Features

- Book multiple tickets in one go
- Automatic ticket ID generation
- Total price calculation for multiple tickets
- Persistent ticket list using the same service instance
- Clean and readable console output

---

## 💡 Concepts Used

- Object-Oriented Programming (OOP)
- Encapsulation
- HAS-A relationship
- Service Layer Design
- Collections (HashMap, ArrayList)
- Control Flow (loops, conditionals)

---

## ▶️ How to Run

1. Clone the repository
2. Open the project in any Java IDE
3. Run `Main.java`
4. Follow console instructions

---

## 🎯 Learning Outcome

This project helped in understanding:
- How to convert a class diagram into code
- Where to place business logic
- How to think logically step by step
- How to structure a real-world Java console application

---

## 👩‍💻 Author

**Nandhini**  
(Java | OOP | Console Applications)

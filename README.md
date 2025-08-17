# 📝 LeaveLogic — Employee Leave & Salary Management System

**LeaveLogic** is a simple **Java console-based application** for managing employees, their leave records, and salary calculations.
It demonstrates the power of **Object-Oriented Programming (OOP)** concepts like **abstraction, inheritance, and polymorphism** in a real-world HR use case.

---

## 🚀 Features

* ➕ Add **Permanent** or **Temporary** employees.
* 🏖️ Apply leave (only **1 paid leave** is allowed per employee).
* 📑 View leave records of employees.
* 💰 Calculate salary after applying penalties for extra leaves.
* 👥 View all employees with their details.
* 🖥️ Easy-to-use **menu-driven console system**.

---

## 🏗️ Tech Stack

* **Java (JDK 8+)**
* **Console I/O** (Scanner, System.out)

---

## 📂 Project Structure

```
├── Employee.java            # Abstract Employee class
├── PermanentEmployee.java   # Permanent Employee implementation
├── TemporaryEmployee.java   # Temporary Employee implementation
├── Leave.java               # Leave record class
├── Main.java                # Entry point with menu-driven program
```

---

## 📜 Business Rules

* ✅ Each employee can take **1 paid leave**.
* ❌ More than 1 leave → penalty on salary:

  * **Permanent Employee:** ₹100 per extra leave
  * **Temporary Employee:** ₹50 per extra leave

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/LeaveLogic.git
   cd LeaveLogic
   ```
2. Compile the code:

   ```bash
   javac *.java
   ```
3. Run the program:

   ```bash
   java Main
   ```

---

## 📌 Sample Menu

```
===== Leave Tracker Menu =====
1. Add Permanent Employee
2. Add Temporary Employee
3. Apply Leave
4. View Leave Records
5. Calculate Salary
6. View All Employees
7. Exit
```

---

## 🎯 Learning Outcomes

* Applying **OOP concepts** (abstraction, inheritance, polymorphism).
* Using **Collections (Map, List)** for managing employees.
* Building a **menu-driven HR application** in Java.

---

### 🔖 Tagline

💡 *“LeaveLogic – Simple, Smart & Effective Leave + Salary Tracker in Java”*

---


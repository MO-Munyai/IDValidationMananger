# ID Validation Manager

A secure, robust, personalized, and database-driven web application developed for the **Department of Home Affairs (DHA)** as part of the **Identification Document Verification Project (ID-VP)**.

This Java EE project validates South African ID numbers using **Luhn’s algorithm**, manages user roles (Administrator, Data Capturer, Manager), and stores captured data in an embedded **Apache Derby database**.

## 🔒 Problem Statement

The application was developed to assist the DHA in verifying the authenticity of South African ID numbers by checking:

- If the ID number has exactly **13 digits**
- If it complies with **Luhn’s algorithm**
- If gender, citizenship, and date of birth match expected values

The system has three user roles:

- **Administrator**: Creates users (file realm-based)
- **Data Capturer**: Checks ID validity and stores valid entries
- **Manager**: Views captured IDs and total counts per data capturer

---

## 📌 Features

### ✅ ID Validation (Luhn’s Algorithm)
- Supports the full Luhn check:
  - Doubles every even-position digit
  - Reduces values > 9 using modulo
  - Verifies checksum digit

### 👥 Role-Based Access
- **Admin** creates two users:
  - `normal_user / 123` – Role: `data_capturer`
  - `super_user / 123` – Role: `manager`
- Users must enter:
  - Their **name**
  - A **unique employee ID** at the start of a session

### 💬 Session Management
- User sessions are maintained and personalized using session tracking
- The app refers to itself as "**Siri**" throughout conversations
- User and assistant names are displayed dynamically

### 🗂️ Database-Driven
- All valid IDs are persisted in the embedded **Derby DB**
- Fields stored:
  - ID Number
  - Timestamp
  - Capturer Name
  - Capturer Employee ID
- Managers can view:
  - All captured IDs
  - Captures by specific employees

### ⚠️ Robust Error Handling
- Prevents unauthorized access to restricted features
- Validates ID input and handles bad input gracefully
- Displays user-friendly error messages for:
  - Invalid login attempts
  - Access control violations
  - Invalid ID submissions
  - Non-existent routes/pages

---

## 💻 Technologies Used

- Java EE (Servlets, JSP)
- Apache Derby DB (Embedded)
- NetBeans IDE
- GlassFish Server (or compatible)

---

## 🔧 Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/MO-Munyai/IDValidationMananger.git

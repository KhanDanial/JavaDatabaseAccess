# Employee Database Fetcher

This is a simple Java program to connect to a MySQL database, retrieve employee details from the `employees` table, and print them in a user-friendly format.

## Purpose

The project demonstrates basic Java database connectivity using JDBC, MySQL, and error handling. It is designed to showcase how to structure a Java application with external libraries, handle exceptions effectively, and organize code and resources in a clean and reusable way.

## Key Features

- Connects to a MySQL database using JDBC.
- Retrieves and displays employee information.
- Handles SQL and general exceptions, ensuring resources are properly closed.
- Organized repository structure for easy navigation.
- Environment variable configuration for secure and flexible database setup.

## Prerequisites

- **Java 8+**: Ensure that Java is installed and set up on your system.
- **MySQL Server**: You must have a MySQL database with an `employees` table.
- **MySQL Connector JAR**: Download the MySQL JDBC driver (`mysql-connector-java-8.0.x.jar`) and place it in the `lib/` directory.

## Setup

1. Clone this repository:
    ```bash
    git clone https://github.com/yourusername/employee-database-fetcher.git
    cd employee-database-fetcher
    ```

2. Set up your `.env` file for database configuration:
    - Copy `.env.example` to `.env`:
      ```bash
      cp .env.example .env
      ```
    - Open `.env` and replace placeholder values with your actual database credentials.

3. Compile and run the program:
    - Use the shell scripts provided:
      ```bash
      ./scripts/compile.sh
      ./scripts/run.sh
      ```

## Usage

The application fetches and prints a list of employees from the `employees` table. It expects a table with columns: `id`, `first_name`, `last_name`, and `department`.

## Commands

- **Compile**: `./scripts/compile.sh`
- **Run**: `./scripts/run.sh`

## Environment Variables

- `.env` file is used to configure the database connection:
  - `DB_URL`: The URL of the MySQL database.
  - `DB_USER`: Your MySQL username.
  - `DB_PASSWORD`: Your MySQL password.

Example `.env` file:
```dotenv
DB_URL=jdbc:mysql://localhost:3306/your_database_name
DB_USER=your_username
DB_PASSWORD=your_password

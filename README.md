# Java REST API Client – WeatherMate

"COMPANY": CODETECH IT SOLUTIONS

"NAME": S VENKATESH

"INTERN ID": CT04DH921

"DOMAIN": JAVA PROGRAMMING

"DURATION": 4 WEEKS

"MENTOR": NEELA SANTOSH KUMAR

**WeatherMate** is a simple and clean Java console-based application that connects to a public weather REST API and displays live weather details based on the city name provided by the user. This was developed as part of Internship Task 2 from CodeTechIT Solutions.

## Objective of the Project

This project demonstrates how to build a **REST API client using Java**. The main idea is to understand how to:

- Connect Java code to an external public API using HTTP.
- Fetch JSON-formatted data from the internet.
- Parse that JSON using a library.
- Display it to the user in a structured and clean console interface.

This helps in understanding **real-time data consumption**, modular code design, and Java file handling.

## Technologies and Tools Used (Explained Step-by-Step)

1. **Java Programming (JDK 8+)**
   - Core programming language used for the entire project.
   - Used to write the logic, structure, and user interaction.

2. **HTTPURLConnection**
   - Java's in-built class to make HTTP requests.
   - Used to send GET requests to the weather API URL.

3. **Public REST API (WeatherAPI.com or similar)**
   - A free weather API used to get live weather data in JSON format.
   - The city name is passed in the URL, and real-time data is returned.

4. **Gson Library (Google)**
   - Used to parse the JSON response received from the API.
   - Helps convert raw JSON into Java objects for easy access.

5. **OOP Concepts in Java**
   - Classes like `WeatherData`, `WeatherAPIClient`, and utility classes are used to make the code modular and clean.

6. **Git and GitHub**
   - Version control tool used to track project progress and submit final code securely.
   - Used `.gitignore` to avoid uploading unnecessary and sensitive files.

## How the Project is Organized

The project is kept very clean and organized in a way that each file serves one purpose. Here's how it works:

### 1. `App.java` (Entry point)
- This is the main class that starts the program.
- It asks the user to enter a city name.
- Passes that city name to the API client and displays the result.

### 2. `WeatherAPIClient.java`
- Contains the logic to call the weather API URL.
- It sends the HTTP request and gets the JSON response.
- Earlier, this file contained a real API key, but it has now been removed and replaced with `"demo"` for security.

### 3. `WeatherData.java`
- This is a **model class**.
- It holds the data like city name, temperature, and description that we extract from the JSON response.

### 4. `JsonParserUtil.java`
- A helper utility that uses **Gson** to parse the raw JSON response.
- Converts the response into a `WeatherData` object.

### 5. `lib/gson-2.10.1.jar`
- This is the external library (from Google) that helps with JSON parsing.
- Required when compiling and running the project.

## What Was Removed and Why

### `.class` Files
These are compiled files (binary output of Java code). They:
- Are not useful for others reading your code.
- Can be regenerated from `.java` files.
- Were excluded using `.gitignore`.

### API Key
- Initially, the real API key was hardcoded into the project.
- It was later completely removed from **all Git history** using Git commands.
- Now replaced with `"demo"` in the code for safe and public sharing.

## How to Compile and Run the Project

Make sure you have Java installed. Then follow these steps:

### 1. Open terminal and navigate to project folder

cd REST-API-CLIENT

### 2. Compile all Java files with Gson library

javac -cp "lib/gson-2.10.1.jar" src/*.java

### Run the main program

java -cp "lib/gson-2.10.1.jar;src" App

## Example Console Output

![Image](https://github.com/user-attachments/assets/574db9dc-c68e-4861-bd8a-704f144c46ae)

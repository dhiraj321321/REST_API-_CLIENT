# REST_API-_CLIENT
**COMPANY**: CODTECH IT SOLUTIONS

**NAME**: DHIRAJ PARIDA

**INTERN ID**:CT08EMF

**DOMAIN**:JAVA DEVELOPMENT

**BATCH DURATION**: January 5th, 2025 to February 5th, 2025

**MENTOR NAME**: Neela Santhosh Kumar 

**DESCRIPTION OF TASK**:Objective: 
The aim of this project is to design a Java-based application that retrieves real-time weather data for a given city by using the OpenWeather API and presents the weather information in a structured and user-friendly format. The application asks for a city name, fetches the weather data from the API, and then displays key details such as temperature, weather conditions, and city name.

Key Features:
The application takes user input (city name) to fetch weather information.
API Integration: The project integrates with the OpenWeather API to fetch real-time weather data.
Data Parsing: The fetched weather data is in JSON format and parsed to extract key details, such as city name, temperature, and weather description.
Error Handling: Proper error handling is implemented to manage invalid city names, API errors, and null values.
Output:
Weather details will be displayed through the application in the following structure:
City Name
Temperature in Celsius
Weather Description, for example, "clear sky," "rainy"
Extensibility: The application is designed to be easily extensible to add more weather data (humidity, wind speed, etc.)
Technology Stack:
Java (JDK 11 or higher): Core logic of the application is written.
OpenWeather API: This is used for real-time weather data.
HttpClient (Java 11): It will be used for sending HTTP requests to fetch data from the OpenWeather API.
Jackson: Is Used to parse JSON response coming back from OpenWeather API
Works
Request an input city
Application gets to format API address to send this request for opening weather regarding any entered city in the query and receives JSON coming back through sending an HTTP request to OpenWeather API.
This extracted key information regarding city name, temperature, and description of weather conditions from the JSON received.
Information of weather presented in a readably human-like way.
Proper error messages related to an entered wrong city or with API calls were shown by it if so occurs.
Working
Run an application.
Give city name and this application receives the current condition for that input city.

**output**:![Image](https://github.com/user-attachments/assets/94c5a33b-9fb4-4982-b32d-c5c96d28b0e3)

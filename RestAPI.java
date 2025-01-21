/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restapi;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Scanner;

public class RestAPI {
    public static void main(String[] args) {
        String apiKey = "8671e27df22e659c257dd16574216c22"; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the city name:");
        String city = scanner.nextLine();

        String apiUrl = String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric", city, apiKey);

        try {
            
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            
            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readTree(response.body());

            
            if (jsonNode.has("cod") && jsonNode.get("cod").asInt() != 200) {
                String message = jsonNode.has("message") ? jsonNode.get("message").asText() : "Unknown error";
                System.out.println("Error: " + message);
            } else {
                
                String cityName = jsonNode.has("name") ? jsonNode.get("name").asText() : "N/A";
                double temperature = jsonNode.has("main") && jsonNode.get("main").has("temp")
                        ? jsonNode.get("main").get("temp").asDouble()
                        : Double.NaN;
                String weatherDescription = jsonNode.has("weather") && jsonNode.get("weather").isArray()
                        ? jsonNode.get("weather").get(0).get("description").asText()
                        : "N/A";

                
                System.out.println("Weather Information:");
                System.out.println("---------------------");
                System.out.println("City: " + cityName);
                System.out.println("Temperature: " + (Double.isNaN(temperature) ? "N/A" : temperature + "°C"));
                System.out.println("Description: " + weatherDescription);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

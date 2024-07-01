package finalexam.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class CommunicationManager {

    private String endpoint;

    // TODO finish it
    public CommunicationManager(String endpoint) {
        this.endpoint = endpoint;
    }

    // Method to send user message via POST request
    public String sendUserMessage(String message) {
        try {
            // Create URL object
            URL url = new URL(endpoint);

            // Open connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Set request method to POST
            conn.setRequestMethod("POST");

            // Set content type
            conn.setRequestProperty("Content-Type", "application/json");

            // Enable output
            conn.setDoOutput(true);

            // Create JSON message body
            String jsonInputString = "{\"message\": \"" + message + "\"}";

            // Write message body
            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Handle response
            StringBuilder response = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
            }

            // Close connection
            conn.disconnect();

            return response.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

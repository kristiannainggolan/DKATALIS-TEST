package com.example.task2;

import static com.example.task2.compare.CompareAPI.readJsonFromUrl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task2Application {

	public static void main(String[] args) {
		SpringApplication.run(Task2Application.class, args);
                
                JSONObject json = null;
            try {
                json = readJsonFromUrl("https://reqres.in/api/users/2");
            } catch (IOException ex) {
                Logger.getLogger(Task2Application.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(Task2Application.class.getName()).log(Level.SEVERE, null, ex);
            }
    System.out.println(json.toString());
                
                System.out.println("berjalan");
	}

}

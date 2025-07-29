package com.example.binh123.App;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(
		scanBasePackages = {
				"com.example.binh123.App",
				"com.example.binh123.RestAPI",
				"com.example.binh123.Service"
		}
)
public class Binh123Application {

	public static void main(String[] args) {
		SpringApplication.run(Binh123Application.class, args);
	}

}

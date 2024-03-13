package com.example.beans.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeansDemoApplication {

	public static void main(String[] args) {
		// Run the Spring Boot application and get the application context
		ConfigurableApplicationContext context = SpringApplication.run(BeansDemoApplication.class, args);

		// Get the ColorPrinterImpl bean from the Spring context
		ColorPrinterImpl colorPrinter = context.getBean(ColorPrinterImpl.class);

		// Call the print() method
		System.out.println(colorPrinter.print());

		// Close the Spring context when the application is done
		context.close();
	}
}

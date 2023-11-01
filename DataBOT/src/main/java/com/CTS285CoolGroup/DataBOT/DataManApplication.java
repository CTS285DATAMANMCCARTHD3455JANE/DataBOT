package com.CTS285CoolGroup.DataBOT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class DataManApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataManApplication.class, args);
	}
	@RestController
	public class HelloController{
		@GetMapping("/")
		public String index()
		{
			return "Dataman coming soon!";
		}
	}
}

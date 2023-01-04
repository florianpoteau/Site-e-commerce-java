package Fil_Rouge;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.SpringApplication;


@EnableAutoConfiguration
@ComponentScan ({"Fil_Rouge","DAO_Stock"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class Main {

	public static void main (String[] args) {
		
		
	
		SpringApplication.run(Main.class, args);
		
	}
}
		
		
	
	



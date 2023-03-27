package springboot.demo.myApp.restApiSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value= "classpath:restApiSecurity.properties")
@SpringBootApplication(scanBasePackages = {"springboot.demo.myApp.restApiSecurity"})
public class RestApiSecurityDemoApp {

	public static void main(String[] args) {
		SpringApplication.run(RestApiSecurityDemoApp.class, args);
	}

}

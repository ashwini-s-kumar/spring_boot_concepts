package springboot.demo.myApp.iOCandDependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"springboot.demo.componentScanning",
		"springboot.demo.myApp.iOCandDependencyInjection"})
public class MyAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyAppApplication.class, args);
		System.out.println("Started MyAppApplication");
	}

}

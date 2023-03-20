package springboot.demo.IOCandDependencyInjection.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"springboot.demo.IOCandDependencyInjection.myApp",
				"springboot.demo.IOCandDependencyInjection.componentScanning"
		}
)
public class MyAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyAppApplication.class, args);
		System.out.println("Hello World !!!");
	}

}

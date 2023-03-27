package springboot.demo.myApp.restCrudAPIs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import springboot.demo.myApp.dataAccessWithHibernateJPA.dao.StudentDAO;
import springboot.demo.myApp.dataAccessWithHibernateJPA.entity.Student;

import java.util.List;

@PropertySource(value= "classpath:default.properties")
@SpringBootApplication(scanBasePackages = {"springboot.demo.myApp.restCrudAPIs"})
public class RestCrudApplicationDemo {

    public static void main(String[] args) {

        SpringApplication.run(RestCrudApplicationDemo.class, args);
        System.out.println("started the RestCrudApplicationDemo");
    }
}

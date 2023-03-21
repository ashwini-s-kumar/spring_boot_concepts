package springboot.demo.myApp.dataAccessWithHibernateJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springboot.demo.myApp.iOCandDependencyInjection.MyAppApplication;

@SpringBootApplication(scanBasePackages = {"springboot.demo.myApp.dataAccessWithHibernateJPA"})
public class CrudApplicationDemo {

    public static void main(String[] args) {

        SpringApplication.run(CrudApplicationDemo.class, args);
        System.out.println("started the CrudApplicationDemo");
    }

}

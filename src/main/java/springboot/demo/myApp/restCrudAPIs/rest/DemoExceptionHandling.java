package springboot.demo.myApp.restCrudAPIs.rest;

import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.demo.myApp.restCrudAPIs.customException.StudentNotFoundException;
import springboot.demo.myApp.restCrudAPIs.entity.Student;
import springboot.demo.myApp.restCrudAPIs.errorResponse.StudentErrorResponse;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoExceptionHandling {
    private List<Student> students;

    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();
        students.add(new Student("John","Bell"));
        students.add(new Student("MS","Dhoni"));
        students.add(new Student("Mary","smith"));
        students.add(new Student("Poornima","Patel"));
    }

    @GetMapping("/studentByID/{studentID}")
    public Student getStudent(@PathVariable int studentID){
        if(studentID >= students.size() || studentID < 0 ){
            throw new StudentNotFoundException("Student id not found - " + studentID);
        }
        return students.get(studentID);
    }

}

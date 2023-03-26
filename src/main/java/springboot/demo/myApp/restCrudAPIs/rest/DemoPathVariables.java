package springboot.demo.myApp.restCrudAPIs.rest;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.demo.myApp.restCrudAPIs.entity.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoPathVariables {

    private List<Student> students;

    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();
        students.add(new Student("John","Bell"));
        students.add(new Student("MS","Dhoni"));
        students.add(new Student("Mary","smith"));
        students.add(new Student("Poornima","Patel"));
    }
    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/studentByFirstName/{studentFirstName}")
    public Student getStudentByFirstName(@PathVariable String studentFirstName){
        Student student = null;
        for(Student s : students){
            if(s.getFirstName().equalsIgnoreCase(studentFirstName)){
                student = s;
                break;
            }
        }
        return student;
    }
}

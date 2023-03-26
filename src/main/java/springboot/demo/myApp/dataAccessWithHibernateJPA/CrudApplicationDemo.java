package springboot.demo.myApp.dataAccessWithHibernateJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springboot.demo.myApp.dataAccessWithHibernateJPA.dao.StudentDAO;
import springboot.demo.myApp.dataAccessWithHibernateJPA.entity.Student;

import java.util.List;

@SpringBootApplication(scanBasePackages = {"springboot.demo.myApp.dataAccessWithHibernateJPA"})
public class CrudApplicationDemo {

    public static void main(String[] args) {

        SpringApplication.run(CrudApplicationDemo.class, args);
        System.out.println("started the CrudApplicationDemo");
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
        return runner -> {
            createStudent(studentDAO);
            System.out.println("======================================================");
            createMultipleStudents(studentDAO);
            System.out.println("======================================================");
            findStudentByID(studentDAO);
            System.out.println("======================================================");
            findAllStudents(studentDAO);
            System.out.println("======================================================");
            findStudentsByLastNAme(studentDAO,"Kumar");
            System.out.println("======================================================");
            updateStudent(studentDAO);
            System.out.println("======================================================");
            updateStudentEmailByLastName(studentDAO, "admin@gmail.com","Kumar");
            System.out.println("======================================================");
            deleteStudentById(studentDAO);
            System.out.println("======================================================");
            deleteAllStudent(studentDAO);
        };
    }

    private void deleteAllStudent(StudentDAO studentDAO) {
        System.out.println("Trying to delete all students ...");
        int rows = studentDAO.deleteAll();
        System.out.println("Deleted rows : "+ rows);

    }


    private void deleteStudentById(StudentDAO studentDAO) {
        Student student = new Student("Dummy", "Dummy","dummy@gmail.com");
        studentDAO.save(student);
        System.out.println("Created student with id : "+ student.getId());
        System.out.println("trying to deleting the student with id "+ student.getId());
        studentDAO.deleteById(student.getId());
        System.out.println("Successfully deleted student with id : "+ student.getId());
    }

    private void updateStudentEmailByLastName(StudentDAO studentDAO, String email, String lastName) {
        System.out.println("Trying to update the email with lastName :"+ lastName);
        int affectedRows = studentDAO.updateEmailBylastName(email, lastName);
        System.out.println("affected rows : " + affectedRows);
    }

    private void updateStudent(StudentDAO studentDAO) {
        Student student = new Student("Dummy", "Dummy","dummy@gmail.com");
        studentDAO.save(student);

        System.out.println("Created student with id : "+ student.getId());
        student = studentDAO.findById(student.getId());
        System.out.println("Student :"+ student.toString());

        System.out.println("Updating the student email ...");
        student.setEmail("admin@gmail.com");

        studentDAO.updateStudent(student);
        System.out.println("Updated Student :" + student.toString());
    }

    private void findStudentsByLastNAme(StudentDAO studentDAO, String lastname) {
        System.out.println("Trying to find students with lastName :"+lastname);
        List<Student> students = studentDAO.findByLastName(lastname);
        System.out.println("Student found : ");
        for(Student student : students){
            System.out.println(student.toString());
        }
    }

    private void findAllStudents(StudentDAO studentDAO) {
        System.out.println("Trying to get all students ...");
        List<Student> studentList = studentDAO.findAll();
        System.out.println("Total Students present :" );
        for(Student student : studentList){
            System.out.println(student.toString());
        }
    }

    private void findStudentByID(StudentDAO studentDAO) {
        Student student = new Student("Dummy", "Dummy","dummy@gmail.com");
        studentDAO.save(student);
        System.out.println("Trying find the student with id :"+ student.getId());
        student = studentDAO.findById(student.getId());
        System.out.println("Student found :"+ student.toString());

    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        System.out.println("Creating 3 new Student object ...");
        Student student1 = new Student("Yeshwanth S", "Kumar","yesh@gmail.com");
        Student student2 = new Student("Mary", "Public","navya@gmail.com");
        Student student3 = new Student("John", "Doe","john@gmail.com");

        System.out.println("Saving the students ..");
        studentDAO.save(student1);
        studentDAO.save(student2);
        studentDAO.save(student3);

        System.out.println("Saved students . Generated Ids : "+student1.getId()+","+ student2.getId()+","+ student3.getId());

    }

    private void createStudent(StudentDAO studentDAO){
        System.out.println("Creating new Student object ...");
        Student student = new Student("Ashwini S", "Kumar","ashwini@gmail.com");

        System.out.println("Saving the student ..");
        studentDAO.save(student);

        System.out.println("Saved student . Generated Id : "+student.getId());
    }
}

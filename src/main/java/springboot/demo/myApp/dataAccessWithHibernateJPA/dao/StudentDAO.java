package springboot.demo.myApp.dataAccessWithHibernateJPA.dao;

import springboot.demo.myApp.dataAccessWithHibernateJPA.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(int id);
    List<Student> findAll();
    List<Student> findByLastName(String lastName);
    void updateStudent(Student student);
    int updateEmailBylastName(String email, String lastName);
    void deleteById(int id);
    int deleteAll();
}
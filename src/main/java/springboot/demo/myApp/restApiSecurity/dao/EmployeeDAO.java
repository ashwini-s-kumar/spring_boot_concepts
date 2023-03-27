package springboot.demo.myApp.restApiSecurity.dao;


import springboot.demo.myApp.restApiSecurity.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}

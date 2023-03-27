package springboot.demo.myApp.restApiSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.demo.myApp.restApiSecurity.dao.EmployeeDAO;
import springboot.demo.myApp.restApiSecurity.dao.EmployeeRepository;
import springboot.demo.myApp.restApiSecurity.entity.Employee;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    // efficient - supports all the entities with less code
    EmployeeRepository employeeRepository;

    // not efficient - need DAO code implementation for each entity
    // So, switched from EmployeeDao to EmployeeService
    EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeDAO employeeDAO){
        this.employeeRepository = employeeRepository;
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result =  employeeRepository.findById(id);
        Employee employee = null;
        if(result.isPresent()){
            employee = result.get();
        }
        return employee;
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}

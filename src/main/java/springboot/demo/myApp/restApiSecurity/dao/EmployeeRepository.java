package springboot.demo.myApp.restApiSecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import springboot.demo.myApp.restApiSecurity.entity.Employee;

//use JpaRepository - instead of creating the DAOs for each entity
@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //no need to write any code
}

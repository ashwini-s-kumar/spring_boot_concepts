package springboot.demo.myApp.dataAccessWithHibernateJPA.daoImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springboot.demo.myApp.dataAccessWithHibernateJPA.dao.StudentDAO;
import springboot.demo.myApp.dataAccessWithHibernateJPA.entity.Student;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    //no need of @Transactional . since we are doing a query
    public Student findById(int id) {
        //If not found , it returns null
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("from Student", Student.class);
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query = entityManager.createQuery("from Student where lastName=:last_name", Student.class);
        query.setParameter("last_name",lastName);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void updateStudent(Student student){
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public int updateEmailBylastName(String email, String lastName) {
        Query query = entityManager.createQuery("UPDATE Student SET email=:stu_email where lastName=:last_name");
        query.setParameter("stu_email", email);
        query.setParameter("last_name", lastName);
        return query.executeUpdate();
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Query query = entityManager.createQuery("DELETE from Student Where id=:stu_id");
        query.setParameter("stu_id", id);
        query.executeUpdate();
    }

    @Override
    @Transactional
    public int deleteAll() {
        Query query = entityManager.createQuery("DELETE from Student");
        return query.executeUpdate();
    }
}

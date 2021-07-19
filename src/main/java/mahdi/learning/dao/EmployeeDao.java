package mahdi.learning.dao;


import mahdi.learning.model.Employee;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
@Transactional
@Service
public class EmployeeDao {

    @PersistenceContext
    EntityManager entityManager;

    static final Logger log = Logger.getLogger(EmployeeDao.class);


    public void persist( Employee employee ) {
        entityManager.persist(employee);
    }

}

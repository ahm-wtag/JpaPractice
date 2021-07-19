package mahdi.learning.dao;


import mahdi.learning.model.Employee;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
@Service
public class EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;

    static final Logger log = Logger.getLogger(EmployeeDao.class);


    public void persist( Employee employee ) {
        session = sessionFactory.openSession();
        session.persist(employee);
    }




}

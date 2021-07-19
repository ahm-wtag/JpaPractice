package mahdi.learning.dao;

import mahdi.learning.model.Customer;


import org.apache.log4j.Logger;


import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


@Repository
public class CustomerDao {

    static final Logger log = Logger.getLogger(CustomerDao.class);


    @PersistenceContext
    EntityManager entityManager;


    public void persist(Customer customer) {
        entityManager.persist(customer);
    }

   public Collection<Customer> viewCustomers() {

        Query query = entityManager.createQuery("from Customer");
        return (Collection<Customer>) query.getResultList();
   }

//    public void updateCustomer() {
//        session =  sessionFactory.openSession();
//         session.find()
//
//    }




}

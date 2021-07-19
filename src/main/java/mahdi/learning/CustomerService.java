package mahdi.learning;

import mahdi.learning.dao.CustomerDao;
import mahdi.learning.dao.PostDao;
import mahdi.learning.model.Customer;
import mahdi.learning.model.Post;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.Query;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class CustomerService {
    @Autowired
    CustomerDao customerDao;
    @Autowired
    PostDao postDao;

    public void addCustomer() {

        Customer customer1 = new Customer("sarah");
        Post post1 = new Post();
        post1.setTitle("this is the second post!");
        Post post2 = new Post("this is my second postasdasdasdasdad");
        Set<Post> posts =  new HashSet<Post>();
        posts.add(post1);
        posts.add(post2);
        customer1.setPosts(posts);

        postDao.persist(post1);
        postDao.persist(post2);
        customerDao.persist(customer1);
    }


    public void viewCustomer() {
        Collection<Customer> customers = customerDao.viewCustomers();
        for ( Customer customer : customers ) {
            System.out.println(customer);
        }
    }

//    public void updateCustomer() {
//        customerDao.updateCustomer();
//    }






}

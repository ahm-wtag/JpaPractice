package mahdi.learning.dao;


import mahdi.learning.model.Post;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PostDao {

    @PersistenceContext
    EntityManager entityManager;

    static Logger log = Logger.getLogger(PostDao.class);

    public void persist( Post post ) {
        log.warn(post.toString());
        entityManager.persist(post);
    }



}

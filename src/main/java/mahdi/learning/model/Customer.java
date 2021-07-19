package mahdi.learning.model;





import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;
    private String name;

    @JoinTable( name = "customer_post",
            joinColumns = {@JoinColumn(name="customer_id")},
            inverseJoinColumns = {@JoinColumn(name = "post_id")}  )
    @ManyToMany(targetEntity = Post.class, cascade = CascadeType.ALL )
    private Set<Post> posts = new HashSet<Post>();



    public Customer() {}

    public Customer(String name ) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", posts=" + posts +
                '}';
    }
}

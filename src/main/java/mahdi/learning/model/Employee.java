package mahdi.learning.model;

import javax.persistence.*;

//@Entity
//@Table(name = "employee")
//@DiscriminatorValue("employee")
//@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

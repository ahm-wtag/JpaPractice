package mahdi.learning.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("part-time")
public class PartTimeEmployee extends Employee{


    private int pph;

    public int getPph() {
        return pph;
    }

    public void setPph(int pph) {
        this.pph = pph;
    }

}

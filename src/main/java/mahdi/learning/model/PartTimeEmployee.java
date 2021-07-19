package mahdi.learning.model;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

//@Entity
//@DiscriminatorValue("part-time")
public class PartTimeEmployee extends Employee{


    public int getPph() {
        return pph;
    }

    public void setPph(int pph) {
        this.pph = pph;
    }

    private int pph;



}

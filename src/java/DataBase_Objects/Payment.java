package DataBase_Objects;
// Generated 22 mars 2017 17:41:26 by Hibernate Tools 4.3.1



/**
 * Payment generated by hbm2java
 */
public class Payment  implements java.io.Serializable {


     private int idPayment;
     private String description;

    public Payment() {
    }

	
    public Payment(int idPayment) {
        this.idPayment = idPayment;
    }
    public Payment(int idPayment, String description) {
       this.idPayment = idPayment;
       this.description = description;
    }
   
    public int getIdPayment() {
        return this.idPayment;
    }
    
    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


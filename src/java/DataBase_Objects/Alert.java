package DataBase_Objects;
// Generated 22 mars 2017 17:41:26 by Hibernate Tools 4.3.1



/**
 * Alert generated by hbm2java
 */
public class Alert  implements java.io.Serializable {


     private Integer idAlert;
     private int idC;
     private String idS;
     private String descriptionAlert;

    public Alert() {
    }

	
    public Alert(int idC, String idS) {
        this.idC = idC;
        this.idS = idS;
    }
    public Alert(int idC, String idS, String descriptionAlert) {
       this.idC = idC;
       this.idS = idS;
       this.descriptionAlert = descriptionAlert;
    }
   
    public Integer getIdAlert() {
        return this.idAlert;
    }
    
    public void setIdAlert(Integer idAlert) {
        this.idAlert = idAlert;
    }
    public int getIdC() {
        return this.idC;
    }
    
    public void setIdC(int idC) {
        this.idC = idC;
    }
    public String getIdS() {
        return this.idS;
    }
    
    public void setIdS(String idS) {
        this.idS = idS;
    }
    public String getDescriptionAlert() {
        return this.descriptionAlert;
    }
    
    public void setDescriptionAlert(String descriptionAlert) {
        this.descriptionAlert = descriptionAlert;
    }




}


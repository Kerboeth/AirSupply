package DataBase_Objects;
// Generated 22 mars 2017 17:41:26 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * CalendarAlert generated by hbm2java
 */
public class CalendarAlert  implements java.io.Serializable {


     private Date dateAlert;

    public CalendarAlert() {
    }

    public CalendarAlert(Date dateAlert) {
       this.dateAlert = dateAlert;
    }
   
    public Date getDateAlert() {
        return this.dateAlert;
    }
    
    public void setDateAlert(Date dateAlert) {
        this.dateAlert = dateAlert;
    }




}



package DataBase_Objects;
// Generated 22 mars 2017 17:41:26 by Hibernate Tools 4.3.1



/**
 * AirsupplyUser generated by hbm2java
 */
public class AirsupplyUser  implements java.io.Serializable {


     private Integer idUser;
     private Integer idC;
     private int idTy;
     private String idS;
     private String name;
     private String surname;
     private String email;
     private String password;

    public AirsupplyUser() {
    }

	
    public AirsupplyUser(int idTy, String email) {
        this.idTy = idTy;
        this.email = email;
    }
    public AirsupplyUser(Integer idC, int idTy, String idS, String name, String surname, String email, String password) {
       this.idC = idC;
       this.idTy = idTy;
       this.idS = idS;
       this.name = name;
       this.surname = surname;
       this.email = email;
       this.password = password;
    }
   
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public Integer getIdC() {
        return this.idC;
    }
    
    public void setIdC(Integer idC) {
        this.idC = idC;
    }
    public int getIdTy() {
        return this.idTy;
    }
    
    public void setIdTy(int idTy) {
        this.idTy = idTy;
    }
    public String getIdS() {
        return this.idS;
    }
    
    public void setIdS(String idS) {
        this.idS = idS;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}



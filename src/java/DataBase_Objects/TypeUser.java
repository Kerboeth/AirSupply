package DataBase_Objects;
// Generated 22 mars 2017 17:41:26 by Hibernate Tools 4.3.1



/**
 * TypeUser generated by hbm2java
 */
public class TypeUser  implements java.io.Serializable {


     private Integer idTy;
     private String roleTy;

    public TypeUser() {
    }

    public TypeUser(String roleTy) {
       this.roleTy = roleTy;
    }
   
    public Integer getIdTy() {
        return this.idTy;
    }
    
    public void setIdTy(Integer idTy) {
        this.idTy = idTy;
    }
    public String getRoleTy() {
        return this.roleTy;
    }
    
    public void setRoleTy(String roleTy) {
        this.roleTy = roleTy;
    }




}



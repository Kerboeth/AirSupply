package DataBase_Objects;
// Generated 23 mars 2017 11:13:20 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TypeUser generated by hbm2java
 */
public class TypeUser  implements java.io.Serializable {


     private Integer idTy;
     private String roleTy;
     private Set<AirsupplyUser> airsupplyUsers = new HashSet<AirsupplyUser>(0);

    public TypeUser() {
    }

    public TypeUser(String roleTy, Set<AirsupplyUser> airsupplyUsers) {
       this.roleTy = roleTy;
       this.airsupplyUsers = airsupplyUsers;
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
    public Set<AirsupplyUser> getAirsupplyUsers() {
        return this.airsupplyUsers;
    }
    
    public void setAirsupplyUsers(Set<AirsupplyUser> airsupplyUsers) {
        this.airsupplyUsers = airsupplyUsers;
    }




}



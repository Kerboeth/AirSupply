package DataBase_Objects;
// Generated 22 mars 2017 17:41:26 by Hibernate Tools 4.3.1



/**
 * SupplySite generated by hbm2java
 */
public class SupplySite  implements java.io.Serializable {


     private Integer idSypplySite;
     private String idS;
     private String supplierSiteCity;

    public SupplySite() {
    }

	
    public SupplySite(String idS) {
        this.idS = idS;
    }
    public SupplySite(String idS, String supplierSiteCity) {
       this.idS = idS;
       this.supplierSiteCity = supplierSiteCity;
    }
   
    public Integer getIdSypplySite() {
        return this.idSypplySite;
    }
    
    public void setIdSypplySite(Integer idSypplySite) {
        this.idSypplySite = idSypplySite;
    }
    public String getIdS() {
        return this.idS;
    }
    
    public void setIdS(String idS) {
        this.idS = idS;
    }
    public String getSupplierSiteCity() {
        return this.supplierSiteCity;
    }
    
    public void setSupplierSiteCity(String supplierSiteCity) {
        this.supplierSiteCity = supplierSiteCity;
    }




}



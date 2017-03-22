package DataBase_Objects;
// Generated 22 mars 2017 17:41:26 by Hibernate Tools 4.3.1



/**
 * MaterialVmi2 generated by hbm2java
 */
public class MaterialVmi2  implements java.io.Serializable {


     private MaterialVmi2Id id;
     private String unitOfMeasure;
     private Integer minStock;
     private Integer maxStock;
     private String quantity;

    public MaterialVmi2() {
    }

	
    public MaterialVmi2(MaterialVmi2Id id) {
        this.id = id;
    }
    public MaterialVmi2(MaterialVmi2Id id, String unitOfMeasure, Integer minStock, Integer maxStock, String quantity) {
       this.id = id;
       this.unitOfMeasure = unitOfMeasure;
       this.minStock = minStock;
       this.maxStock = maxStock;
       this.quantity = quantity;
    }
   
    public MaterialVmi2Id getId() {
        return this.id;
    }
    
    public void setId(MaterialVmi2Id id) {
        this.id = id;
    }
    public String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }
    
    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
    public Integer getMinStock() {
        return this.minStock;
    }
    
    public void setMinStock(Integer minStock) {
        this.minStock = minStock;
    }
    public Integer getMaxStock() {
        return this.maxStock;
    }
    
    public void setMaxStock(Integer maxStock) {
        this.maxStock = maxStock;
    }
    public String getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }




}



package DataBase_Objects;
// Generated 22 mars 2017 17:41:26 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * PriceId generated by hbm2java
 */
public class PriceId  implements java.io.Serializable {


     private Date priceDate;
     private String poLineId;
     private String idS;

    public PriceId() {
    }

    public PriceId(Date priceDate, String poLineId, String idS) {
       this.priceDate = priceDate;
       this.poLineId = poLineId;
       this.idS = idS;
    }
   
    public Date getPriceDate() {
        return this.priceDate;
    }
    
    public void setPriceDate(Date priceDate) {
        this.priceDate = priceDate;
    }
    public String getPoLineId() {
        return this.poLineId;
    }
    
    public void setPoLineId(String poLineId) {
        this.poLineId = poLineId;
    }
    public String getIdS() {
        return this.idS;
    }
    
    public void setIdS(String idS) {
        this.idS = idS;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PriceId) ) return false;
		 PriceId castOther = ( PriceId ) other; 
         
		 return ( (this.getPriceDate()==castOther.getPriceDate()) || ( this.getPriceDate()!=null && castOther.getPriceDate()!=null && this.getPriceDate().equals(castOther.getPriceDate()) ) )
 && ( (this.getPoLineId()==castOther.getPoLineId()) || ( this.getPoLineId()!=null && castOther.getPoLineId()!=null && this.getPoLineId().equals(castOther.getPoLineId()) ) )
 && ( (this.getIdS()==castOther.getIdS()) || ( this.getIdS()!=null && castOther.getIdS()!=null && this.getIdS().equals(castOther.getIdS()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getPriceDate() == null ? 0 : this.getPriceDate().hashCode() );
         result = 37 * result + ( getPoLineId() == null ? 0 : this.getPoLineId().hashCode() );
         result = 37 * result + ( getIdS() == null ? 0 : this.getIdS().hashCode() );
         return result;
   }   


}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project5376;

import java.sql.Date;
import javax.ejb.CreateException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;

/**
 *
 * @author tcook
 */
public abstract class PaymentBean implements EntityBean {

    private EntityContext context;
    
    // <editor-fold defaultstate="collapsed" desc="EJB infrastructure methods. Click on the + sign on the left to edit the code.">

    // TODO Consider creating Transfer Object to encapsulate data
    // TODO Review finder methods

    /**
     * @see javax.ejb.EntityBean#setEntityContext(javax.ejb.EntityContext)
     */
    public void setEntityContext(EntityContext aContext) {
        context = aContext;
    }
    
    /**
     * @see javax.ejb.EntityBean#ejbActivate()
     */
    public void ejbActivate() {
        
    }
    
    /**
     * @see javax.ejb.EntityBean#ejbPassivate()
     */
    public void ejbPassivate() {
        
    }
    
    /**
     * @see javax.ejb.EntityBean#ejbRemove()
     */
    public void ejbRemove() {
        
    }
    
    /**
     * @see javax.ejb.EntityBean#unsetEntityContext()
     */
    public void unsetEntityContext() {
        context = null;
    }
    
    /**
     * @see javax.ejb.EntityBean#ejbLoad()
     */
    public void ejbLoad() {
        
    }
    
    /**
     * @see javax.ejb.EntityBean#ejbStore()
     */
    public void ejbStore() {
        
    }

    // </editor-fold>
    
    
    public java.lang.Integer ejbCreate(java.lang.Integer key)  throws CreateException {
        if (key == null) {
            throw new CreateException("The field \"key\" must not be null");
        }
        
        // TODO add additional validation code, throw CreateException if data is not valid

        return null;
    }

    public void ejbPostCreate(java.lang.Integer key) {
        // TODO populate relationships here if appropriate
    }

    public abstract Integer getPaymentNo();

    public abstract void setPaymentNo(Integer paymentNo);

    public abstract Double getAmount();

    public abstract void setAmount(Double amount);

    public abstract String getType();

    public abstract void setType(String type);

    public abstract String getCardNo();

    public abstract void setCardNo(String cardNo);

    public abstract Date getExpDate();

    public abstract void setExpDate(Date expDate);

    public abstract Integer getSecurityCode();

    public abstract void setSecurityCode(Integer securityCode);
// tcc
    public abstract UserLocal getBuyerNo();
    public abstract void setBuyerNo(UserLocal buyerNo);
//    public abstract Integer getBuyerNo();
//    public abstract void setBuyerNo(Integer buyerNo);

    public abstract AuctionLocal getAuction();
    public abstract void setAuction(AuctionLocal auction);
//    public abstract Integer getAuction();
//    public abstract void setAuction(Integer auction);

}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project5376;

import javax.ejb.CreateException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;

/**
 *
 * @author tcook
 */
public abstract class BidBean implements EntityBean {

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
    
   public Integer ejbCreate(Integer key, Integer bidAmt,UserLocal bidderId,AuctionLocal auctionNo)  throws CreateException
    {
       setBidNo(key);
       setBidAmt(bidAmt);
     //todo   setBidderId(bidderId);
     //  setAuctionNo(auctionNo);
       return null;
    }
    
/*
 The error was: AuctionBean: setSellerId: Abstract getXXX and setXXX methods for container managed fields may not be overloaded. 
 AuctionBean: setItemNo: Abstract getXXX and setXXX methods for container managed fields may not be overloaded. BidBean: setAuctionNo:
 Abstract getXXX and setXXX methods for container managed fields may not be overloaded. BidBean: setBidderId: Abstract 
 getXXX and setXXX methods for container managed fields may not be overloaded. . at weblogic.ejb20.ejbc.EJBCompiler.doCompile
 (EJBCompiler.java:255) at 
 *
 public java.lang.Integer ejbCreate(java.lang.Integer key)  throws CreateException {
        if (key == null) {
            throw new CreateException("The field \"key\" must not be null");
        }
        
        // TODO add additional validation code, throw CreateException if data is not valid

        return null;
    }
*/
    public void ejbPostCreate(Integer key, Integer bidAmt,UserLocal bidderId, AuctionLocal auctionNo)
    {
        setAuctionNo(auctionNo);
        setBidderId(bidderId);
    }
/*    public void ejbPostCreate(java.lang.Integer key) {
        // TODO populate relationships here if appropriate
    }
*/
    public abstract Integer getBidNo();

    public abstract void setBidNo(Integer bidNo);

    public abstract Integer getBidAmt();

    public abstract void setBidAmt(Integer bidAmt);

    public abstract AuctionLocal getAuctionNo();

//    public abstract void setAuctionNo(Integer auctionNo);

//    public abstract Integer getAuctionNo();

    public abstract void setAuctionNo(AuctionLocal auctionNo);

 //   public abstract Integer getBidderId();

//    public abstract void setBidderId(Integer bidderId);
    
   public abstract UserLocal getBidderId();

    public abstract void setBidderId(UserLocal bidderId);

}

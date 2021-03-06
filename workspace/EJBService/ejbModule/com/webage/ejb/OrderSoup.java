package com.webage.ejb;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;

import com.webage.beans.Soup;
import com.webage.ejb.view.OrderSoupRemote;

/**
 * Session Bean implementation class OrderSoup
 */
@Stateless
@WebService
@Remote(OrderSoupRemote.class)
public class OrderSoup implements OrderSoupRemote {

    /**
     * Default constructor. 
     */
    public OrderSoup() {
        // TODO Auto-generated constructor stub
    }
    
    public String orderSoup(Soup soup) throws BadCustomerException {
    	if("Elaine".equalsIgnoreCase(soup.getCustomerName())) {
    		throw new BadCustomerException(soup);
    	}
    	
    	String message = soup.getSoupType() + " served to " + soup.getCustomerName();
    	
    	System.out.println("EJB said: " + message);
    	
    	return message;
    }

}

package com.bridgelabz.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author bridgelabz
 *
 */
public class Payment {
	 @Qualifier("OrderBean")
	  @Autowired
	    private Order order;
	     
	    @Override
	    public String toString(){
	        return "ordering "+this.order.getItem()+" | price: "+this.order.getPrice();
	    }
}

package com.bridgelabz.autowiringByType;

/**
 * @author bridgelabz
 *
 */
public class Paymentway {
	private Order order;

	public void setOrder(Order ord) {
		this.order = ord;
	}

	public Order getOrder() {
		return order;
	}

	@Override
	public String toString() {
		return "ordering " + this.order.getItem() + " | price: " + this.order.getPrice();
	}
}

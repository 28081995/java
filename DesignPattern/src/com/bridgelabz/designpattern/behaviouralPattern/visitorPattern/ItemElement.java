package com.bridgelabz.designpattern.behaviouralPattern.visitorPattern;
public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}

package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class CashCounter {
	int balance = 0;	
	MyQueue<Integer> people = new MyQueue<Integer>();
	
	public static void main(String[] args) {
		Utility u=new Utility();
		int choice = 0;	
		
		CashCounter counter = new CashCounter();
		
		do {
			System.out.println("1: Deposit");
			System.out.println("2: Withdraw");
			System.out.println("3: People ahead of you");
			System.out.println("4: Quit");
			System.out.print("Enter your choice: ");
			choice = u.inputInteger();
			counter.action(choice);
		}while(choice != 4);
		
		if(counter.balance == 0) {
			System.out.println("no balance");
		}
		else {
			System.out.println("balance is there");
		}
	}

	void action(int choice) {
		Utility u=new Utility();
		int money;
		switch(choice) {
		case 1:
			//enqueue people and money to balance
			System.out.print("Enter amount to deposit: ");
			money = u.inputInteger();
			people.enqueue(money);
			balance += money;
			System.out.println(balance);
			break;
		case 2:
			//enqueue people and remove money from balance
			System.out.print("Enter amount to withdraw: ");
			money = u.inputInteger() * -1;
			people.enqueue(money);
			balance += money;
			System.out.println(balance);
			break;
		case 3:
			//displays number of people ahead of you
			System.out.println("\n" + (people.size() - 1) + " people ahead of you\n");
			break;
		default:			
		}
	}
}
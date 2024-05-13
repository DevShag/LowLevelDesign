package vendingMachine.impl;

import java.util.List;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;
import vendingMachine.interfaceClasses.State;

public class SelectionState implements State {
	
	public SelectionState() {
		System.out.println("Currently Vending machine is in Selection State");
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		throw new Exception("you can not insert coin button in Selection State");
		
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		throw new Exception("you can not insert coin in Selection State");
		
	}

	@Override
	public void clickOnStartProductButton(VendingMachine machine) throws Exception {
		return;
		
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		//1. get item of this codeNumber
		Item item=machine.getInventory().getItem(codeNumber);
		
		//2. total amount paid by User
		int paidByUser=0;
		for (Coin coin : machine.getCoinList()) {
			paidByUser = paidByUser + coin.value;
		}
		
		//3. compare product price and amount paid by user
		if(paidByUser<item.getPrice()) {
			 System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
	         refundFullMoney(machine);
	         throw new Exception("insufficient amount");
		}
		else if(paidByUser >= item.getPrice()) {
			
			if(paidByUser > item.getPrice()) {
				getChange(paidByUser - item.getPrice());
			}
			machine.setVendingMachineState(new DispenseState(machine, codeNumber));
		}
		
		
	}

	@Override
	public int getChange(int returnChageMoney) throws Exception {
		System.out.println("Returned the change in the Coin Dispense Tray: "+ returnChageMoney);
		return returnChageMoney;
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		throw new Exception("product can not be dispensed Selection state");
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		System.out.println("Returned the full amount back in the Coin Dispense Tray");
		machine.setVendingMachineState(new IdleState(machine));
		return machine.getCoinList();
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		throw new Exception("Inventory can not be updated in Selection");
		
	}

}

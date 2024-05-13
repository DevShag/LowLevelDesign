package vendingMachine.impl;

import java.util.List;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;
import vendingMachine.interfaceClasses.State;

public class HasMoneyState implements State{

	public HasMoneyState() {
		System.out.println("Currently Vending machine is in HasMoneyState");
	}
	
	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		return;
		
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		System.out.println("Accepted the coin");
		machine.getCoinList().add(coin);
		
	}

	@Override
	public void clickOnStartProductButton(VendingMachine machine) throws Exception {
		machine.setVendingMachineState(new SelectionState());
		
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		throw new Exception("you need to click on start product selection button first");
		
	}

	@Override
	public int getChange(int returnChageMoney) throws Exception {
		throw new Exception("you can not get change in has money state");
		
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		throw new Exception("product can not be dispensed in has money state");
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		System.out.println("Returned the full amount back");
		machine.setVendingMachineState(new IdleState());
		return machine.getCoinList();
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		throw new Exception("you can not update inventory in has money state");
		
	}

}

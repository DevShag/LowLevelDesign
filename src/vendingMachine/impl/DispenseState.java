package vendingMachine.impl;

import java.util.List;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;
import vendingMachine.interfaceClasses.State;

public class DispenseState implements State{

	public DispenseState(VendingMachine machine, int codeNumber) throws Exception {
		System.out.println("Currently Vending machine is in DispenseState");
		dispenseProduct(machine, codeNumber);
	}
	
	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		throw new Exception("insert coin button can not be clicked on Dispense state");
		
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		throw new Exception("coin can not be inserted in Dispense state");
		
	}

	@Override
	public void clickOnStartProductButton(VendingMachine machine) throws Exception {
		throw new Exception("product selection can not be clicked in Dispense state");
		
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		throw new Exception("product can not be chossen in Dispense state");
		
	}

	@Override
	public int getChange(int returnChageMoney) throws Exception {
		throw new Exception("change can not returned in Dispense state");
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		System.out.println("Product has been dispensed");
		Item item=machine.getInventory().getItem(codeNumber);
		machine.getInventory().updateSoldOutItem(codeNumber);
		machine.setVendingMachineState(new IdleState());
		return item;
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		throw new Exception("refund can not be happend in Dispense state");
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		throw new Exception("inventory can not be updated in Dispense state");
		
	}

}

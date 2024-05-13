package vendingMachine.impl;

import java.util.ArrayList;
import java.util.List;

import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;
import vendingMachine.interfaceClasses.State;

public class IdleState implements State{
	
	

	public IdleState() {
		super();
		System.out.println("Currently Vending machine is in Idle State");
	}
	
	public IdleState(VendingMachine machine) {
		System.out.println("Currently Vending machine is in Idle State");;
		machine.setCoinList(new ArrayList<>());
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		machine.setCoinList(new ArrayList<>());
	}

	@Override
	public void insertCoin(VendingMachine machine,  Coin coin) throws Exception {
		throw new Exception("You can not insert coin in idle state");
		
	}

	@Override
	public void clickOnStartProductButton(VendingMachine machine) throws Exception {
		throw new Exception("first you need to click on insert coin button");
		
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		throw new Exception("you can not choose product in idle state");
		
	}

	@Override
	public int getChange(int returnChageMoney) throws Exception {
		throw new Exception("you can not get change in idle state");
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		throw new Exception("product can not be dispense in idle state");
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		throw new Exception("you can not get refund in idle state");
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}

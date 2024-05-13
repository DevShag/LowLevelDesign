package vendingMachine;

import java.util.Iterator;

public class Inventory {
	
	ItemShelf[] invetrory=null;
	
	public Inventory(int itemCount) {
		invetrory=new ItemShelf[itemCount];
		initialEmptyInventory();
	}

	public ItemShelf[] getInvetrory() {
		return invetrory;
	}

	public void setInvetrory(ItemShelf[] invetrory) {
		this.invetrory = invetrory;
	}
	
	public void initialEmptyInventory() {
		int startCode=101;
		for (int i = 0; i < invetrory.length; i++) {
			ItemShelf space=new ItemShelf();
			space.setCode(startCode);
			space.setSoldOut(true);
			invetrory[i]=space;
			startCode++;
		}
	}
	
	public void addItem(Item item, int CodeNumber) throws Exception {
		
		for (ItemShelf itemShelf : invetrory) {
			if(itemShelf.code==CodeNumber) {
				if(itemShelf.isSoldOut()) {
					itemShelf.item=item;
					itemShelf.setSoldOut(false);
				}
				else {
					throw new Exception("alreay item is present you can not add item here");
				}
			}
		}
	}
	
	public Item getItem(int codeNumber) throws Exception{
		for (ItemShelf itemShelf : invetrory) {
			if(itemShelf.code==codeNumber) {
				if(itemShelf.isSoldOut()) {
					throw new Exception("item sold out");
				}
				else {
					return itemShelf.item;
				}
			}
		}
		throw new Exception("Invalid Code");
	}
	
	public void updateSoldOutItem(int codeNumber) {
		for (ItemShelf itemShelf : invetrory) {
			if(itemShelf.code==codeNumber) {
				itemShelf.setSoldOut(true);
			}
		}
	}
	
}

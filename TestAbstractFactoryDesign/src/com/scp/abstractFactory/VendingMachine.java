package com.scp.abstractFactory;

abstract public class VendingMachine {
	String item;
	int quantity;
	long price;
	public VendingMachine(String item, int quantity, long price) {
		super();
		this.item = item;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "VendingMachine " + (item != null ? "item=" + item + ", " : "") + "quantity=" + quantity + ", price="
				+ price ;
	}
  
	public abstract String getItem();
	public abstract int getquantity();
	public abstract long getprice();

	
}


class SoftDrink extends VendingMachine{
	String item;
	int quantity;
	long price;
	@Override
	public String toString() {
		return "SoftDrink That You Have Ordered Is:: " + (item != null ? "\nitem::" + item : "") + "\nquantity::" + quantity + "\nprice::" + price;
				
	}
	
	public SoftDrink( String item,int quantity,long price) {
		super(item, quantity, price);
		this.item=item;
		this.quantity=quantity;
		this.price=price;
		
		}

	@Override
	public String getItem() {
		return item;
	}

	@Override
	public int getquantity() {
		return quantity;
	}

	@Override
	public long getprice() {
		return price;
	}
	
	
}
class Tea extends VendingMachine{
	
	String item;
	int quantity;
	long price;
	@Override
	public String toString() {
		return "Tea That You Have Ordered Is::" + (item != null ? "\nitem::" + item : "") + "\nquantity::" + quantity + "\nprice::" + price;
						
	}
	
	public Tea( String item,int quantity,long price) {
		super(item, quantity, price);
		this.item=item;
		this.quantity=quantity;
		this.price=price;
		
		}

	@Override
	public String getItem() {
		return item;
	}

	@Override
	public int getquantity() {
		return quantity;
	}

	@Override
	public long getprice() {
		return price;
	}
	

	
}
class Coffee extends VendingMachine{
	String item;
	int quantity;
	long price;
	@Override
	public String toString() {
		return "Coffee That You Have Ordered Is:: " + (item != null ? "\nitem::" + item : "") + "\nquantity::" + quantity + "\nprice::" + price;
						
	}
	
	public Coffee( String item,int quantity,long price) {
		super(item, quantity, price);
		this.item=item;
		this.quantity=quantity;
		this.price=price;
		
		}

	@Override
	public String getItem() {
		return item;
	}

	@Override
	public int getquantity() {
		return quantity;
	}

	@Override
	public long getprice() {
		return price;
	}
	

	
}

interface VendingMachineFactory{
	  VendingMachine getVendingMachine(String item,int quantity,long price);
}

class SoftDrinkFactory implements VendingMachineFactory{

	@Override
	public VendingMachine getVendingMachine(String item, int quantity, long price) {
		return new SoftDrink(item, quantity, price);
	}
	
}

class TeaFactory implements VendingMachineFactory{

	@Override
	public VendingMachine getVendingMachine(String item, int quantity, long price) {
		return new Tea(item, quantity, price);
	}
	
}
class CoffeeFactory implements VendingMachineFactory{

	@Override
	public VendingMachine getVendingMachine(String item, int quantity, long price) {
		return new Coffee(item, quantity, price);
	}
	
}
class AbstractFactory{
	public static VendingMachine getVendingMachineInstance( VendingMachineFactory afactory,String i, int quantity, long price){
		return afactory.getVendingMachine(i, quantity, price);
	}
}







package com.scp.abstractFactory;

public class TestVendingMachine {
	public static void main(String[] args) {
		
		VendingMachineFactory afactory=new SoftDrinkFactory();
	    VendingMachine v2=AbstractFactory.getVendingMachineInstance(afactory, "Sprite", 3, 75); 
        System.out.println(v2);
		 //VendingMachineFactory afactory=new TeaFactory();
        // VendingMachine v2=AbstractFactory.getVendingMachineInstance(afactory, "Green Tea", 2, 40);
       // System.out.println(v2);
		
          //VendingMachineFactory afactory=new CoffeeFactory();
         // VendingMachine v2=AbstractFactory.getVendingMachineInstance(afactory, "Hot Coffee", 4,60); 
        // System.out.println(v2);
	}

}
 
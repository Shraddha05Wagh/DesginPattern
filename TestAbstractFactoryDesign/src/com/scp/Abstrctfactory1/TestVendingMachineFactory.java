package com.scp.Abstrctfactory1;

import java.util.Scanner;

public class TestVendingMachineFactory {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	}
}
abstract class VendingMachine{
	abstract public String getItem();
	abstract public int TotalNoItem();
	abstract public long TotalPrice();
	@Override
	public String toString() {
		return "\n Item---"+this.getItem()+"\n Total No Item"+this.TotalNoItem()+"\n TotalPrice"+this.TotalPrice();
				
	}
	
}
	
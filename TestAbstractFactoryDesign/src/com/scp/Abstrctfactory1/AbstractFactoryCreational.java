package com.scp.Abstrctfactory1;

public class AbstractFactoryCreational {

	public static void main(String[] args) {
		AbstractMobileFactory aFactory=new iPhoneFactory();
		MobileApplication mymobile= MobileFactory.getMobileInstance(aFactory);
		System.out.println("My Mobile Application"+mymobile);
		
	}
}

abstract  class MobileApplication{
	abstract public boolean isBluetoothavilable();
	abstract public long getPrice();
	abstract public long getIMEINo();
	
	@Override
	public String toString() {
		return " \nisBluetoothavilable::" + isBluetoothavilable() + ", \ngetPrice::" + getPrice()
				+ ", \ngetIMEINo::" + getIMEINo() ;
	}
	
	
}
class iPhone extends MobileApplication{

	@Override
	public boolean isBluetoothavilable() {
		return false;
	}

	@Override
	public long getPrice() {
		// TODO Auto-generated method stub
		return 50000;
	}

	@Override
	public long getIMEINo() {
		return 121242;
	}
	
}
class SamSung extends MobileApplication{

	@Override
	public boolean isBluetoothavilable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public long getPrice() {
		// TODO Auto-generated method stub
		return 12000;
	}

	@Override
	public long getIMEINo() {
		// TODO Auto-generated method stub
		return 542314;
	}
	
}
class Mi extends MobileApplication{

	@Override
	public boolean isBluetoothavilable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public long getPrice() {
		// TODO Auto-generated method stub
		return 13000;
	}

	@Override
	public long getIMEINo() {
		// TODO Auto-generated method stub
		return 4;
	}
	
}
interface  AbstractMobileFactory{
	     MobileApplication getMob();
}
 class iPhoneFactory implements AbstractMobileFactory{

	@Override
	public MobileApplication getMob() {
		return new iPhone();
	}
	 
 }
class SamsungFactory implements AbstractMobileFactory{

	@Override
	public MobileApplication getMob() {
		return new SamSung();
	}
	
}
class MiFactory implements AbstractMobileFactory{

	@Override
	public MobileApplication getMob() {
		return new Mi();
	}	
}

class MobileFactory{
	public static MobileApplication getMobileInstance(AbstractMobileFactory aFactory){
		return aFactory.getMob();
	}
}

/*MobileApplication
 *      --iPhone
 *      --Samsung
 *      --Mi
 * Abstractfactory
 *        ---iPhoneFactory     
 *        ---SamsungFactory
 *        ---MiFactory
 *to hold all factory objects 
 * MobileFactory
 *        
 *   
 */









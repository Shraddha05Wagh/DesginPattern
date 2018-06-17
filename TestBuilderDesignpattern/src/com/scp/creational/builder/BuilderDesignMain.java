package com.scp.creational.builder;

import com.scp.creational.builder.OuterclassPerson.InnerclassPerson;

public class BuilderDesignMain {
	public static void main(String[] args) {
		//Outerclass reference with innerclass object
		OuterclassPerson obj =new InnerclassPerson("Panipuri","Six hrs").setField1("java").setField2("Watching ShinChan").build();
		System.out.println("Person Details Are::"+obj);
	}

}
class OuterclassPerson{
	//mandotary fields 
	String eating;
	String Sleeping;
	
	
	//optional fields
	String Coding;
	String Entertainment;
	
	@Override
	public String toString() {
		return   (eating != null ? "\nEating---" + eating + ", " : "")
				            + (Sleeping != null ? "\nSleeping=---" + Sleeping + ", " : "")
				            + (Coding != null ? "\nCoding---" + Coding + ", " : "")
				            + (Entertainment != null ? "\nEntertainment---" + Entertainment : "") ;
	}
	
	


      //We have to make constructor to access build method
		public OuterclassPerson(InnerclassPerson innerclassPerson) {
			super();
			this.eating=innerclassPerson.eating1;
			this.Sleeping=innerclassPerson.Sleeping1;
			this.Coding=innerclassPerson.Coding1;
			this.Entertainment=innerclassPerson.Entertainment1;

			
		}


		//Static we can call Inner class object in Outerclass Drctly
	            static class InnerclassPerson{
	                	//mandotary fields 
	                		String eating1;
	                		String Sleeping1;
	                		
	                		
	                		//optional fields
	                		String Coding1;
	                		String Entertainment1;
							
	                		
	                		//Constructor is off only mandatory fields
	                		public  InnerclassPerson(String eating, String sleeping) {
								super();
								this.eating1 = eating;
								this.Sleeping1 = sleeping;
							}
						//take set method which returns InnerClass Object	
	                		  public InnerclassPerson setField1(String Codeobj) {
	                		        this.Coding1=Codeobj;
	                		        return this;       //This This is pointing to innerclass obj
	                         }
	                		  
	                    //take Set Method which returns InnerClass Object
	                		  public InnerclassPerson setField2( String Enternobj){
	                			  this.Entertainment1=Enternobj;    //This This is pointing to inner class obj
	                			  return this;
	                		  }
	               
	                		public  OuterclassPerson build(){
	                			return new OuterclassPerson(this);	                			
	         
	                		}
	                  }  		  
	                		  
	   


	
}

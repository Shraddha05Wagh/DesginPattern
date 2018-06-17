
public class TestDesignPattern {
public static void main(String[] args) {
	
	Student s1=Student.getInstance();
	Student s2=Student.getInstance();
    System.out.println(s1==s2);		
            }
    }
class Student{
	/*// for Eagar Intialization
	           private final  static Student studOb=new Student();

			   private Student() {
				super();
			    }
	           
			   public static Student getInstance(){
				   return studOb;
			   }*/

       //for static block
	/*private final static Student studOb;
	
	private Student(){
		super();
	}
	static{
		 studOb=new Student();
	}
	 public static Student getInstance(){
		 return studOb;
	 }*/
	
	//for Lazy Loading
	/*private static Student studOb;
	 private Student(){
		 super();
	 }
	public static Student getInstance(){
		if(studOb==null){
			studOb=new Student();
		}
		return studOb;
	}*/
	 
	//by using threadsafe mechanism
	/*private static Student studOb;
	private Student(){
		super();
	}
	 synchronized public static Student getInstance(){
		if(studOb==null){
			studOb=new Student();
		}
		return studOb;
	}*/
	
	//by using double check mechanism which break by using inner class
	
	/*private static Student studOb;
	private Student(){
		super();
	}
	public static Student getInstance(){
		if(studOb==null){
			  synchronized (Student.class) {
				  if(studOb==null){
						studOb=new Student();
					               }
				                            }
				
			           }
		return studOb;	
		}*/
	
	//by using Inner class
	private Student(){
		super();
	}
	 private final static class InnerStudent{
		 private static Student studOb=new Student();
	 }
	
	 public static Student getInstance(){
		 return InnerStudent.studOb;
	 }	
}
	
	
	
	
	
	



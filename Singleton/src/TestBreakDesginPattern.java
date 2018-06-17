import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;





public class TestBreakDesginPattern {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*//reflection mechanisim
		Student5 s1=Student5.getInstance();//
		Student5 s2=null;
		Constructor []con =Student5.class.getConstructors();//from this we get all constructor of type array
		  for(Constructor c:con){
			  c.setAccessible(true);
			  s2=(Student5) c.newInstance();		 
			  }
		System.out.println(s1==s2);
		*/
		StudentEnum ob=StudentEnum.studObj;
		StudentEnum ob1=StudentEnum.studObj;
		System.out.println(ob==ob1);
		
	}
}
//Eagar Intialization
//  at time of class laoding it will get memory and hence wastage of memory,performance is also degrade
 class Student1{
	 private static final  Student1 studOb1=new Student1();
	  private Student1(){
		  super();
	  }
	  public static Student1 getInstance1(){
		 return studOb1; 
	  }
 }
//Eagar Intialization using Static Block

       class Student2{
        private static final  Student2 studOb1;
        static{
	     studOb1 =new Student2();
       }
      private Student2(){
	  super();
     }
     public static Student2 getInstance1(){
	 return studOb1; 
   }
 }
 //same here performance problem is there
       
 
 //Lazy Intialization
 class Student3{
	 private static Student3 studob;
	        private Student3(){
	        	super();
	        }
	  public static Student3 getInstance1(){
		  if(studob==null){
			  return new Student3();
		  }
		  return studob;
	  }
	  
 }
 //It will be break in multithreading Enviorment.If 2 threads  are come simultaneously then they are null so it is diffcult.
 //ThreadSafe Singletone
 class Student4{
	 
	 
	 private static Student4 studob;
	 private Student4(){
		super(); 
	 }
	 synchronized public static Student4 getInstance(){
		if(studob==null){
			return new Student4();
		}
		return null;
	 }
 }
 //it will decrease performance because waiting time is increases if one thread entered reamining thread goes in waiting state
 //Double Checking with synchronised block
  
 class Student5{
	 private static Student5 studob;
	 private Student5(){
		super(); 
	 }
	public static Student5 getInstance(){
		if(studob==null){
			synchronized (Student5.class) {
				if(studob==null){
					studob= new Student5();
				}
			}
		}
		return studob;
	}
 }
 //overcome by ussing inner class
 //Bill pugh(Eagar intialization+InnerClass)
 
 class Student6{
	private Student6(){
		super();
	}
	private static final class InnerClass{
		private static final Student6 studob=new Student6();
	}
	public static Student6 getInstance(){
		return InnerClass.studob;
	}
 }
 //this mechanism also break by reflection for that we use enum
 
 enum StudentEnum{
	 studObj;
 }
	/*{//StudentEnum is of type enum and treated as userdefine datatype
		// it will declare enum it singleton hence only one object we create
		//treated like StudentEnum studobj=new StudentEnum(); 
	}
 }*/

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
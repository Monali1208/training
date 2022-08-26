package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	String name = "Tom";//non static global var
	static int age = 25;//static global var

	public static void main(String[] args) {
		
		//direct calling:
		sum();
		// calling by classname:
		StaticAndNonStaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.sendmail();
		System.out.println(obj.name);
		
		

	}
	
	public void sendmail() { //non static method
		System.out.println("send mail method");
	}
	
	public static void sum() { //static method
		System.out.println("sum method");
	}

}

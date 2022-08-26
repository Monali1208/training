package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
		
		}
	
	public static void main(int p) {
		
	}
	public static void main(int q, int h) {
		
	}
	
	public void sum() {
		System.out.println("Sum method--zero para");
	}
	
	public void sum(double d) {
		System.out.println("Sum method--zero para");
	}
	
	public void  sum(int i) {
		System.out.println(("sum method--1 input para"));
		System.out.println(i);
		
	}
		
		public void sum(int k,int l) {
			System.out.println(("sum method--2 input para"));
			System.out.println(k+l);
		}
	}



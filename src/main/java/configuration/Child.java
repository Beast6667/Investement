package configuration;

public class Child extends Parent {

	public void m1() {
		System.out.println("m1 method from child class");
		
	}
	
	public void m2() {
		System.out.println("m2 method from child class");
	}
	
	public static void main(String[] args) {
		
		Child xx=new Child();
		xx.m1();
		xx.m2();
		
	   Parent zz =new Parent();
	   zz.m1();
	   zz.m2();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}

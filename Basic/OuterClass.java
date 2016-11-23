package Basic;



public class OuterClass {
	
	public void m1()
	{
		class inner
		{
		  public void m2() {
			
			System.out.println("inner local ");
		}
		
		  
		}
		 inner in=new inner();
		  // in.m2();
		
	}
	public void m3() {
		
	
		System.out.println("outer method ");
	}
	
	public static void main(String[] args) {
		OuterClass obj=new OuterClass();  
		 obj.m1();
	}

}

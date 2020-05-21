
 class A1 {
	
	
	private int a=100;
	class B
	{
		void show()
		{
			System.out.println("this is show:"+a);
		}
	}
	void display()
	{
		System.out.println("this is display");
	
		B obj2=new B();
		obj2.show();
		
	}
 
	

	public static void main(String[] args) {
		
		A1 obj=new A1();
		obj.display();

		

	}
 }



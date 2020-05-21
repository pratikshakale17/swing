
public class dEMO {
	int a =100;
	static int b=200;
	
	
	static class B
	{
		void show()
		{
			System.out.println("THIS IS SHOW");
		}
	}
	static void display()
	{
		System.out.println("this is display");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
display();
B obj=new B();
obj.show();
	}

}

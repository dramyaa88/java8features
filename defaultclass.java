package defaultMethods.interfaces;

public class defaultclass implements defaultMethods,innterface{
	
	@Override
	public void print()
	{
		System.out.println("Im overriden method");
	}
	
	@Override
	public void run()
	{
		System.out.println("Another default in class method");
	}
	
	public static void main(String[] args) {
		
		defaultclass obj = new defaultclass();
		obj.print();
		obj.run();
		defaultMethods.staticprintt();
	
	}

}

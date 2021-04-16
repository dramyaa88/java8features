package defaultMethods.interfaces;

public interface defaultMethods {
	
	default void print()
	{
		System.out.println("Iam a default method");
	}
	
	
	
	static void staticprintt()
	{
		System.out.println("static method");
	}

}

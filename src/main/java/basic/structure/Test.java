package basic.structure;

public class Test {

	public static void main(String[] args) {
		PublicClass p = new PublicClass();
		N n = new N(); // esta definida en PublicClass
		//no existe por mas que este creado el PublicClass2.java
//		PublicClass2 p2 = new PublicClass2();
		AnonymousClasses myApp = new AnonymousClasses();
		myApp.sayHello();
		InnerClass ds = new InnerClass();
	    ds.printEven();
	    ds.localInnerClass();
	    InnerClass.EvenIterator di = ds.getIterador();
		di.printSomething();
		InnerClass.EvenIterator di2 = ds.new EvenIterator();
		di2.printSomething();
	    LocalClassExample.validatePhoneNumber("123-456-7890", "456-7890");
	}

}

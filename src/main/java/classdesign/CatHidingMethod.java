package classdesign;

public class CatHidingMethod extends Animal {
	
//	If a subclass defines a static method with the same 
//	signature as a static method in the superclass,
//	then the method in the subclass hides the one in the superclass.
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        CatHidingMethod myCat = new CatHidingMethod();
        Animal myAnimal = myCat;
        Animal myAnimal2 = new Animal();
        CatHidingMethod.testClassMethod();
        myCat.testInstanceMethod();
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        myAnimal2.testInstanceMethod();
    }
}

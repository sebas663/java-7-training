package basic.structure;

import basic.structure.AnonymousClasses.HelloWorld;

public class InnerClass {
//	Nested classes are divided into two categories: static and non-static. Nested classes that are declared static are simply called static nested classes. Non-static nested classes are called inner classes.

//	cuando se compila se obtiene un .class con el formato OuterClass$InnerClass.class
//	Una inner class puede definir sus propias variables y acceder a las variables de outer.
//  Desde la clase outer, se puede instanciar inner classes y usarlas.
	
//	Static nested class: handy for encapsulation
//	Static nested classes are essentially like regular classes, except that their name is OuterClass.StaticNestedClass and you can play with modifier. So it provided some form of encapsulation that can not exactly be achieved with top-level classes.
//	Think for instance of a LinkedList for which you would like the class Node (used only internally) to not be visible in the package view. Make it a static nested class so that it's fully internal to the LinkedList.
	
	
//	Inner class: handy for ownership and encapsulation
//	An instance of an inner class has access to the field of its enclosing class instance. Think again of the linked list and imagine Node is an inner class:
	
//	Why Use Nested Classes?
//
//			Compelling reasons for using nested classes include the following:
//
//			It is a way of logically grouping classes that are only used in one place: If a class is useful to only one other class, then it is logical to embed it in that class and keep the two together. Nesting such "helper classes" makes their package more streamlined.
//
//			It increases encapsulation: Consider two top-level classes, A and B, where B needs access to members of A that would otherwise be declared private. By hiding class B within class A, A's members can be declared private and B can access them. In addition, B itself can be hidden from the outside world.
//
//			It can lead to more readable and maintainable code: Nesting small classes within top-level classes places the code closer to where it is used.private final static 
	int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    private String something = "Something";
    
    public InnerClass() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    
    public void localInnerClass(){
    	 //inner class
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        EnglishGreeting greeting = new EnglishGreeting();
        greeting.greet();
    }
    
    
    public void printEven() {
        
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    
    public class EvenIterator implements DataStructureIterator {
        
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        
        public boolean hasNext() {
            
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {
            
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }

		public void remove() {
			// TODO Auto-generated method stub
			
		}
		public void printSomething() {
			// TODO something is variable of outer class
			System.out.println(something);
			
		}
    }
    public EvenIterator getIterador() {
        return new EvenIterator();
    }
}

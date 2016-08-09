package basic.structure;
/**
 * If you define a public class or an interface in a class, its name should match the name
 * of the Java source code file. Also, a source code file can’t define more than one public
 * class or interface. If you try to do so, your code won’t compile,
 * @author sebastian
 */
public class PublicClass {
	
	static public int marks;
	
	class N {
		// .. podemos declarar n clases dentro de PublicClass
	}
	interface NN {
		// .. podemos declarar n interfaces de PublicClass
	}
	class M {
		// .. podemos declarar n clases dentro de PublicClass
	}
	interface MM {
		// .. podemos declarar n interfaces de PublicClass
	}
	
}// fin de PublicClass ##########################3

//solo se puede tener una clase publica en un .java y debe tener el mismo nombre que el .java

//The public type PrivateImpl must be defined in its own file
//public class PrivateImpl {
//    int implementationData;
//}

class N {
	// .. podemos declarar n clases en el mismo src file .java
}
interface NN {
	// .. podemos declarar n interfaces en el mismo src file .java
}
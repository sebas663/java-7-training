package basic.structure;

public class AnonymousClasses {
//	son utiles para manejar eventos las clases anonimas
//	útil para la productividad
//	(They are handy to implement callbacks easily, without the burden to create new named class
//	They are also handy for threading (e.g. anonymous Runnable) and a few other similar pattern)
//	Son útiles para poner en práctica las devoluciones de llamada con facilidad, sin la carga de crear nueva clase llamada.
	
	
//	cuando se compila se obtiene un .class con el formato OuterClass$n.class
//	donde n es un numero entero que comienza con 1
	
//	Hay dos tipos adicionales de clases internas. S
//	e puede declarar una clase interna dentro del cuerpo de un método. 
//	Estas clases se conocen como clases locales. 
//	También puede declarar una clase interna dentro del cuerpo de un
//	método sin nombrar la clase. Estas clases se conocen como clases anónimas.
	
	interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
  
    public void sayHello() {
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
        //inner class 
        HelloWorld englishGreeting = new EnglishGreeting();
        
       //Anonymous class
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
       //Anonymous class
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }       
}

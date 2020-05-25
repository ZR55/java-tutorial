/* Abstraction */
// Data abstraction is the process of hiding certain information and showing
// only essentail information to users.
// Abstraction can be achieved with either abstract class or interfaces

// The "abstract" keyword is a non-access modifier, used for classes and methods:
// - Abstract class --> a restricted class that cannot be used to creat objects
//                      (to access it, it must be inherited from another class).
//                      It can have both abstract or regular methods.
// - Abstract method --> can only be used in abstract classes, and it doesn't
//                       have a body. The body is provided by the subclass

// The example is similar to the one used in Polymorphism
// Abstract class
abstract class AbstractionAnimal {
    public abstract void animalSound(); // Abstract method doesn't have a body
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class AbstractionPig extends AbstractionAnimal {
    public void animalSound() {
        // The body of animalSound() is provided here:
        System.out.println("The pig says: wee wee");
    }
}

class Abstraction {
    public static void main(String[] args) {
        AbstractionPig myPig = new AbstractionPig();
        myPig.animalSound();
        myPig.sleep();
    }
}

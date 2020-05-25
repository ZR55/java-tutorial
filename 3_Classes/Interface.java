/* Interface */
// Interface is another way to achieve abstraction in Java

// An interface is a COMPLETELY "abstract class" that is used to group related
// methods with empty bodies.

// To access the interface MUST be "implemented" by another class with the
// "implements" keyword (instead of extends). The body of the interface method
// is provided by the "implement" class.

// Notes on Interface:
// - Like abstract class, interfaces cannot be used to create objects (in the
//   example below, it's NOT possible to create an "InterfaceAnimal" object
//   in the Interface class)
// - Interface methods do NOT have bodies - the body is provided in the
//   "implement" class.
// - On implementation of an interface, you must override ALL of its methods
// - Interface methods are by default abstract and public
// - Interface attributes are by default public, static, and final
// - An interface cannot contain a constructor (as it cannot be used to create
//   objects)

// One Interface
interface InterfaceAnimal {
    public void animalSound(); // Interface method (doesn't have a body)
    public void sleep(); // Interface method (doesn't have a body)
}

// InterfacePig "implements" the Animal Interface:
class InterfacePig implements InterfaceAnimal {
    public void animalSound() {
        // The body of animalSound() is provided here:
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here:
        System.out.println("Zzz");
    }
}

class Interface {
    public static void main(String[] args) {
        InterfacePig myPig = new InterfacePig();

        myPig.animalSound();
        myPig.sleep();

        // For multiple inheritance:
        DemoClass myDemo = new DemoClass();
        myDemo.myMethod();
        myDemo.myOtherMethod();
    }
}

// Why and when to use interfaces?
// - To achieve security - hide certain details and only show the important
//   details of an object (interface)
// - Interface supports "multiple inheritance" which is not supported by Java (
//   a class can only inherit from one superclass). To implement multiple
//   interfaces, separate them with a comma

interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("The method in the FirstInterface is called");
    }
    public void myOtherMethod() {
        System.out.println("The method in the SecondInterface is called");
    }
}

// Rui notes:
// - The classes used in the executed class don't have to be in front of the
//   executed class.

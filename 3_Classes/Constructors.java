/* Constructors */
// A constructor in Java is a special method that is used to initialize objects.
// The constructor is called when an object is created. It can be used to set
// initial values for object attributes.
public class Constructors {
    int x; // create a class attribute

    // Create a class constructor for the Constructors class:
    // Note:
    // - the constructor name must match the class name.
    // - it cannot have a return type (like void)
    // - the constructor is called when the object is created.
    // - all classes have constructors by default: if you don't create one
    //   youself, Java creates it for you. However, you are not able to set
    //   initial values for object attributes.
    public Constructors() {
        x = 5; // Set the initial value for the class attribute
    }

    public static void main(String[] args) {
        // Create an object of class Constructors (this will call the constructor)
        Constructors myObj = new Constructors();
        System.out.println(myObj.x);
    }
}

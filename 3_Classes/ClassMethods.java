public class ClassMethods {
    /* Static VS. Non-static */
    // Java programs have either "static" or "public" attributes and methods.
    // "static" methods can be accessed without creating an object of the class.
    // "public" methods can only be accessed by objects.

    // Static method:
    static void myStaticMethod() {
        System.out.println("Static method can be called without creating an " +
        "object");
    }

    // Public method:
    public void myPublicMethod() {
        System.out.println("Public method must be called by creating an object");
    }

    // Main method:
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        //myPublicMethod(); // This would compile an error

        // Create an object of Public class to access it:
        ClassMethods myPublicObj = new ClassMethods();
        myPublicObj.myPublicMethod();
    }
}

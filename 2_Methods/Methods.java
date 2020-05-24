// Methods must be declared inside of a class.
public class Methods {
    // Create a method inside of a class:
    // firstMethod() --> is the name of the method
    // static --> means the method belongs to the Methods class and not an
    //            object of the Methods class.
    // void --> means that this method doesn't have a return value.
    static void firstMethod() {
        System.out.println("I just got executed!");
    }

    /* Parameters and arguments */
    static void secondMethod(String fname) {
        System.out.println(fname + " should be printed");
    }
    // Multiple parameters:
    static void thirdMethod(String fname, int age) {
        System.out.println(fname + " is " + age + " years old.");
    }

    /* Return values */
    // The above methods used "void" which indicates that the method should not
    // have return values. If you want the method to return a value, you can
    // use a primitive data type instead of void
    static int fourthMethod(int x) {
        return x + 5;
    }
    static int fifthMethod(int x, int y) {
        return x + y;
    }

    /* Method overloadding */
    // Method overloadding: multiple methods can have the same name as long
    //                      as the number and/or types of parameters are different.
    // Two different name methods:
    static int plusMethodInt(int x, int y) {
        return x + y;
    }
    static double plusMethodDouble(double x, double y) {
        return x + y;
    }
    // Instead of having above both methods, we can creat one for double by
    // overloading the int method:
    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        firstMethod();

        // When a parameter is passed to the method, it's called an argument.
        // So "fname" in the above method is a parameter, while "Liam",
        // "Jenney", and "Bob" are arguments.
        secondMethod("Jenney");
        secondMethod("Liam");
        secondMethod("Bob");

        thirdMethod("Jenney", 9);
        thirdMethod("Liam", 10);
        thirdMethod("Bob", 12);

        System.out.println(fourthMethod(8));

        System.out.println(fifthMethod(3, 5));

        /* Method overloading */
        int myNumInt = plusMethod(5, 7); // Widening casting if specify myNumInt as a double
        double myNumDouble = plusMethod(5.0, 7.0);
        System.out.println("Method overloading example (int): " + myNumInt);
        System.out.println("Method overloading example (double): " + myNumDouble);
    }


}

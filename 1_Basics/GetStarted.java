// A class should always start with an uppercase first letter.
// Java is case-sensitive
// The name of the Java file MUST MATCH the class name
public class GetStarted {
    // The main() method is required in every Java program
    // Any code in the main() method will be executed
    public static void main(String[] args) {
        /* Hello World */
        System.out.println("Hello World!");

        /* Creat variables */
        String name = "Rui";
        System.out.println(name);

        /* Declare many variables with the same type */
        int x = 5, y = 6, z = 7;
        System.out.println(x + y + z);

        /* Identifiers */
        // All Java variables must be identified with unique names
        // These unique names are called "Identifiers".
        // It is recommended to use descriptive names to create understandable
        // and maintainable code.
        // Rules for constructing names for variables:
        // 1. Names must begin with a letter which should be lowercase
        // 2. Names are case sensitive
        // 3. Reversed words cannot be used for names

        /* Data Types */
        // Two groups of data types:
        // 1. Primitive data types (pre-defined):
        //    byte, short, int, long (end the value with "L"), float (end the
        //    value with "f", "e" can be used to indicate the power of 10),
        //    double (end that value with "d"), boolean (true or false), char
        // 2. Non-primitive data types (are called reference types because they
        //    redefined by programmer):
        //    String, Array, Classes
        // Non-primitive data type:
        // They are called reference types because they refer to objects
        // Difference between primitive and non-primitive data types:
        // - pre-defined                     VS    defined by programmers
        // - cannot                          VS    can be used to call methods
        // - always has a value              VS    can be null
        // - starts with a lowercase         VS    starts with an uppercase
        // - size depends on the data type   VS    all have the same size

        /* Type Casting */
        // Type casting is when you assign a value of one primitive type to
        // another data type
        // - Widening Casting (automatically)
        //   It converts a smaller type to a larger type size
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);
        System.out.println(myDouble);
        // - Narrowing Casting (manually)
        //   It converts a larger type to a smaller size type
        double myDouble1 = 9.25;
        int myInt1 = (int) myDouble1; // Manually casting: double to int
        System.out.println(myDouble1);
        System.out.println(myInt1);

        /* Operators */
        // Bitwise operators: ref --> https://www.tutorialspoint.com/Java-Bitwise-Operators
        int operatorInt = 5;
        // & (bitwise and):
        // Binary AND Operator copies a bit to the result if it exists in both operands.
        operatorInt &= 2;
        System.out.println(operatorInt);
        // | (bitwise or):
        // Binary OR Operator copies a bit if it exists in either operand.
        // ^ (bitwise XOR):
        // Binary XOR Operator copies the bit if it is set in one operand but not both.
        // << (left shift):
        // Binary Left Shift Operator. The left operands value is moved left by
        // the number of bits specified by the right operand.
        // Example: A << 2 will give 240 which is 1111 0000
        // >> (right shift):
        // Binary Right Shift Operator. The left operands value is moved right
        // by the number of bits specified by the right operand.
        // Example: A >> 2 will give 15 which is 1111

        /* Strings */
        // String methods:
        // - String.length()
        // - String.toUpperCase()
        // - String.toLowerCase()
        // - String.indexOf(): returns the index (the position) of the first
        //                     occurrence of a specified text in a string (
        //                     including white spaces)
        String text = "Please locate where 'locate' occurs!";
        System.out.println(text.indexOf("locate"));
        // - String.concat(): works the same as "+"

        /* Math */
        // Math method (All Math methods are static):
        // - Math.max(x, y)
        // - Math.min(x, y)
        // - Math.sqrt(x)
        // - Math.abs(x)
        // - Math.random(): returns a random number between 0.0 (inclusive)
        //                  and 1.0 (exclusive)
        // To get a random number between 0 and 100:
        int randomNum = (int)(Math.random() * 101);

        /* If...Else... */
        // Syntax:
        // if (condition1) {
        //     block of code to be executed if condition1 is true
        // } else if (condition2) {
        //     block of code to be executed if the condition1 is false and condition2 is true
        // } else {
        // block of code to be executed if the condition1 is false and condition2 is false
        // }
        // Short Hand if...else... (Ternary operator)
        // Syntax:
        // variable = (condition) ? expressionTrue : expressionFalse;
        int time = 20;
        // traditional way:
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // Short hand:
        String result = (time < 18) ? "Good day1." : "Good evening1.";
        System.out.println(result);

        /* Switch */
        // Syntax:
        // switch(expression) {
        //     case x:
        //         // code block
        //         break;
        //     case y:
        //         // code block
        //         break;
        //     default:
        //         // code block
        // }

        /* For loops */
        // Syntax:
        // for (statement1; statement2; statement3) {
        //     code block to be executed
        // }
        // statement1 --> is executed (one time) before the execution of the block
        // statement2 --> defines the condition of the for loop
        // statement3 --> is executed (every time) after the code block has been executed

        /* For-Each loop */
        // Syntax:
        // for (type variableName : arrayName) {
        //     code block to be executed
        // }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

        /* Arrays */
        // Declare an array: define the variable type with square brackets
        //String[] cars2;
        // Insert values:
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        // To create an array of integers:
        int[] myIntArray = {1, 4, 2, 3, 6};
        // Access to the element of an array:
        System.out.println(cars2[0]);
        // To change the value of an array element:
        cars2[3] = "Honda"; // Cannot use negative index numbers
        System.out.println(cars2[3]); // cannot print the whole array
        // To check array length:
        System.out.println(cars2.length); // No () after length.

        /* Multidimensional arrays */
        // To creat one:
        int[][] multiArray = { {1, 2, 3, 3}, {4, 5, 6, 7} };
        // To acces the element in Multidimensional array:
        System.out.println(multiArray[1][3]); // output: 7
    }
}

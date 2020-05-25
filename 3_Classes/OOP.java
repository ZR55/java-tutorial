/* OOP */
// OOP stands for "Object-Oriented Programming"
// Difference between procedural and object-oriented programming
// Procedural programming is about writing procedures or methods that perform
// operations on the data; while object-oriented programming is about creating
// objects that contain both data and methods.

// OOP's advantages over procedural programming:
// - OOP is faster and easier to execute
// - OOP provides a clear structure for the programs
// - OOP helps to keep the Java code DRY (Don't Repeat Yourself), and makes the
//   code easier to maintain, modify, and debug
// - OOP makes it possible to create full reusable applications with less code
//   and shorter development time.

/* Class and objects */
// Classes and objects are the two main aspects of OOP.
// A class is a template for objects, and an object is an instance of a class.
// When the individual objects are created, they inherit all the variables
// and methods from the class.
public class OOP {
    int x = 5;

    public static void main(String[] args){
        // Create an object of class OOP:
        OOP myObj = new OOP();
        System.out.println(myObj.x);
    }
}

/* Multiple classes */
// You can also create an object of a class and access it in another class.
// This is often used for better organization of classes (one class has all
// the attributes and methods, while the other class holds the "main()"
// method (code to be executed))

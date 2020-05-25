/* Modifiers */
// Access modifier (like "public") is used to set the access level for classes,
// attributes, methods, and constructors.

// Two groups of modifiers:
// - Access modifier --> controls the access level
//   - For classes:
//     ~ public --> the class is accessible by any other classes
//     ~ default --> only accessible by classes in the same package.
//   - For attributes, methods, and constructors:
//     ~ public --> the code is accessible for all classes
//     ~ private --> the code is only accessible within the declared class
//     ~ default --> the code is only accessible in the same package
//     ~ protected --> the code is accessible in the same package and subclasses
// - Non-access modifier --> don't control the access level, but provide other functionality.
//   - For classes:
//     ~ final --> the class cannot be inherited by other classes
//     ~ abstract --> the class cannot be used to create objects (to access an
//                    abstract class, it MUST be inherited from another class)
//   - For attributes and methods:
//     ~ final --> attributes and methods cannot be overriden/modified
//     ~ static --> attributes and methods belong to the class, rather than an obj
//     ~ abstract --> can ONLY be used in an abstract class, and can only be
//                    used on methods. The method doesn't have a body. The body
//                    is provided by the subclass (inherited from)
//     ~ transient --> Attributes and methods are skipped when serializing
//                     the object containing them
//     ~ synchronized --> Methods can only be accessed by one thread at a time
//     ~ volatile --> the value of an attribute is not cached thread-locally,
//                    and is always read from the "main memory"

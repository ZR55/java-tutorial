/* Encapsulation */
// Encapsulation makes sure that "sensitive" data is hidden from users.
// To achieve this, you must:
// - declare class variables/attributes as private
// - provide public get and set methods to access and update the value of a
//   private variable.

// Get and Set
// Get method --> returns the variable value;
// Set method --> sets the value.
// Syntax: they start with either get or set, followed by the name of the
//         variable, with the first letter in uppercase
public class Encapsulation {
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    // The set method taks a parameter and assigns it to the name variable.
    // The "this" keyword is used to refer to the current object.
    public void setName(String newName) {
        this.name = newName;
    }
}

// WHY?
// - Better control of class attributes and methods
// - Class attributes can be made read-only (if only get method is used), or
//   write-only (if only set method is used)
// - Flexible: the programmer can change one part of the code without affecting
//   other parts.
// - Increase the security of data.

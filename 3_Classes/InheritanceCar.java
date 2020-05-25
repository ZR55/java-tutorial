/* Inheritance */
// subclass (child) --> the class that inherits from another class
// superclass (parent) --> the class being inherited from

// To inherit from a class, use "extends" keyword

class InheritanceVehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class InheritanceCar extends InheritanceVehicle {
    private String modelName  = "Mustang";
    public static void main(String[] args) {
        // Create a myCar object:
        InheritanceCar myCar = new InheritanceCar();

        // Call the honk method (from the vehicle class):
        myCar.honk();

        // Display the brand name (from the vehicle class) and the model name
        // (from the Car class):
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

// Why and when to use "Inheritance"?
// It's useful for code reusability: reuse attributes and methods of an
// existing class when you create a new one.

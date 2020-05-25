public class ClassMethodsCars {
    // Create a fullThrottle() method:
    public void fullThrottle() {
        System.out.println("This car is going as fast as it can.");
    }

    // Create a speed() method and add a parameter:
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    // Inside the main method, call the methods on the myCar object:
    public static void main(String[] args) {
        ClassMethodsCars myCar = new ClassMethodsCars();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}

/* Polymorphism */
// It means "many forms"
// Inheritance lets us inherit attributes and methods from another class.
// Polymorphism uses those methods to perform different tasks. This allows us
// to perform a single action in different ways.
// Example: a super class called "Animal" that has method called "animalSound()".
//          Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they
//          also have their own implementation of an animal sound.

class PolymorphismAnimal {
//class PolymorphismAnimal{
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class PolyPig extends PolymorphismAnimal {
//class Pig extends PolymorphismAnimal{
    public void animalSound() {
        System.out.println("The pig says: wee, wee");
    }
}

class PolyDog extends PolymorphismAnimal {
//class Dog extends PolymorphismAnimal{
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Polymorphism {
//class test{
    public static void main(String[] args) {
        PolymorphismAnimal myAnimal = new PolymorphismAnimal();
        //PolymorphismAnimal myPig = new PolyPig();
        //PolymorphismAnimal myDog = new PolyDog();
        PolyDog myDog = new PolyDog();
        PolyPig myPig = new PolyPig();

        //PolymorphismAnimal myAnimal = new PolymorphismAnimal();
        //PolymorphismAnimal myPig = new Pig();
        //PolymorphismAnimal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}

// Rui notes:
// it seems like the file name has to be same as the class name which will be
// executed if there are more than one class in the file.

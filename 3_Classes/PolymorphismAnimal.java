/* Polymorphism */
// It means "many forms"
// Inheritance lets us inherit attributes and methods from another class.
// Polymorphism uses those methods to perform different tasks. This allows us
// to perform a single action in different ways.
// Example: a super class called "Animal" that has method called "animalSound()".
//          Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they
//          also have their own implementation of an animal sound.

class Animal {
//class PolymorphismAnimal{
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
//class Pig extends PolymorphismAnimal{
    public void animalSound() {
        System.out.println("The pig says: wee, wee");
    }
}

class Dog extends Animal {
//class Dog extends PolymorphismAnimal{
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class PolymorphismAnimal {
//class test{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

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

public class Tester {
    public static void displayInfo(Animal a) {
        a.makeSound();
    }

    public static void main(String[] args) {
        // reference_type variable = new obj()
        // Animal a1 = new Dog(); //upcasting
        // Dog d1 = new Dog();
        // Animal a1 = (Animal)d1; //upcasting
        // a1.makeSound();

        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        displayInfo(d1);
        displayInfo(c1);
    }
}

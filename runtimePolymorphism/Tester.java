public class Tester {
    public static void displayInfo(Animal a) {
        if (a instanceof Dog) {
            Dog d = (Dog) a; // downCasting
            d.makeSound();
            d.bark();
        } else {
            a.makeSound();
        }
    }

    public static void main(String[] args) {
        // reference_type variable = new obj()
        // Animal a1 = new Dog(); //upCasting
        // Dog d1 = new Dog();
        // Animal a1 = (Animal)d1; //upCasting
        // a1.makeSound();

        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        // System.out.println(a1 instanceof Dog);
        // System.out.println(d1 instanceof Animal);
        displayInfo(a1);
        displayInfo(d1);
        displayInfo(c1);
    }
}

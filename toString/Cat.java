public class Cat extends Animal {
    public Cat() {
        super("cat");
        // System.out.println("Cat Class Calling");
    }

    public void poke() {
        System.out.println(name + " cat is smiling");
    }

    public String toString() {
        return "i am a poke toString";
    }
}
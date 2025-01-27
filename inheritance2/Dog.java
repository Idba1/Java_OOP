public class Dog extends Animal {
    public String color;

    public Dog(String nm, String clr) {
        super(nm); // written internally
        color = clr;
    }

    public void bark() {
        System.out.println(color + " " + name + " is barking");
    }

    // public Dog() {
    // super("Beb"); // written internally
    // }
}

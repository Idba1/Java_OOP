public class Dog extends Animal {
    public String color;

    public Dog(String nm, String clr) {
        super(nm); // written internally
        color = clr;
    }

    public void bark() {
        System.out.println(color + " " + name + " is barking");
    }

    public void eat() { //This is method overriding. Same method as like in parent class
        System.out.println(name + " is eating meat");
    }

    public void eat(int quantity) { // This is NOT method overriding. CZ it take a variable
        System.out.println(name + " is eating " + quantity + " chicken");
    }
}

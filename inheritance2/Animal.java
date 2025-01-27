public class Animal {
    public String name;

    public Animal() {
        System.out.println("no parameter");
    }

    public Animal(String nm) {
        name = nm;
        System.out.println("one parameter");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}

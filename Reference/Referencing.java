public class Referencing {
    public String name;
    public int id;

    public Referencing() {
    }

    public Referencing(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void makeCall(int x) {
        System.out.println("i'm calling " + name);
        System.out.println(x);
    }

    public void makeCall(Referencing obj) {
        System.out.println("i'm calling " + name);
        System.out.println("hey " + obj.name);
        System.out.println("sir is calling you.");
    }

    public void showDetails() {
        System.out.println("Name: " + name + ". id: " + id);
    }
}

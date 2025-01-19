public class Student {
    public String name; // instance variable
    public int id;

    public Student(String name, int id) { // same name as the class name
        // System.out.println("i was called");
        this.name = name;
        this.id = id;
        System.out.println(name + " " + id);
    }

    public void standUp() { // instance method
        System.out.println("Stand up");
    }

    public void showDetails() {
        System.out.println("Student name is " + name + " and id is " + id);
    }
}
// construcor have must tobe same name as the class name
// constructor kokono return kore na. access modifier er pore constructor name
// use kori
// constructor ekbar e use kori. multiple time call korle new memory location e
// newobject create hoye jay.
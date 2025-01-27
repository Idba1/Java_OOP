public class SWEStudent extends Student {
    public int numberOfLab;

    public SWEStudent(String nm, int i, int Lab) {
        super(nm, i);
        numberOfLab = Lab;
    }

    public void cry() {
        System.out.println(name + " is crying. because of " + numberOfLab + " Lab");
    }

    public void doLabClass() {
        System.out.println(name + " doing Lab Class");
        System.out.println("------------------------------");
    }
}

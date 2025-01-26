public class cseStudent extends Student {

    public cseStudent(String nm, int i) {
        name = nm;
        id = i;
    }

    public void doLabClass() {
        System.out.println(name + " doing Lab Class");
        System.out.println("------------------------------");
    }
}

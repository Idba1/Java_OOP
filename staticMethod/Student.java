public class Student {

    public String name;
    public int id;
    public static String uniName = "Dubai International University";
    public static String courseTitle = "OOD";

    public Student(String nm, int i) {
        name = nm;
        id = i;
    }

    public static void updateUniName(String unName) { // static method
        uniName = unName;
        m1();
    }

    public static void updateCourse(String cName) { // static method
        courseTitle = cName;
    }

    public static void m1() { // static method
        System.out.println("static method call");
    }

    public void showDetails() {
        System.out.println("my name is " + name);
        System.out.println("my id is " + id);
        System.out.println("my uniName is " + uniName);
        System.out.println("my Course is " + courseTitle);
        System.out.println("------------------------------");
    }
}
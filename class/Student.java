public class Student {
    public String name; // instance variable
    public int id = 000;
    public String clubName;

    public void duingClass() { // instance method
        System.out.println(name + " attend her OOP class");
    }

    public void clubActivity(String clubName) { // instance method
        System.out.println(name + " join in " + clubName + " club");
    }

    public void showDetail() {
        System.out.println("Student name is " + name + " and her id is " + id + " ");
        duingClass();
        clubActivity(clubName);
    }
}

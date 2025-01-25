import java.util.*;

public class Student {
    public String name;
    public int id;

    public Course[] courses = new Course[5];
    public int courseCount = 0;

    public Student(String nm, int i) {
        name = nm;
        id = i;
    }

    public void addCourse(Course c) {
        // System.out.println(c);
        courses[courseCount] = c;
        courseCount += 1;
    }

    public void showDetails() {
        System.out.println("my name is " + name);
        System.out.println("my id is " + id);
        System.out.println("course taken ");
        // System.out.println(Arrays.toString(courses));
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i].code);
            System.out.println(courses[i].title);
        }
    }
}

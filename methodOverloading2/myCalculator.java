public class myCalculator {

    public int add(int x, int y) {
        int sum = x + y;
        System.out.println("2 int");
        return sum;
    }

    public int add(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("3 int");
        return sum;
    }

    public double add(double x, int y, int z) {
        double sum = x + y + z;
        System.out.println("2 int & 1 double");
        return sum;
    }

    public double add(double x, double y, int z) {
        double sum = x + y + z;
        System.out.println("2 int & 1 double");
        return sum;
    }

    public void add(String x, int y) {
        System.out.println("subject name " + x + " " + y);
    }

    public String add(String firstName, String LastName) {
        String fullName = ("Teacher name " + firstName + " " + LastName);
        return fullName;
    }
}

// same method name
// multiple parameter
// different type data
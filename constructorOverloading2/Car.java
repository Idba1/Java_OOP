public class Car {
    public String brand;
    public String model;
    public int age;

    public Car() {
        System.out.println("no parameter");
        System.out.println("car bran is " + brand + ", and model " + model + ", and age is " + age);
        System.out.println("------------------------");
    }

    public Car(String model, int age) {
        System.out.println("2 parameter");
        this.model = model;
        this.age = age;
        System.out.println("car brand is " + brand + ", and model " + model + ", and age is " + age);
        System.out.println("------------------------");
    }

    public Car(String brand, String model, int age) {
        System.out.println("3 parameter");
        this.brand = brand;
        this.model = model;
        this.age = age;
        System.out.println("car brand is " + brand + ", and model " + model + ", and age is " + age);
        System.out.println("------------------------");
    }

}

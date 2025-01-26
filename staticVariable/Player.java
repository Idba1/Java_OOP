public class Player {
    public String name;
    public int run = 0; // instance variable
    public static int teamRun = 0; // static variable

    public void hit_four() {
        run += 4;
        teamRun += 4;
    }

    public void hit_six() {
        run += 6;
        teamRun += 6;
    }

    public void showDetails() {
        System.out.println("Player Name is " + name);
        System.out.println("He / She take " + run + " run");
    }
}

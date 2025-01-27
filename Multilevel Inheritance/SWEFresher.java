public class SWEFresher extends SWEStudent {
    public String orientationDate;

    public SWEFresher(String nm, int i, int Lab, String oD) {
        super(nm, i, Lab);
        orientationDate = oD;
    }

    public void orientation() {
        System.out.println("YAY! " + orientationDate + " orientation programme");
    }
}

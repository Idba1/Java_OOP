public class myCalculator {
    public int result;

    public void add1(int n1, int n2) {
        result = n1 + n2;
        System.out.println(result);
    }

    public int add2(int n1, int n2) {
        result = n1 + n2;
        // System.out.println("from mc "+result);
        return result;
    }
}
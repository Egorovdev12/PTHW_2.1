public class Main {
    public static void main(String[] args) {

        Ints counter = new IntsCalculator();
        System.out.println(counter.sum(4, 5));
        System.out.println(counter.mult(4, 5));
        System.out.println(counter.pow(4, 5));
    }
}
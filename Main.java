public class Main {
    public static void main(String[] args) {
        BmiService servise = new BmiService();

        double height = 175;

        double indexMB = servise.calculate (height);

        System.out.println(indexMB);

    }
}
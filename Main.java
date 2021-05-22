public class Main {
    public static void main(String[] args) {
        BmiService servise = new BmiService();

        double height = 175;
        double wt = 70;

        double indexMB = servise.calculate(height, wt);

        System.out.println(indexMB);

    }
}
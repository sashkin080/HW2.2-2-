public class BmiService {
    public double calculate(double height, double wt) {

        double doubleHeight = height * height;
        double indexMB = wt / doubleHeight;

        return indexMB;

    }

}
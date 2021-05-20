public class BmiService {
    public double calculate(double height){

        double wt = 70;
        double doubleHeight = height*2;
        double indexMB = wt/doubleHeight;

        return indexMB;

    }

}

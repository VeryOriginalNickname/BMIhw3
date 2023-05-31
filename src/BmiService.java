public class BmiService {

    public double calculate(double height, double weight) {

        double res = weight / (height * height);

        return res;
    }
}

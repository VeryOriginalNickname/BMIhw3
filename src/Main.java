public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double Height = 1.87F;
        double Weight = 98;

        double calculated = service.calculate(Height, Weight);

        int result = (int) calculated;

        System.out.println("Result is: " + result);

    }
}

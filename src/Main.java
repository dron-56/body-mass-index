public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 95;
        double height = 1.65;
        double index = service.calculate(height, weight);
        System.out.println(index);

    }
}

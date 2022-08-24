public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 95;
        float height = 165;
        float index = service.calculate(height, weight);
        System.out.println(index);

    }
}

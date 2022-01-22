public class main_2 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 77;
        float growth = (float) 1.70;
        float bmi = service.calculate(weight, growth);
        System.out.println(bmi);
    }
}

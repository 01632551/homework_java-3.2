public class BmiService {
    public float calculate(int weight, float growth) {
        Pow math = new Pow();
        float bmi = weight / math.pow(growth);
        return bmi;
    }
}

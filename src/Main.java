public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 70; // вес в килограммах
        double height = 1.77; // рост в метрах
        int bmi = service.calculate(weight, height);
        System.out.println("Индекс массы тела: " + bmi);
    }
}
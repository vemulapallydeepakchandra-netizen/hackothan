import java.util.Scanner;

class WasteCalculators {
    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();

        System.out.println("Total Waste: " + calculateTotalWaste(p1, p2));
    }
}

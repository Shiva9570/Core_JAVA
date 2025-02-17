import java.util.Scanner;
public class ParcelCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the parcel in kg: ");
        double weight = scanner.nextDouble();

        double charges = calculateParcelCharges(weight);
        System.out.printf("The total parcel charges for %.2f kg is: ₹%.2f%n", weight, charges);
    }

    public static double calculateParcelCharges(double weight) {
        double baseCharge = 15.0;  // Charge for the first 1 kg
        double additionalChargePer500g = 8.0;  // Charge for every additional 500g

        if (weight <= 1) {
            return baseCharge;
        } else {
            // Calculate additional weight over 1 kg
            double additionalWeight = weight - 1;
            // Calculate how many 500g increments are there in the additional weight
            int additional500gUnits = (int) (additionalWeight * 2);  // 1 kg = 2 * 500g
            // Total charge calculation
            return baseCharge + (additional500gUnits * additionalChargePer500g);
        }
    }
}

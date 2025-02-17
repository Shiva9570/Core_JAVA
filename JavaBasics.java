import java.util.Scanner;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name of the student: ");
        String name = sc.nextLine();
        
        int Tam = getValidMark(sc, "Tamil");
        int Eng = getValidMark(sc, "English");
        int Sci = getValidMark(sc, "Science");
        int Soc = getValidMark(sc, "Social");

        int total = Tam + Eng + Sci + Soc;
        double average = total / 4.0;  // 4 subjects, not 5

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Marks: %.2f\n", average);

        sc.close();
    }

    private static int getValidMark(Scanner sc, String subject) {
        int mark;
        while (true) {
            System.out.print("Enter " + subject + " mark: ");
            if (sc.hasNextInt()) {  // Check if input is an integer
                mark = sc.nextInt();
                if (mark >= 0 && mark <= 100) {
                    break; // Valid mark
                } else {
                    System.out.println("Invalid input. Marks should be between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); // Clear the invalid input
            }
        }
        return mark; // Return the validated mark
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello in the Units converter!");
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose what do you want to convert: \n"
                + "1. Currencies \n"
                + "2. Distance \n"
                + "3. Weight \n"
                + "4. Temperature \n"
                + "5. Velocity \n"
                + "6. Exit \n");
        int choice = 0;
        do {
            System.out.println("Write a number of menu pointed above to choose feature:");
            choice = scan.nextInt();

            switch (choice) {
                case 1 -> {
                    Currencies curr = new Currencies();
                    curr.convert();
                }
                case 2 -> {
                    Distance dist = new Distance();
                    dist.convert();
                }
                case 3 -> {
                    System.out.println("Weight feature not available yet, try again later");
                }
                case 4 -> {
                    System.out.println("Temperature feature not available yet, try again later");
                }
                case 5 -> {
                    System.out.println("Velocity feature not available yet, try again later");
                }
            }
        } while (choice != 6);
    }
}
import java.util.Scanner;

public class Distance {
    Scanner scan = new Scanner(System.in);
    private double km = 1000;
    private double m = 1;
    private double mile = 1609.344;
    private double in = 2.54e-2;
    private double ft = 0.3048;
    private double yd = 0.9144;

    private double distanceChoice (int x){
        switch (x){
            case 1 -> {
                return km;
            }
            case 2 -> {
                return m;
            }
            case 3 -> {
                return mile;
            }
            case 4 -> {
                return in;
            }
            case 5 -> {
                return ft;
            }
            case 6 -> {
                return yd;
            }
        }
        return 0;
    }


    public void convert (){
        System.out.println("Available distances for conversion: \n 1. km \t2. m \t3. mile \t4. in \t5. ft \t6. yd ");
        System.out.println("Choose distance unit from which you want to convert:");
        int choice1 = scan.nextInt();
        double dist1 = this.distanceChoice(choice1);
        System.out.println("Choose distance unit to which you want to convert:");
        int choice2 = scan.nextInt();
        double dist2 = this.distanceChoice(choice2);
        System.out.println("Write what distance you want to convert:");
        double distance = scan.nextInt();
        double result = distance * dist1/dist2;
        System.out.println("Your distance in new unit is: " + result );
    }
}

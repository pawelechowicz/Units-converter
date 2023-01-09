import java.util.Scanner;

public class Currencies {
    Scanner scan = new Scanner(System.in);
    private double PLN = 1;
    private double EUR = 4.67;
    private double USD = 4.40;
    private double CHF = 4.47;
    private double GBP = 5.29;
    private double JPY = 3.32;

    private double currencyChoice (int x){
        switch (x){
            case 1 -> {
                return PLN;
            }
            case 2 -> {
                return EUR;
            }
            case 3 -> {
                return USD;
            }
            case 4 -> {
                return CHF;
            }
            case 5 -> {
                return GBP;
            }
            case 6 -> {
                return JPY;
            }
        }
        return 0;
    }


    public void convert (){
        System.out.println("Available currencies for conversion: \n 1. PLN \t2. EUR \t3. USD \t4. CHF \t5. GBP \t6. JPY ");
        System.out.println("Choose currency from which you want to convert:");
        int choice1 = scan.nextInt();
        double money1 = this.currencyChoice(choice1);
        System.out.println("Choose currency to which you want to convert:");
        int choice2 = scan.nextInt();
        double money2 = this.currencyChoice(choice2);
        System.out.println("Write how much money you want to convert:");
        double money = scan.nextInt();
        double result = money * money1/money2;
        System.out.println("Your money in new currency is: " + result );
    }
}

import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java dealership");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");
        String option = scan.nextLine();
        switch  (option){
            case "a":
                System.out.println("what is your budget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("Great! a nissan Altima is available");
                    System.out.println("\nDo you hve insurance? Write 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a licence? write 'yes' or 'No'");
                    String licence = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("yes") && licence.equals("yes") && creditScore > 660){
                        System.out.println("Sold! pleasure doing business with you");
                }else {
                    System.out.println("We are sorry. you are not eligible");
                }
                }else{
                    System.out.println("we don't sell cars under $10000. sorry!a");
                }
            case "b":
//                System.out.println("You choose option " + option); break;
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();
                System.out.println("\nwhat is your selling price?");
                int price = scan.nextInt();

                if (value > price && price < 30000){
                    System.out.println("\nwe will buy your car. Pleasure doing business with you!");
                }else{
                    System.out.println("\nSorry, we are not interested");
                }
//            default: System.out.println("Invalid option");
        }
        scan.close();
    }
}

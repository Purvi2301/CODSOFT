import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ATM ");
        Services obj1 = new Services();
        obj1.displayMenu();
        obj1.Services();

    }
}
class Services {
    Scanner sc = new Scanner(System.in);

    public void displayMenu() {
        System.out.println(" 1 . Withdraw \n 2 . Deposit \n 3 . Inquiry \n 4 . Exit");
    }

    public void Services() {
        System.out.println("Enter Initial Amount:");
        Scanner sc = new Scanner(System.in);
        double bal = sc.nextDouble();
        int choice = 0 ;
        while (true) {

            System.out.println("Choose any services (1/2/3/4) :");
            choice = sc.nextInt();


            switch (choice) {
                case 1 -> {
                    System.out.println("Enter withdraw amount :");
                    double amt = sc.nextDouble();
                    if (amt > 0 && amt < bal) {
                        bal -= amt;
                        System.out.println("Withdraw Successful  \n Available Balance = " + bal);
                    } else {
                        System.out.println("Withdraw unsuccessful ");
                    }
                }

                case 2 -> {
                    System.out.println("Enter deposit amount :");
                    double amt = sc.nextDouble();
                    if (amt > 0) {
                        bal += amt;
                        System.out.println("Deposit Successful  \n Available Balance = " + bal);
                    }

                }

                case 3 -> System.out.println("Available Balance = " + bal);

                case 4 -> {
                    System.out.println("Thank You for Using This Service");
                    System.exit(0);
                }

                default -> System.out.println("Enter a valid choice");
            }

        }

    }
}
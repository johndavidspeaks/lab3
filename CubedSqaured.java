import java.util.Scanner;

public class CubedSqaured {

    public static void main(String[] args) {


//               Scanner scr = new Scanner(System.in);
//
//        int userNumb = 0;
//        int sqaure = 0;
//        int cubed = 0;
//
//
//        System.out.println("Lets play a game please enter a number ");
//        userNumb = scr.nextInt();
//        System.out.println();
//        System.out.println();
//        System.out.println("you entered in " + userNumb + " Lets see if we can sqaure be cube it ! ");
//
//        cubed = userNumb * userNumb * userNumb;
//        userNumb = userNumb * userNumb;
//
//        System.out.println();
//
//
//
//
        Scanner ii = new Scanner(System.in);
        String userInput = "";
        do {
            System.out.println(" enter a number.");
            double userNumber = ii.nextDouble();

            if (userNumber <= 1 || userNumber >= 2097151) {
                System.out.println("Nope please a number between 1 - 2097151.");
                userNumber = ii.nextLong();
                ii.nextLine();
            }
            System.out.printf("%-10s %-10s %-10s %n", "Number", "Squared", "Cubed");
            System.out.printf("%-10s %-10s %-10s %n", "+++++", "+++++", "+++++");
            for (long i = 1; i <= userNumber; i++) {
                System.out.printf("%-10d %-10d %-10d %n", i, i*i, i*i*i);
                System.out.println("Guess again ? " + "yes or no");
                userInput = ii.nextLine();
            }

        } while (userInput.equalsIgnoreCase("yes")||userInput.equalsIgnoreCase("Y"));{

        }
    }
}









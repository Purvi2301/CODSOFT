// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.sql.SQLOutput;
import java.util.* ;
public class Main {
    public static void main(String[] args) {
        int number;
        Random random = new Random();
        //Generating random number :
        number = random.nextInt(1, 101);

        System.out.println(" Guessing the Number Game \n Guess any number in range of 1 to 100 ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int i = 0;
        while (i <= 5) {
            if (num == number) {
                System.out.println("Yehhh !! You won \uD83E\uDD29");
                break;
            }

            else if (num > number) {
                System.out.println("Guess smaller number :");
                num = in.nextInt();

            }
            else{
                System.out.println("Guess larger number :");
                num = in.nextInt();

            }
            i += 1;
        }
        if(num!=number)
        System.out.println( "OOPS !! You can't guess the number " + " " +  number  + " \uD83D\uDE41");


    }
    }



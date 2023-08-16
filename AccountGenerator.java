import java.util.Random;
import java.util.Scanner;

public class AccountGenerator
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        Random myGen = new Random();

        System.out.print("Enter your first name: ");
        String userFirstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String userLastName = sc.nextLine();


        userFirstName = userFirstName.toLowerCase();
        userLastName = userLastName.toLowerCase();
        
        char firstLetter = userFirstName.charAt(0);
        String firstFive = userLastName.substring(0,5);
        
        int myInt = myGen.nextInt(90) +10;

        String username = firstLetter + firstFive + myInt;
        System.out.println("Username: " + username);


    sc.close();
    }

}

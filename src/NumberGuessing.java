import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[]args) {

        Scanner keyboard;
        int userNumber;

        keyboard = new Scanner(System.in);


        int pickedNumber;

        pickedNumber = (int) (Math.random() * 100);


        System.out.println("The random number is");
        System.out.println(pickedNumber);

        System.out.println("Type a number from 1 to 100.");
        userNumber = keyboard.nextInt();

        if (userNumber < 1) {
            System.out.println("That number is not from 1 to 100.");
        }
        else if (userNumber > 100) {
            System.out.println("That number is not from 1 to 100.");
        }
        else if (userNumber > pickedNumber) {
            System.out.println("You picked a higher number.");
        }
        else if (userNumber < pickedNumber) {
            System.out.println("You picked a lower number.");
        }
        else if (userNumber == pickedNumber) {
            System.out.println("You guessed the correct number.");
        }











    }
}

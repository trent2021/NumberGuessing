import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        Scanner keyboard;
        int userNumber;

        keyboard = new Scanner(System.in);


        int pickedNumber;

        pickedNumber = (int) (Math.random() * 100);


        boolean answer = true;
        while (answer) {
            System.out.println("Type a number from 1 to 100.");
            userNumber = keyboard.nextInt();

            if (userNumber < pickedNumber) {
                System.out.println("You picked a lower number.");
            } else if (userNumber > pickedNumber) {
                System.out.println("You picked a higher number.");
            } else{
                System.out.println("You picked the correct number.");
                answer = false;
            }


        }
    }
}

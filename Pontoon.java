import java.util.Scanner;
public class Pontoon
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String choice;
        int card1;
        int card2;
        int new_card;
        int total;

        card1 = 1 + (int)(Math.random() * 9);//create a random number between 0-9 + 1
        System.out.println("first card: " + card1);

        card2 = 1 + (int)(Math.random() * 9);//create a random number between 0-9 + 1
        System.out.println("second card: " + card2);

        total = card1 + card2;//adds 2 initial cards together
        System.out.println("total: " + total);
        System.out.print("draw another card? (Y/N): ");//ask user to draw another card or not
        choice = keyboard.next();//stores user input to choice variable
        System.out.println("You chose: " + choice);

        while (choice.equalsIgnoreCase("Y"))//loops until choice = N
        {
            new_card = 1 + (int)(Math.random() * 9);//create a random number between 0-9 + 1
            System.out.println("new card: " + new_card);
            total = total + new_card;//adds new_card to existing total to get new total
            System.out.println("total: " + total);
            System.out.print("draw another card? (Y/N): ");//ask user to draw another card or not
            choice = keyboard.next();
            System.out.println("You chose: " + choice);
        }
        if (choice.equalsIgnoreCase("N"))//compares player score (total) to house score(18) and prints message
        {
            if (total > 18 && total < 22)
            {
                System.out.println("House has 18.");
                System.out.println("Player has " + total + ". You win.");
                keyboard.close();
            }
            if (total > 21 || total < 18)
            {
                System.out.println("House has 18.");
                System.out.println("Player has " + total + ". You lose.");
                keyboard.close();
            }
            if (total == 18)
            {
                System.out.println("House has 18.");
                System.out.println("Player has " + total + ". Draw.");
                keyboard.close();
            }
        }
    }
}

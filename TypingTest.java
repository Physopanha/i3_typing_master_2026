package i3_typing_master_2026;
import java.util.Scanner;

public class TypingTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String paragraph = "ffff jjjj dddd kkkk ssss llll aaaa ,,,; fdsa jkl; fdsa jkl; asdf jkl; asdf jkl; "
                + "sad dad had lad ask all fall hall flask shall gash hash flash glass glad flag sag hash lash. "
                + "Ask a glad lad all a salad.";

        System.out.println("------------ Typing Test Level 1 ------------");
        System.out.println("Type the following paragraph(s) to test your typing speed and quality");
        System.out.println("(press ENTER to end the test):\n");

        System.out.println(paragraph);
        System.out.println("\n------------------------------------------------------------");
        System.out.println("Start typing below:\n");

        sc.nextLine(); // clear buffer if needed
        sc.nextLine(); // user types and presses ENTER

        System.out.println("\nDone");

        sc.close();
    }
}

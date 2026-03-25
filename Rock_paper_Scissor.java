import java.util.Random;
import java.util.Scanner;

public class Rock_paper_Scissor {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int computer = random.nextInt(3) + 1;
        System.out.println();
        System.out.print("NUMBER ENTERED BY USER : ");
        int user = sc.nextInt();
        System.out.println("1: Rock  ---->  2: Scisscor  ---->  3:Paper ");
        if (computer == 1 && user == 1) {
            System.out.println("Match Draw");
        } else if (computer == 2 && user == 2) {
            System.out.println("Match Draw");
        } else if (computer == 3 && user == 3) {
            System.out.println("Match Draw");
        } else if (computer == 1 && user == 2) {
            System.out.println("Computer Win");
        } else if (computer == 1 && user == 3) {
            System.out.println("User Win");
        } else if (computer == 2 && user == 1) {
            System.out.println("User Win");
        } else if (computer == 2 && user == 3) {
            System.out.println("computer Win");
        } else if (computer == 3 && user == 1) {
            System.out.println("Computer Win");
        } else if (computer == 3 && user == 2) {
            System.out.println("User Win");
        } else {
            System.out.println("Invalid User Input");
        }
        System.out.println("NUMBER ENTERED BY COMPUTER is : " + computer);
        System.out.println("<---------THANKS FOR PLAYING---------->");
    }
}

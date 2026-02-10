import java.util.Scanner;

class Luckynum
 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Entered random Number between 1 to 10 =");
        int num= sc.nextInt();
        if (num == 7)
        {
            System.out.println("******** Congrats,You won the game ********");
        }
        if (num < 7)
        {
            System.out.println("####### Too Low try again ######");
        }
        if (num > 7)
        {
            System.out.println("$$$$$$$ Too High try again $$$$$$$");
        }
    }
}
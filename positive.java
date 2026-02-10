import java.util.Scanner;

class positive
 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("num =");
        int num= sc.nextInt();
        if (num > 0)
        {
            System.out.println("Num is positive");
        }
        if (num < 0)
        {
            System.out.println("Num is negative");
        }
        if (num==0)
        {
            System.out.println("Whole Num");
        }
    }
}

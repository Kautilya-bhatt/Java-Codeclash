import java.util.Scanner;

class divisible
 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Entered num to check divisible by 5 and 11=");
        int num = sc.nextInt();
        if ((num % 5 == 0) && (num % 11 == 0))
        {
            System.out.println("Yes,Number is divisible by 5 and 11");
        }
         if ((num % 5 != 0) && (num % 11 != 0))
        {
            System.out.println("No,Number is not divisible by 5 and 11");
        }
    }
}
        
import java.util.Scanner;

class oddeven
 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("a =");
        int a = sc.nextInt();

        if(a%2==0)
        {
            System.out.println("Entered num is even");
        }
        else
        {
            System.out.println("Entered num is odd");
        }
    }
}
import java.util.Scanner;

public class Automorphicnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    int sum=0;
    int my_num;
    int square=num*num;
    my_num=square%10;
    if(my_num==num)
    {
        System.out.println("Entered number is Automorphic number");
    }
    else
    {
        System.out.println("Entered number is not Automorphic number");
    }
    }
}

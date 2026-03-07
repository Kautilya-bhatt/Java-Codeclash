import java.util.Scanner;
public class Perfectnumber
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    int sum=0;
    for(int i=1;i<=num/2;i++)
    {
        if(num%i==0)
        {
            sum=sum+i;

        }
    }
    if(sum==num)
    {
        System.out.println("Entered number is Perfect Number");
    }
    else
    {
        System.out.println("Entered number is not Perfect Number");
    }
}
 }

    
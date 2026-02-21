import java.util.Scanner;
class Perfectsquare
{
    public static void main(String[] args) {
        int b=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        for(int i=1;i*i<=n;i++)
        {
            b=i*i;
        }
            if(b==n)
            {
                System.out.println("It is a perfect Square");
            }
             else
                {
                System.out.println("It is not a perfect Square");

            }
                
    }
}

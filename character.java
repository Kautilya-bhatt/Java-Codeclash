import java.util.Scanner;

class character
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any value : ");
         char a=sc.next().charAt(0);
        if(a >='A' && a <='Z' )
        {
            System.out.println("UPPERCASE LETTER");
        }
        else if(a >='a' && a <='z')
        {
            System.out.println("lowercase letter");
        }
        else if (a >='0' && a <='9' )
        {
            System.out.println("Digits");
        }
        else
        {
            System.out.println("Symbols");
        }

    }
}

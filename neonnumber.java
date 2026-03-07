import java.util.Scanner;
public class neonnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    int sum=0;
    int square=num*num;
    while(square>0)
    {
        int a=square%10;
        sum=sum+a;
        square=square/10;

    }
    if(num==sum)
    {
        System.out.println("Entered number is Neon");
    }  
    else
        {
        System.out.println("Entered number is not Neon");
        }  

}
    
}

import java.util.Scanner;

class multiple
 {
    public static void main(String[] args) {
       int result=0;

        Scanner sc= new Scanner(System.in);
        System.out.print("a =");
        int a = sc.nextInt();
         System.out.print("b =");
        int b = sc.nextInt();
        for (int i=1;i<=b;i++)
        {
         result = result+a;

        }
        System.out.println(result);
    }
}




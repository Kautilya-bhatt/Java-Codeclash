import java.util.Scanner;

class triangle
 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("a =");
        int a= sc.nextInt();
         System.out.print("a =");
        int b= sc.nextInt();
          System.out.print("a =");
        int c= sc.nextInt();
        if( a+b+c == 180)
        {
            System.out.println("Triangle is valid");
        }
        else
        {
            System.out.println("Triangle is not valid");
        }
    }
}



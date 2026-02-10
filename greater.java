import java.util.Scanner;

class greater
 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("a =");
        int a = sc.nextInt();
         System.out.print("b =");
        int b = sc.nextInt();
         System.out.print("c =");
        int c = sc.nextInt();
        if (a>b && a>c)
        {
            System.out.println("A is greater");
        }
            if (b>a && b>c)
        {
            System.out.println("B is greater");
        }
        if (c>a && c>b)
        {
            System.out.println("C is greater");
        }
    }
}

    
        
                  


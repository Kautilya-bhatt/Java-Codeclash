import java.util.Scanner;

class Grade
 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Entered number of student = ");
        int num= sc.nextInt();
        if (num >= 91 && num <=100)
        {
            System.out.println("Grade A");
        }
        if (num >= 81 && num <=90)
        {
            System.out.println("Grade B");
        }
        if (num >= 71 && num <=80)
        {
            System.out.println("Grade C");
        }
        if (num >= 61 && num <=70)
        {
            System.out.println("Grade D");
        }
        if (num >= 51 && num <=60)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}

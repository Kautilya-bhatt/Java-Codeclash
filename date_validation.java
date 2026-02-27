import java.util.Scanner;

public class date_validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Date : ");
        int dd = sc.nextInt();
         System.out.print("Enter a Month : ");
        int mm= sc.nextInt();
         System.out.print("Enter a Year : ");
        int yyyy= sc.nextInt();
            if(dd>=00 && dd<=31)
            {
                if(mm>=01 && mm<=12)
                {
                    if(yyyy>=2000 && yyyy<=2026)
                    {
                        System.out.println(("yes,date is correct: "+ dd+"/"+mm+"/"+yyyy));
                    }
                    System.exit(0);
                }
            }
        
         System.out.println("no,date is not correct");
            


    }
    
}

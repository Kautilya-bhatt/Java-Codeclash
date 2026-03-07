import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
           int first_num=0;
            int second_num=1;
            int third_num=0;
            int count = 1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.print( "fibonacci series = "+ first_num+","+ second_num+",");
        while(num>=first_num+second_num){

            third_num=first_num+second_num;
            System.out.print(third_num+",");
            first_num=second_num;
            second_num=third_num;
         
        }
    }
}

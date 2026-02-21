import java .util.*;

public class triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle A = ");
        int a = sc.nextInt();
        System.out.print("Enter angle B = ");
        int b = sc.nextInt();
        System.out.print("Enter angle C = ");
        int c = sc.nextInt();

        if(a+b+c == 180)
        {
            if (a == b && b== c) 
                {
                    System.out.println("Triangle is Equilateral");
                }
                    else if(a==b || b==c || c==a)
                    {
                        System.out.println("Triangle is Isoceles");

                    }
                    else{
                        System.out.println("Triangle is Scalene");
                    }
                
            }
            else{
                System.out.println("Not a valid Triangle");
            }
        }

        
    }


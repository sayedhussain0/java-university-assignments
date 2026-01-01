import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter side a,b,c and d =");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();
        double d= input.nextDouble();

        if (a==b && b==c && c==d){
            System.out.println("The shape is rehombus");
            System.out.println("Enter diagonals d1 and d2 =");
            double d1= input.nextDouble();
            double d2= input.nextDouble();
            double area= (d1*d2)/2;
            System.out.println("Shape Area ="+area);
        }
        else
            System.out.println("The shape isn't rehombus");
    }
}
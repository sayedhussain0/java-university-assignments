import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Input from the user
        System.out.println("Enter the first number X = ");
        double X=input.nextDouble();
        //Calculation
        double f= (22+(X*X))/4;
        //Output
        System.out.println("The value of f = "+f);
    }
}
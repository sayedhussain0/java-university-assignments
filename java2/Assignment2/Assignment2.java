import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer n:");
        int n = input.nextInt();
        while (n < 0) {
            System.out.println("Invalid data Renter a positive integer n:");
            n = input.nextInt();
        }
        int[] list = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();
        System.out.println();
        System.out.println("Enter an integer x:");
        int x = input.nextInt();
        System.out.print("The odd numbers smaller than 7 in the list are:");
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2==0 && list[i]<x)
                System.out.print(list[i] + " ");
        }
    }
}
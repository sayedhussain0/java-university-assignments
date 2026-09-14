import java.util.Scanner;
public class Quiz1 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] array = new int[10];
        int count=0;
        double sum=0.0 , avg;
        for (int i = 0; i < array.length; i++) {
            array[i] = kbd.nextInt();
            if (array[i] % 3 == 0) {
                count++;
                sum += array[i];
            }
        }
        if (count==0)
            System.out.println("no number divisible by 3 found in the list");
        else
            System.out.println("There are " +count+ " numbers divisible by 3.");
        System.out.println();
        System.out.print("Those are: " );
        for (int i = 0; i < array.length; i++)
            if (array[i] % 3 == 0)
                System.out.print(array[i]+" ");
        System.out.println();
        avg=sum/count;
        System.out.println("The average of them is : " +avg);
    }
}

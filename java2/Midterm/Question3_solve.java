import java.util.Scanner;
public class Question3_solve { 
    public static void main(String[ ] args) {
        Scanner kbd = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int size = kbd.nextInt();
        
    if (size % 2 != 0) {
        System.out.println("The number of elements must be even number");
        System.exit(0); //OR return;
    }
    
    int[] arr1 = new int[size];
    int[] arr2 = new int[size];
    
    System.out.println("Enter " + size + " integers for the first array:");
    for (int i = 0; i < arr1.length; i++) {
        arr1[i] = kbd.nextInt();
    }
   
    System.out.println("Enter " + size + " integers for the second array:");
    for (int i = 0; i < arr2.length; i++) {
        arr2[i] = kbd.nextInt();
    }
    
    System.out.println("Array1 Elements before swapping:");
    for (int i = 0; i < arr1.length; i++) {
        System.out.print(arr1[i] +" ");;
    }
    System.out.println();
    System.out.println("Array2 Elements before swapping:");
    for (int i = 0; i < arr2.length; i++)
    {
        System.out.print(arr2[i] +" ");;
    }
        int half = size / 2;
        
        for (int i = 0; i < half; i++)
        {
            int temp = arr2[i];
            arr2[i] = arr1[i+half];
            arr1[i+half] = temp;
        }

        
            System.out.println();
            System.out.println("Array1 Elements after swapping:");
            
            for (int i = 0; i < arr1.length; i++) 
            {
                System.out.print(arr1[i] +" ");;
            }
 
            System.out.println();
 
            System.out.println("Array2 Elements after swapping:");
 
            for (int i = 0; i < arr2.length; i++) 
            {
                System.out.print(arr2[i] +" ");;
            }
    }
}

import java.util.Scanner;
public class SalesManApp
{
    public static String LowestSales( SalesMan[] array )
    {
        int lowestIndex = 0;
        for ( int i = 1; i < array.length; i++ )
            if ( array[i].getSalesAmount() <
                    array[lowestIndex].getSalesAmount() ) lowestIndex = i;
        return array[lowestIndex].getFirstName() + " " + array[lowestIndex].getLastName();
    }
    public static void main (String [] args)
    {
        Scanner kbd = new Scanner (System.in);
        System.out.print("Enter the number of the Sales Man: ");
        int n = kbd.nextInt();
        SalesMan[] array = new SalesMan[n];
        for ( int i = 0; i < array.length; i++ )
        {
            System.out.println("Enter Data for Sales Man #" + (i+1) + ": ");
                    System.out.print("Enter First Name: ");
            String first = kbd.next();
            System.out.print("Enter Last Name: ");
            String last = kbd.next();
            System.out.print("Enter Sales Amount: ");
            double amount = kbd.nextDouble();
            array[i] = new SalesMan ( first, last, amount );
        }
        System.out.print("Enter a value d: ");
        double d = kbd.nextDouble();
        System.out.println("Names of Sales Man who have amount greater than the value d: ");
        for ( int i = 0; i < array.length; i++ )
            if ( array[i].getSalesAmount() > d )
                System.out.println( array[i].getFirstName() + " " +
                        array[i].getLastName() );
        System.out.println( "Name of salesman who has the lowest sales amount: " + LowestSales( array ) );
    } 
} 

import java.util.Scanner;
import java.io.*;
public class Quiz2{
    public static void main(String[] args) {
        try
        {
            Scanner input = new Scanner (new File("people.txt"));
            while(input.hasNextLine())
            {
                String line = input.nextLine();
                String [] array = line.split(",");
                String name = array[0];
                double weight = Double.parseDouble(array[1]);
                double height = Double.parseDouble(array[2]);
                double BMI = weight/(height*height);
                if(BMI < 18.5)
                {
                    System.out.println(name +" "+ " underweight");
                }
                else if(BMI >= 18.5 && BMI <= 24.9)
                {
                    System.out.println(name +" "+ " normal");
                }
                else if(BMI >= 25.0 && BMI <= 29.9)
                {
                    System.out.println(name +" "+ " overweight");
                }
                else if(BMI >= 30.0)
                {
                    System.out.println(name +" "+ " Very overweight");
                }
            }
            input.close();
        }
        catch(IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
}

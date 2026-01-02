import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String name, nameMax="";
        int count=0, ahmedCount=0, GPACount=0;
        double GPAmax=0, GPA;

        System.out.println("Enter students GPA: ");
        name= input.next();
        while (!name.equalsIgnoreCase("stop")){
            GPA= input.nextDouble();
            count++;

            if (name.equalsIgnoreCase("Ahmed")){
                ahmedCount++;
            }

            if (GPA>3.00){
                GPACount++;
            }

            if (count==1 || GPA>GPAmax){
                GPAmax=GPA;
                nameMax=name;
            }
                name= input.next();
        }

        System.out.println("Number of students with name AHMED = "+ahmedCount);
        System.out.println("Number of students with GPA above 3.0 ="+GPACount);
        System.out.println("The maximum GPA is"+nameMax);

    }
}
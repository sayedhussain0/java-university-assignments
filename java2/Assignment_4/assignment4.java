import java.util.Scanner;
import java.io.*;
public class assignment4{
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(new File("patient.txt"));
            int count=0, normalC=0, highC=0, lowC=0;
            while(input.hasNextLine()){
                count++;
                String line = input.nextLine();
                String[] arr = line.split(" ");
                String Fname = arr[0];
                String Lname = arr[1];
                int age = Integer.parseInt(arr[2]);
                double rate = Double.parseDouble(arr[3]);
                if(rate<140 && rate>70){
                    System.out.println(Fname +" "+ Lname+" "+age+" "+rate+" Normal");normalC++;
                }
                else if(rate>=140){
                    System.out.println(Fname +" "+ Lname+" "+age+" "+rate+" High");highC++;
                }
                else if(rate<=70){
                    System.out.println(Fname +" "+ Lname+" "+age+" "+rate+" Low");lowC++;
                }
            }
            System.out.println("The number of patients with normal bloodsugar is "+normalC);
                    System.out.println("The number of patients with high bloodsugar is "+highC);
                            System.out.println("The number of patients with low blood sugaris "+lowC);
                                    System.out.println("The total number of patients is "+count);
            input.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File NOT found");
            System.exit(0);
        }
    }
}

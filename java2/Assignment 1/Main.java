import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        App A1 = new App();
        A1.setApp("Google map" ,5 , 600);
        App A2 = new App();
        A2.setApp("Talabat" ,4 , 300);
        App A3 = new App();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name :");
        String n= input.next();
        System.out.println("Enter rete :");
        double r= input.nextDouble();
        System.out.println("Enter downloads :");
        int d= input.nextInt();
        A3.setApp(n,r,d);
        if (A1.isTopApp()) {
            System.out.println("Name of A1" +A1.getName());
        }
        if (A2.isTopApp()) {
            System.out.println("Name of A2" +A2.getName());
        }
        if (A3.isTopApp()) {
            System.out.println("Name of A3" +A3.getName());
        }
    }
}
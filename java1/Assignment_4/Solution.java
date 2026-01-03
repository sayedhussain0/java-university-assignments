import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        RoomCarpet carpet=new RoomCarpet();
        carpet.setName("Carpet1");
        carpet.setLength(3);
        carpet.setWidth(4);
        carpet.setCost(100);
        carpet.printAll();

    }
}
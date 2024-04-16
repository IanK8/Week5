import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        int temp1;
        int temp2;
        int temp3;
        int temp4;
        int temp5;
        float total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the high temperature on day 1: ");
        temp1 = input.nextInt();
        System.out.print("Enter the high temperature on day 2: ");
        temp2 = input.nextInt();
        System.out.print("Enter the high temperature on day 3: ");
        temp3 = input.nextInt();
        System.out.print("Enter the high temperature on day 4: ");
        temp4 = input.nextInt();
        System.out.print("Enter the high temperature on day 5: ");
        temp5 = input.nextInt();
        total = ((temp1 + temp2 + temp3 + temp4 + temp5) / 5);
        System.out.println("The average high temperature is: " + total);
    }
}

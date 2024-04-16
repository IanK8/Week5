import java.util.Scanner;

public class Award {
    public static void main(String[] args) {
        int awards;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  the number of activity participation awards: ");
        awards = input.nextInt();
        if (awards >= 14){
            System.out.println("You got a gold medal");
        }else if (awards >= 10){
            System.out.println("You got a silver medal");
        }else if (awards >= 5){
            System.out.println("You got a bronze medal");
        }else{
            System.out.println("You did NOT qualify for an overall participation medal.");
        }
    }
}

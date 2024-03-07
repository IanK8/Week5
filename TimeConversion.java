import java.util.Scanner;

<<<<<<< HEAD
public class  TimeConversion{
    public static void main (String[] args){
        int time;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time in minutes: ");
        time = input.nextInt();
        time = time % 
=======
public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time in minutes: ");
        int totalMinutes = scanner.nextInt();

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println("The time is: " + hours + ":" + (minutes < 10 / "0" + minutes : minutes));
>>>>>>> 96b835f372faf82c3a547168c04509591e9fd746
    }
}


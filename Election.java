import java.text.NumberFormat;
import java.util.*;
public class  Election{
    public static void main (String[] args){
        String canidate1;
        String canidate2;
        Scanner input = new Scanner(System.in);
        System.out.print("Canidate 1: ");
        canidate1 = input.next();
        System.out.print("Canidate 2: ");
        canidate2 = input.next();
        
        int nyVotes1;
        int nyVotes2;
        System.out.print("New York votes for " + canidate1 + ": ");
        nyVotes1 = input.nextInt();
        System.out.print("New York votes for " + canidate2 + ": ");
        nyVotes2 = input.nextInt();
        
        int njVotes1;
        int njVotes2;
        System.out.print("New Jersey votes for " + canidate1 + ": ");
        njVotes1 = input.nextInt();
        System.out.print("New Jersey votes for " + canidate2 + ": ");
        njVotes2 = input.nextInt();

        int ctVotes1;
        int ctVotes2;
        System.out.print("Connecticut votes for " + canidate1 + ": ");
        ctVotes1 = input.nextInt();
        System.out.print("Connecticut votes for " + canidate2 + ": ");
        ctVotes2 = input.nextInt();

        NumberFormat percent = NumberFormat.getPercentInstance();
        int totalVotes1 = nyVotes1 + njVotes1 + ctVotes1;
        int totalVotes2 = nyVotes2 + njVotes2 + ctVotes2;
        int total = totalVotes1 + totalVotes2;
        double percentVotes1 = (double)totalVotes1 / total;
        double percentVotes2 = (double)totalVotes2 / total;

        System.out.println("\n \t \t" + canidate1 + "\t" + canidate2);
        System.out.println("New York\t" + nyVotes1 + "\t" + nyVotes2);
        System.out.println("New Jersey\t" + njVotes1 + "\t" + njVotes2);
        System.out.println("Connecticut\t" + ctVotes1 + "\t" + ctVotes2);
        
        System.out.println("\n\n\n\n");
        System.out.println("Canidate\tVotes\tPercentage");
        System.out.println(canidate1 + "\t\t" + totalVotes1 + "\t" + percentVotes1 +"%");
        System.out.println(canidate2 + "\t\t" + totalVotes2 + "\t" + percentVotes2 + "%");
        System.out.println("TOTAL VOTES:\t" + total);


    }
}
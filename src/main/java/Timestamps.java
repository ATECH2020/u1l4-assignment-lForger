import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        int firstTimestamp = 0;
        firstTimestamp = hours1 *60*60;
        firstTimestamp = firstTimestamp + minutes1 *60;
        firstTimestamp = firstTimestamp + seconds1;

        int secondTimestamp = 0;
        secondTimestamp = hours2 *60*60;
        secondTimestamp = secondTimestamp + minutes2 *60;
        secondTimestamp = secondTimestamp + seconds2;

        int deltaSeconds = secondTimestamp - firstTimestamp;

        if(deltaSeconds > 0)
        {
          System.out.print(deltaSeconds);
        }else
        {
          System.out.print("you have gone back in time.");
        }
        

        // closing the scanner object
        scanner.close();
    }
}
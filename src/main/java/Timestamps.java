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


        int tempSeconds = 0;
        tempSeconds = hours1 *60*60;
        tempSeconds = tempSeconds + minutes1 *60;
        tempSeconds = tempSeconds + seconds1;

        int tempSeconds2 = 0;
        tempSeconds2 = hours2 *60*60;
        tempSeconds2 = tempSeconds2 + minutes2 *60;
        tempSeconds2 = tempSeconds2 + seconds2;

        int finalSeconds = tempSeconds2 - tempSeconds;

        if(tempSeconds > 0)
        {
          System.out.println(finalSeconds);
        }else
        {
          System.out.println("you have gone back in time.");
        }
        

        // closing the scanner object
        scanner.close();
    }
}
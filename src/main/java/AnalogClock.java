import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int angle = scanner.nextInt();

        int currentHourDegree = angle % 12;
        System.out.print(currentHourDegree);
        int currentMinuteDegre = currentHourDegree * 12;
        System.out.print(currentMinuteDegre);  
        // closing the scanner object
        scanner.close();
    }
}
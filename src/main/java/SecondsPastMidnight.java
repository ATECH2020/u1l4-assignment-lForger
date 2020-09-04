import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int number = scanner.nextInt();

        int minutes = number / 60;
        int hours = minutes / 60;
        System.out.println(hours + " " + minutes);

        // closing the scanner object
        scanner.close();
    }
}
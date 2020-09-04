import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int studentDesk1 = scanner.nextInt();
        int studentDesk2 = scanner.nextInt();
        int studentDesk3 = scanner.nextInt();

        if (studentDesk1 % 2 != 0)
        {
          studentDesk1 = studentDesk1 + 1;
        }
        if (studentDesk2 % 2 != 0)
        {
          studentDesk2 = studentDesk2 + 1;
        }
        if (studentDesk3 % 2 != 0)
        {
          studentDesk3 = studentDesk3 + 1;
        }
        studentDesk1 = studentDesk1 / 2;
        studentDesk2 = studentDesk2 / 2;
        studentDesk3 = studentDesk3 / 2;
        System.out.print(studentDesk1 + studentDesk2 + studentDesk3);
        // closing the scanner object
        scanner.close();
    }
}
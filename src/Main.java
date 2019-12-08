import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = new String();
        int number = 0;

        System.out.println("What task do you want to run (1, 2 or 3) ? ");
        choice();
    }

        public static void choice () {
            int number;
            number = numberInput();
            if (number == 1) {
                Task1();
            }
            if (number == 2) {
                Task2();
            }
            if (number == 3) {
                Task3();
            } else {
                System.out.println("Please, try again (possible variants: 1, 2 or 3) : ");
                choice();
            }

    }

    public static void Task1 () {
        System.out.println("Как я провел лето");
        System.out.println("\nЛето было жарким\n\tЛето было очень жарким\n\t\tНо в принципе все было хорошо");
        System.out.println();
    }

    public static void Task2 () {

    }

    public static void Task3 () {

    }

    public static String stringInput () {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        return name;
    }


    public static int numberInput () {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        return number;
    }

}

//  Домашняя работа  задание 1, 2 and 3



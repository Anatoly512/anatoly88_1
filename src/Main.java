import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как я провел лето");
        System.out.println("\nЛето было жарким\n\tЛето было очень жарким\n\t\tНо в принципе все было хорошо");
        System.out.println();

        String name = new String();
        int number = 0;

        System.out.println("What is your name? ");
        name = stringInput();
        if (name.equals("A"))  {
            System.out.println("Hello, " + name);
        } else{
            System.out.println("else " + name);
        }

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

//  Домашняя работа  задание 1



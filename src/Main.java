import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как я провел лето");
        System.out.println("\nЛето было жарким\n\tЛето было очень жарким\n\t\tНо в принципе все было хорошо");
        System.out.println();

        String name = new String();
        stringInput();


    }

    public static void stringInput () {

            Scanner input = new Scanner(System.in);
            System.out.println("What is your name? ");
            String name = input.next();
            if (name == "A")  {
                System.out.println("Hello, " + name);
            } else{
            System.out.println("else " + name);
        }
    }

}

//  Домашняя работа  задание 1



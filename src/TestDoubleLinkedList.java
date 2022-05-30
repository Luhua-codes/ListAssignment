import java.util.Scanner;

public class TestDoubleLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        int menuSelect = 0;
        String[] options = {
                "Check if list is empty", //1
                "Insert element at front of list", //2
                "Insert element at back of list", //3
                "Print list", //4
                "Print list in reverse order", //5
                "Peek at first element of list", //6
                "Delete first element of list", //7
                "Delete last element of list", //8
                "Delete specific element", //9
                "Exit" //10
        };

        do {
            printMenu(options);
            try {
                menuSelect = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid selection. Please enter an integer.");
            }

            switch (menuSelect) {
                case 1 -> testIsEmpty(dll);
                case 2 -> dll.insertFront(getName(sc), getAge(sc));
                case 3 -> dll.insertBack(getName(sc), getAge(sc));
                case 4 -> dll.display();
                case 5 -> dll.displayReversal();
                case 6 -> dll.peek();
                case 7 -> dll.removeFront();
                case 8 -> dll.removeLast();
                case 9 -> dll.deleteLink(getName(sc));
                case 10 -> {
                    sc.close();
                    run = false;
                }
                default -> System.out.println("Invalid selection. Please choose from the list of options.");
            }
            menuSelect = 0;
            System.out.println();
        } while (run);
    }

    private static void printMenu(String[] options) {
        for (int i = 0; i < options.length; i++)
            System.out.printf("%d) %s%n", i + 1, options[i]);
        System.out.print("Select an option: ");
    }

    private static void testIsEmpty(DoubleLinkedList dll) {
        if (dll.isEmpty())
            System.out.println("The list is empty.");
        else
            System.out.println("The list is not empty.");
    }

    private static String getName(Scanner sc) {
        String name;
        System.out.print("Enter a name: ");
        name = sc.nextLine();
        return name;
    }

    private static int getAge(Scanner sc) {
        int age;
        do {
            try {
                System.out.print("Enter an age: ");
                age = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (true);
        return age;
    }
}

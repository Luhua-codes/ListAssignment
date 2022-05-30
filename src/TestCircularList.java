import java.util.*;

public class TestCircularList {
    public static void main(String[] args) {
        CircularList cl = new CircularList();
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        int menuSelect = 0;

        do{
            System.out.println("1) Check if list is empty\n2) Add an element\n3) Print list\n4) Exit");
            System.out.print("Select an option: ");
            try {
                menuSelect = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException nfe){
                System.out.println("Invalid selection. Please enter an integer.");
            }

            switch (menuSelect) {
                case 1 -> testIsEmpty(cl);
                case 2 -> testAddToList(cl, sc);
                case 3 -> cl.dislay();
                case 4 -> {
                    sc.close();
                    run = false;
                }
            }
            System.out.println();
            menuSelect = 0;
        }while(run);
    }

    private static void testIsEmpty(CircularList cl){
        if(cl.isEmpty())
            System.out.println("The list is empty.");
        else
            System.out.println("The list is not empty.");
    }

    private static void testAddToList(CircularList cl, Scanner sc){
        String name;
        int age;
        do {
            try {
                System.out.print("Enter a name: ");
                name = sc.nextLine();
                System.out.print("Enter an age: ");
                age = Integer.parseInt(sc.nextLine());
                cl.addToList(name, age);
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input. Please try again.");
            }
        }while(true);
    }
}

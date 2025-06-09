package sdAddon;
import java.util.Scanner;
public class RecursiveArrayManipulation {
	static int[] array = new int[10]; 
    static int size = 0; 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu(scanner);
    }

    public static void showMenu(Scanner scanner) {
        System.out.println("\n-- Array Manipulation Menu --");
        System.out.println("1. Add an element");
        System.out.println("2. Remove an element");
        System.out.println("3. Display the array");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                addElement(scanner);
                break;
            case 2:
                removeElement(scanner);
                break;
            case 3:
                displayArray();
                break;
            case 4:
                System.out.println("Exiting program...");
                return;
            default:
                System.out.println("Invalid choice! Please try again.");
                break;
        }
        
        showMenu(scanner);
    }
    
   
    public static void addElement(Scanner scanner) {
        if (size < array.length) {
            System.out.print("Enter element to add: ");
            int element = scanner.nextInt();
            array[size] = element;
            size++;
            System.out.println("Element added successfully!");
        } else {
            System.out.println("Array is full. Cannot add more elements.");
        }
    }

    public static void removeElement(Scanner scanner) {
        if (size > 0) {
            System.out.print("Enter index to remove element (0 to " + (size - 1) + "): ");
            int index = scanner.nextInt();
            if (index >= 0 && index < size) {

                for (int i = index; i < size - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[size - 1] = 0; // Clear last element
                size--;
                System.out.println("Element removed successfully!");
            } else {
                System.out.println("Invalid index. Please try again.");
            }
        } else {
            System.out.println("Array is empty. Nothing to remove.");
        }
    }
    public static void displayArray() {
        if (size == 0) {
            System.out.println("Array is empty.");
        } else {
            System.out.print("Array elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}


import java.io.InputStream;
import java.util.Scanner;

public class Circulararray {
    int[] arr;
    int size;
    int front = -1, rear = -1;

    // Constructor
    Circulararray(int size) {
        this.size = size;
        arr = new int[size];
    }

    // Check if array is full
    boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }

    // Check if array is empty
    boolean isEmpty() {
        return front == -1;
    }

    // Check duplicate element
    boolean isDuplicate(int value) {
        if (isEmpty()) return false;

        int i = front;
        while (true) {
            if (arr[i] == value)
                return true;

            if (i == rear)
                break;

            i = (i + 1) % size;
        }
        return false;
    }

    // Add element
    void add(int value) {
        if (isFull()) {
            System.out.println("Array is full");
            return;
        }

        if (isDuplicate(value)) {
            System.out.println("Duplicate element not allowed");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % size;
        arr[rear] = value;
        System.out.println("Element added");
    }

    // Remove element
    void remove() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }

        System.out.println("Removed element: " + arr[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    // Display elements
    void display() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }

        System.out.print("Elements: ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    // Search element
    void search(int value) {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }

        int i = front;
        while (true) {
            if (arr[i] == value) {
                System.out.println("Element found");
                return;
            }
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println("Element not found");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        Circulararray ca = new Circulararray(size);

        while (true) {
            System.out.println("\n1.Add  2.Remove  3.Display  4.Search");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    ca.add(sc.nextInt());
                    break;

                case 2:
                    ca.remove();
                    break;

                case 3:
                    ca.display();
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    ca.search(sc.nextInt());
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}









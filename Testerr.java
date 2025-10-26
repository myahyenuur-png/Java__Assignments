public class Testerr {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

//        System.out.println("=== Stack Operations Test ===");

        // Test push and display
        System.out.println("\n1. Pushing elements:");
        stack.push("Java");
        stack.push("Html");
        stack.push("DSA");
        stack.display();

        // Test peek and size
        System.out.println("\n2. Peek and size:");
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        // Test automatic expansion
        System.out.println("\n3. Testing automatic expansion:");
        stack.push("WEB DESIGN");
        stack.push("C#");
        stack.display();

        // Test pop
        System.out.println("\n4. Popping elements:");
        System.out.println("Popped: " + stack.pop());
        stack.display();

        // Test isEmpty
        System.out.println("\n5. Testing isEmpty:");
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Pop all elements
        System.out.println("\n6. Popping all elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // Final check
        stack.display();
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
    }
}


import java.util.*;

class nested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        // Ask for the number of lists
        System.out.print("Enter the number of lists: ");
        int numLists = scanner.nextInt();
        
        // Loop for each list
        for (int i = 0; i < numLists; i++) {
            // Create a new list for each set of elements
            ArrayList<Integer> list1 = new ArrayList<>();
            
            // Ask for the number of elements in the current list
            System.out.print("Enter the number of elements in list " + (i + 1) + ": ");
            int numElements = scanner.nextInt();
            
            // Loop for each element
            System.out.println("Enter the elements for list " + (i + 1) + ": ");
            for (int j = 0; j < numElements; j++) {
                int element = scanner.nextInt();
                list1.add(element);
            }
            
            // Add the list to the main list
            list.add(new ArrayList<>(list1));
        }
        
        // Close the scanner
        scanner.close();
        
        // Print the contents of the outer list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List " + (i + 1) + ": " + list.get(i));
        }
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortingAndSearchingHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store state-capital pairs
        // No need to implement your own binary search tree.
        // // You can utilize the TreeMap class provided by Java, which internally implements a binary search tree
        Map<String, String> stateCapitalMap = new HashMap<>();
        // two-dimensional string array with states and their capitals in alphabetical order by state
        String[][] stateAndCapital = StatesAndCapitals.STATE_AND_CAPITAL;

        // Loop to convert the 2D array into a HashMap
        for (String[] strings : stateAndCapital) {
            stateCapitalMap.put(strings[0], strings[1]);
        }

        // Display the content of the Map
        System.out.println("Capital and State of HashMap:\n");
        displayMap(stateCapitalMap);

        // Sort the map using TreeMap (sorted by keys in natural order) while using a binary search tree (built in to TreeMap) for storage
        Map<String, String> sortedMap = new TreeMap<>(stateCapitalMap);

        System.out.println("Capital and State of TreeMap:\n");
        displayMap(sortedMap);
        // Prompt the user
        promptUser(sortedMap);
    }

    // Method to display the content of a Map
    public static void displayMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    // Method to quiz the user
    public static void promptUser(Map<String, String> stateAndCapitalMap) {
        // Prompt the user to enter a state and display its capital
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a state to display its capital (do not abbreviate).");
        System.out.println("Type 'exit' to quit: ");
        String state = scanner.nextLine().trim();

        while (!state.equalsIgnoreCase("exit")) {
            // Capitalize the first letter of the user input
            state = state.substring(0, 1).toUpperCase() + state.substring(1).toLowerCase();
            String capital = stateAndCapitalMap.get(state);

            if (capital != null) {
                System.out.println("The capital of " + state + " is " + capital + ".");
            } else {
                System.out.println("State not found.");
            }

            System.out.println("Enter a state to display its capital (type 'exit' to quit): ");
            state = scanner.nextLine().trim();
        }

        System.out.println("Exiting the program...");
    }
}

import java.util.Scanner;

public class SortingArrays {
    public static void main(String[] args) {
        // two-dimensional string array with states and their capitals in alphabetical order by state
        String[][] stateAndCapital = StatesAndCapitals.STATE_AND_CAPITAL;

        // Display current contents of the array
        System.out.println("The states and their capitals are:");
        displayStateAndCapital(stateAndCapital);

        // Use a bubble sort to sort the array's content by capital
        bubbleSortByCapital(stateAndCapital);

        // Quiz the user
        int correctCount = quizUser(stateAndCapital);

        // Display total correct count
        System.out.println("\nTotal correct count: " + correctCount);
    }

    // Method to display state and capital
    public static void displayStateAndCapital(String[][] array) {
        for (String[] stateCapitalPair : array) {
            System.out.println(stateCapitalPair[0] + " - " + stateCapitalPair[1]);
        }
    }

    // Method to quiz the user
    public static int quizUser(String[][] stateAndCapital) {
        Scanner input = new Scanner(System.in);
        int correctCount = 0;

        for (String[] strings : stateAndCapital) {
            System.out.print("What is the capital of " + strings[0] + "? (type 'exit' to quit)\n");
            String userAnswer = input.nextLine();
            // Check if the user wants to exit
            if (userAnswer.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                return correctCount;
            }

            if (userAnswer.equalsIgnoreCase(strings[1])) {
                System.out.println("Your answer is correct!");
                correctCount++;
            } else {
                System.out.println("Wrong - The correct answer is " + strings[1]);
            }
        }

        return correctCount;
    }

    // Method to sort the array by capital using bubble sort
    public static void bubbleSortByCapital(String[][] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // array[j][1] represents the capital of the j-th state.
                // array[j + 1][1] represents the capital of the next (j + 1)-th state.
                String curr = array[j][1], next = array[j + 1][1];
                // Compare capitals ignoring case
                if (curr.compareToIgnoreCase(next) > 0) {
                    // Swap elements if they are in the wrong order
                    String[] temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

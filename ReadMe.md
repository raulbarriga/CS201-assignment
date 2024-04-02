# Overview
Assignment files are located under the `src` folder:
```
/src
SortingAndSearchingHashMap.java
SortingArrays.java
StatesAndCapitals.java
```
- `SortingArrays.java` contains the "Part 1: Sorting Arrays" of the assignment.
- `SortingAndSearchingHashMap.java` contains the "Part 2: Sorting & Searching HashMap" of the assignment.
- `StatesAndCapitals.java` is a 2-D array for all the states and their respective capital.


## Part 1: Sorting Arrays
I instantiate the 2-D array from its separate file in:

`String[][] stateAndCapital = StatesAndCapitals.STATE_AND_CAPITAL;`

The `displayStateAndCapital`method uses an enhanced for loop to print the 2-D array. I pass it the `stateAndCapital` 2-D array.

The `bubbleSortByCapital` method uses a bubble sort to sort the array's content by capital.

### How The `bubbleSortByCapital`Method Works
I pass it the `stateAndCapital` 2-D array. Inside this method, I use a double for-loop to loop through the 2-D array.

Inside the inner loop, it compares the capitals of adjacent state-capital pairs. It extracts the capitals of the current pair `array[j][1]` and the next pair `array[j + 1][1]` and stores them in curr and next variables, respectively. If the capital of the current pair comes after the capital of the next pair alphabetically (ignoring case), it means they are in the wrong order.

If the capitals are in the wrong order, it swaps the entire state-capital pairs: It creates a temporary array `temp` to hold the current state-capital pair. It assigns the next state-capital pair to the current position `array[j]`.  It assigns the temporary array `temp` to the next position `array[j + 1]`. The inner loop continues until all pairs are compared and sorted.

After the inner loop completes, the outer loop increments `i`, and the process repeats until the array is completely sorted.

### How The `quizUser`Method Works
It takes a 2-D array `stateAndCapital` as input.

It initializes a `Scanner` object `input` to read user input, and a variable `correctCount` to keep track of the number of correct answers.

It loops through each row in the `stateAndCapital` array using an enhanced for loop.

Inside the loop, it prompts the user with the question "What is the capital of <state>?" and waits for the user's input. The <state> placeholder is replaced with the state name from the current row.

If the user enters "exit", the program exits, printing a message and returning the `correctCount`.

If the user's input matches the capital stored in the current row (ignoring case), it prints "Your answer is correct!" and increments the `correctCount`.

If the user's input does not match the capital, it prints "Wrong - The correct answer is <capital>", where <capital> is replaced with the correct capital from the current row.

The loop continues until all state-capital pairs have been quizzed.

Finally, it returns the `correctCount`, which represents the number of correct answers given by the user.


In the `main` method, the program will print the correct count in the end:
```
int correctCount = quizUser(stateAndCapital);
System.out.println("\nTotal correct count: " + correctCount);
```
## Part 2: Sorting & Searching HashMap


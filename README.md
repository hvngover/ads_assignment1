# Task 1

**Description**: *The code defines a Java program that reads user input to create an integer array, then uses a function to find and print the minimum element of the array.*

**Explanation**: *The findMin function finds the minimum value in the array by comparing each element to the current minimum value and updating the minimum if a smaller value is found. Finally, the function returns the minimum value found in the array.*

# Task 2

**Description**:*This code reads an integer value n and an array of n integers from the user, calculates the average of the array using the calculateAverage() function, and prints it to the console.*

**Explanation**:*The calculateAverage() function calculates the average of the elements in the array by first summing them up and then dividing the sum by n*

# Task 3

**Description**: *This program reads an integer input from the user, checks whether it is a prime or composite number, and prints the result to standard output.*

**Explanation**: *The code takes an integer input from the user, checks if it is prime or composite, and prints the result to the console. If the input is even, it is considered composite, otherwise, the code checks if it is divisible by any odd number greater than 1, and if not, it is considered prime.*

# Task 4

**Description**: *This program reads an integer input from the user, computes its factorial using a recursive method, and prints the result to standard output.*

**Explanation**: *Сalls the recursive factorial method, assigns the result to a variable, and prints it. The factorial method checks if the input is 0 and returns 1, else it calls itself with (n - 1) and multiplies the result by n.*

# Task 5

**Description**: *The Java code uses recursion to compute the n-th element in the Fibonacci sequence. The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding numbers, starting with 0 and 1.*

**Explanation**: *The fibonacciRecursive function is defined to take an integer n as input and return the n-th element in the Fibonacci sequence. The function first checks if n is 0 or 1; if so, it returns the corresponding value (0 or 1). Otherwise, the function calls itself recursively with n-1 and n-2 as inputs, and returns the sum of the two results.*

# Task 6

**Description**: *Program reads two integer inputs from the user, a base number 'a' and a power 'n', calculates 'a' raised to the power 'n' using a recursive function*

**Explanation**: *The power method is a recursive function that takes two integer arguments, 'a' and 'n', and computes 'a' raised to the power of 'n'. It does this by using an if-else statement to check if 'n' is equal to 0. If 'n' is 0, the method returns 1, which is the base case. If 'n' is not 0, the method calls itself recursively with ('a' and 'n-1') as the arguments and multiplies the result by 'a' to get the power of 'a' raised to the power of 'n'.*

# Task 7

**Description**: *This program reads an integer n and an array of n integers from the user, then uses a recursive function to print the array in reverse order.*

**Explanation**: *The method uses recursion to print the last element of the array, then calls itself with the rest of the array (n-1 elements) as arguments, until it reaches the base case where n is 0. The main method reads the size and elements of the array from the user, then calls the reverseArray method with the array and its size as arguments to print the elements of the array in reverse order.*

# Task 8

**Description**: *This Java program checks whether a given string consists of only digits. The program uses the Scanner class to read input from the user, and the String class to manipulate the input string. The program has two functions: check and main.*

**Explanation**: *The check function takes a string as input and returns true if the string consists of only digits (0-9), and false otherwise. It uses the matches method of the String class with the regular expression \d+ to check if the string matches one or more digits. If the string matches the regular expression, the function returns true, indicating that the string consists of only digits. Otherwise, it returns false.*

# Task 9

**Description**: *This program reads two integer inputs from the user, then uses a recursive function called FindBinomialCoefficient to calculate the binomial coefficient of n and k. The result is then printed to the console.*

**Explanation**: *The function uses recursion to calculate the binomial coefficient using the formula n choose k = (n-1) choose (k-1) + (n-1) choose k. If k is equal to 0 or n is equal to k, the function returns 1, which is the base case of the recursion.*

# Task 10

**Description**: *The program takes two integers as input from the user and finds the greatest common divisor (GCD) of the two numbers using the Euclidean algorithm*

**Explanation**: *The "FindGCD" function takes two integer inputs and returns their greatest common divisor (GCD). It checks if "a" and "b" are equal, and if either of them is 1 or 0, returning 1 or 0 respectively. It then initializes a variable "c" to the smaller of "a" and "b", and uses a loop to calculate the GCD by repeatedly setting "c" to the remainder of "a" divided by "b". The "main" function takes two integer inputs from the user and outputs the GCD by calling the "FindGCD" function.*

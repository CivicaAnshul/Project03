package PracticePrograms;

public class SwapbyORxorOperator {
	 // Function to swap values of two numbers
    // using XOR operator
    static void swapValuesUsingXOROperator(int m, int n)
    {
        // Logic of XOR operator
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
 
        System.out.println("Value of m is " + m
                           + " and Value of n is " + n);
    }
    // Main driver method
	public static void main(String[] args) {
		// Random two integer numbers
        // to get swapped
        int m = 9, n = 5;
 
        // Calling the function in main method
        // to get above integer numbers swapped
        swapValuesUsingXOROperator(m, n);
    }
}


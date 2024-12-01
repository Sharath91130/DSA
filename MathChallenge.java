public class MathChallenge {
    public static int solve(String str) {
        // Split the equation into parts
        String[] parts = str.split(" ");

        // Find the index of the part containing 'x'
        int xIndex = 0;
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].contains("x")) {
                xIndex = i;
                break;
            }
        }

        // Extract the number with 'x' and the other two numbers
        String varOcg = parts[xIndex].replace("x", ""); // __define-ocg__
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);
        char operator = parts[1].charAt(0);
        int result = Integer.parseInt(parts[4]);

        // Calculate the missing digit based on the operator
        int missingDigit;
        switch (operator) {
            case '+':
                missingDigit = result - num1 - num2;
                break;
            case '-':
                missingDigit = num1 - num2 - result;
                break;
            case '*':
                missingDigit = result / (num1 * num2);
                break;
            case '/':
                missingDigit = (num1 / num2) * result;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }

        // Return the missing digit
        return missingDigit;
    }

    public static void main(String[] args) {
        System.out.println(solve("3x + 12 = 46"));  // Output: 4
        System.out.println(solve("4 - 2 = x"));     // Output: 2
        System.out.println(solve("1x0 * 12 = 1200")); // Output: 0
    }
}
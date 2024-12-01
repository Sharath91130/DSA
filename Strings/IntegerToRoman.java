package Strings;

public class IntegerToRoman {
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public IntegerToRoman() {
    }

    public static String intToRoman(int num) {
        // Arrays to store the Roman numerals and their corresponding integer values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10,  5,  1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",  "V",  "I"};
        
        // StringBuilder to build the Roman numeral string
        StringBuilder roman = new StringBuilder();
        
        // Iterate through each value
        for (int i = 0; i < values.length; i++) {
            // Append the corresponding Roman numeral symbols while subtracting the value from the number
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }
        
        return roman.toString();


    }

    public static void main(String[] args) {
        // Example usage
        int num = 3549;
        String result = intToRoman(9);
        System.out.println("The Roman numeral of " + num + " is " + result);
    }
}

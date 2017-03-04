public class Main {
//        1-An empty string returns zero
//        2-A single number returns the value
//        3-Two numbers, comma delimited, returns the sum
//        4-Two numbers, newline delimited, returns the sum
//        5-Three numbers, delimited either way, returns the sum
//        6-Negative numbers throw an exception
//        7-Numbers greater than 1000 are ignored
    public static void main(String[] args) {


    }


    private boolean isEmpty(String input) {
        return input.isEmpty();
    }
    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }

   
    public int stringCalculator (String input) {
        String[] numbers = input.split(",");
        if (isEmpty(input)) {
            return 0;
        }
        if (input.length() == 1){
            return stringToInt(input);
        } else {
            return Integer.parseInt(numbers[0] + Integer.parseInt(numbers[1]));
        }

    }


}

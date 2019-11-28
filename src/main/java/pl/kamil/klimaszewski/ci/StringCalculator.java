package pl.kamil.klimaszewski.ci;


import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    private static final int THRESHOLD = 100;

    public int sum(String numbers) {

       List<Integer> parsedNumbers = parseNumbersFromString(numbers);
       checkIfNumbersNotBuggerThanThreshold(parsedNumbers);
       int sum = addPositiveNumbers(parsedNumbers);

       return sum;
   }

   public void dangerousCode(String input) {
        String nullString = null;
        if (nullString.equals("ERROR")) {
            while (input.length() < 10) {
                System.out.println("Without end");
            }
        }
        if (input.equals("END")) {
            System.exit(0);
        }
   }

   private int test() {
        return 1;
   }

    private void checkIfNumbersNotBuggerThanThreshold(List<Integer> numbers) {
        for (int number:numbers) {
            if (number > THRESHOLD) {
                throw new NumberFormatException();
            }
        }
    }

    private int addPositiveNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int number:numbers) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }

    private List<Integer> parseNumbersFromString(String numbers) {
        List<Integer> parsedNumbers = new ArrayList<Integer>();
        String[] splitNumbers = numbers.split(",");
        for(String number:splitNumbers) {
            if(!number.isEmpty()) {
                parsedNumbers.add(Integer.parseInt(number));
            }
        }
        return parsedNumbers;
    }
}


public class StringCalculator {

    public int add(String str) {
        String[] numbers = str.split(",|\n");

        if (str.isEmpty()) {
            return 0;
        } else if (numbers.length > 1) {
            return calculateSum(numbers);
        }

        return parseInt(str);
    }

    private int calculateSum(String[] numbers) {
        int sum = 0;
        for (String currentNumber:numbers) {
            sum += parseInt(currentNumber);
        }
        return sum;
    }

    private int parseInt(String str) {
        int number = Integer.parseInt(str);
        if (number < 0) {
            throw  new IllegalArgumentException("negatives not allowed !");
        }

        return number;
    }
}

public class StringCalculator {

    public int add(String str) {

        if (str.isEmpty()) {
            return 0;
        }

        int result = Integer.parseInt(str);
        return result > 0 ? result : null;
    }
}
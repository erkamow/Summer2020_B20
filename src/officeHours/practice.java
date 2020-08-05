package officeHours;

public class practice {
    public static int frequency(String str, String letter) {
        // str = AAABBBCC  -- > 'A' A A B B B C C
        // letter = A
        int count = 0;
        for (String each : str.split("")) { // finds the frequency of char from string str
            if (each == letter) {
                count++;
            }
        }
        return count;

    }
}

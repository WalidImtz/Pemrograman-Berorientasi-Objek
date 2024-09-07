import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        StringBuilder tokens = new StringBuilder();

        while (matcher.find()) {
            count++;
            tokens.append(matcher.group()).append("\n");
        }

        System.out.println(count);
        System.out.print(tokens.toString());

        scanner.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InputLines {

    public static void main(String[] args) throws IOException {
        String result = null;
        boolean check = false;
        int n = -1, m = -1;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                System.out.println("Введите количество строк для первого списка (число должно быть целым положительным)");
                n = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException ex) {
                System.out.println("Вы ввели неверный формат числа!");
            }
        } while (n < 0);
        String[] nLines = new String[n];
        System.out.println("Введите " + n + " строк(и)");
        for (int i = 0; i < n; i++) {
            nLines[i] = bufferedReader.readLine();
        }
        System.out.println("Введите количество строк для второго списка (число должно быть целым положительным)");
        do {
            try {
                m = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException ex) {
                System.out.println("Вы ввели неверный формат числа!");
            }
        } while (m < 0);
        String[] mLines = new String[m];
        System.out.println("Введите " + m + " строк(и)");
        for (int i = 0; i < m; i++) {
            mLines[i] = bufferedReader.readLine();
        }
        for (String strNLines : nLines) {
            String[] splitNLines = strNLines.split("\\s");
            for (String strMLines : mLines) {
                String[] splitMLines = strMLines.split("\\s");
                for (String splitedNLines : splitNLines) {
                    if(Arrays.asList(splitMLines).contains(splitedNLines)) {
                        check = true;
                        result = strNLines + ":" + strMLines;
                        break;
                    }
                }
            } if (check) {
                System.out.println(result);
                check = false;
            } else System.out.println(strNLines + ":?");
        }
    }
}

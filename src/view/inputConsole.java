package view;

import java.util.Scanner;

public class inputConsole {
    static Scanner scanner = new Scanner(System.in);

    public static String dataRequest() {
        System.out.print("Введите выражение: ");
        String line = scanner.nextLine();

        return line;
    }
}

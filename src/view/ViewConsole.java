package view;

import java.util.Scanner;

public class ViewConsole {
    Scanner scanner = new Scanner(System.in);

    public String  dataRequest(){
        System.out.print("Введите выражение: ");
        String line = scanner.nextLine();

        return line;
    }
}

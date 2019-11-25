package pl.jasiek.app.view.console;

import pl.jasiek.app.view.View;

import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int readInt(String label) {
        System.out.println(label);
        return scanner.nextInt();
    }
}

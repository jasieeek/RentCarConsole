package pl.jasiek.app.view.console;

import pl.jasiek.app.config.Config;
import pl.jasiek.app.controller.Command;
import pl.jasiek.app.view.View;

import java.util.List;

public class Menu {
    private View view;

    public Menu(View view) {
        this.view = view;
    }

    public void printMenu(List<Command> commands) {
        for (int i = 0; i < commands.size(); i++) {
            System.out.println("[" + i + "] " + commands.get(i).getName());
        }
    }

    public Command getChoice(List<Command> commands) {
        return commands.get(view.readInt("Your choice:"));
    }
}

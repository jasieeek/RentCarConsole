package pl.jasiek.app;

import pl.jasiek.app.config.Config;
import pl.jasiek.app.controller.Command;
import pl.jasiek.app.view.console.Menu;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Config config = new Config();
        List<Command> commands = config.initializeCommands();
        Menu menu = config.initializeMenu();
        config.initializeCarsRepo();


        while (true) {
            menu.printMenu(commands);
            Command command = menu.getChoice(commands);
            command.execute();
        }
    }
}

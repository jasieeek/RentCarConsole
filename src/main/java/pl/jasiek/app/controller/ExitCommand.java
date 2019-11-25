package pl.jasiek.app.controller;

import pl.jasiek.app.reader.CsvReader;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.exit(0);
    }

    @Override
    public String getName() {
        return "Exit";
    }
}

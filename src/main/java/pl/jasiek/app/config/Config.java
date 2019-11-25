package pl.jasiek.app.config;

import pl.jasiek.app.controller.Command;
import pl.jasiek.app.controller.ExitCommand;
import pl.jasiek.app.controller.ShowCarsCommand;
import pl.jasiek.app.reader.CsvReader;
import pl.jasiek.app.repo.CarsRepo;
import pl.jasiek.app.repo.csv.CsvCarRepo;
import pl.jasiek.app.view.View;
import pl.jasiek.app.view.console.ConsoleView;
import pl.jasiek.app.view.console.Menu;

import java.util.ArrayList;
import java.util.List;

public class Config {
    public View view = new ConsoleView();
    public CarsRepo carsRepo = new CsvCarRepo();


    public List<Command> initializeCommands() {
        List<Command> commands = new ArrayList<>();
        commands.add(new ExitCommand());
        commands.add(new ShowCarsCommand(carsRepo, view));

        return commands;
    }

    public Menu initializeMenu() {
        return new Menu(view);
    }

    public void initializeCarsRepo() {
        CsvReader csvReader = new CsvReader();
        carsRepo.init(csvReader.importCars());
    }
}

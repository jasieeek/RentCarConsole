package pl.jasiek.app.controller;

import pl.jasiek.app.model.Car;
import pl.jasiek.app.repo.CarsRepo;
import pl.jasiek.app.view.View;

public class ShowCarsCommand implements Command {
    private CarsRepo carsRepo;
    private View view;

    public ShowCarsCommand(CarsRepo carsRepo, View view) {
        this.carsRepo = carsRepo;
        this.view = view;
    }

    @Override
    public void execute() {
        for (Car c : carsRepo.findAll()) {
            System.out.println(c.getName() + " " + c.getPrize());
        }
    }

    @Override
    public String getName() {
        return "Show cars";
    }
}

package pl.jasiek.app.repo.csv;

import pl.jasiek.app.model.Car;
import pl.jasiek.app.repo.CarsRepo;

import java.util.LinkedList;
import java.util.List;

public class CsvCarRepo implements CarsRepo {
    private List<Car> carList;
    private Car emptyCar = new Car();


    @Override
    public void init(List<Car> cars) {
        this.carList = cars;
    }

    @Override
    public Car findCarByName(String name) {
        return carList.stream().filter(v -> v.getName().equals(name)).findFirst().orElse(emptyCar);
    }

    @Override
    public List<Car> findAll() {
        return carList;
    }
}

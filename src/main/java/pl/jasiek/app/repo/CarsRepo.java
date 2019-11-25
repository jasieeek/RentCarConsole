package pl.jasiek.app.repo;

import pl.jasiek.app.model.Car;

import java.util.List;

public interface CarsRepo {
    void init(List<Car> cars);
    Car findCarByName(String name);
    List<Car> findAll();
}

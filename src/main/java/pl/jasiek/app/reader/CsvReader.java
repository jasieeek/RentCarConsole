package pl.jasiek.app.reader;

import com.opencsv.CSVReader;
import org.w3c.dom.CDATASection;
import pl.jasiek.app.model.Car;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvReader {
    private final String PATH = "src/main/resources/carsRepo.csv";

    public List<Car> importCars() {
        List<Car> cars = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(PATH))){
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
//                System.out.println(values[0] + values[1] + values[2] + values[3] + values[4]);
                Car tmpCar = new Car();
                tmpCar.setId(Integer.parseInt(values[0]));
                tmpCar.setName(values[1]);
                tmpCar.setYear(Integer.parseInt(values[2]));
                tmpCar.setAmountSitPlace(Integer.parseInt(values[3]));
                tmpCar.setPrize(Double.parseDouble(values[4]));
                cars.add(tmpCar);
            }
        } catch (IOException e) {
            System.out.println("Nie znaleziono pliku!");
        }
        return cars;
    }

}

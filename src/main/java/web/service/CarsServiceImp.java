package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarsServiceImp implements CarsService {

    private final List<Car> cars = new ArrayList<>();

    public CarsServiceImp() {

        cars.add(new Car("mazda", 3, "black"));
        cars.add(new Car("bmv", 5, "red"));
        cars.add(new Car("vaz", 9, "white"));
        cars.add(new Car("gaz", 21, "yellow"));
        cars.add(new Car("vaz", 7, "blue"));
    }

    public List<Car> listCarsByCount(int count) {
        if (count < 1 || count > 5) {
            return cars;
        } else
            return cars.stream().limit(count).toList();
    };
}

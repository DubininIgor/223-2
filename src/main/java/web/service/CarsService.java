package web.service;

import web.models.Car;

import java.util.List;

public interface CarsService {
    public List<Car> listCarsByCount(int count);

}

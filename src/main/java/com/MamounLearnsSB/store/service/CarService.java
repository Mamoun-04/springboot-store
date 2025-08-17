package com.MamounLearnsSB.store.service;

import com.MamounLearnsSB.store.model.Car;
import com.MamounLearnsSB.store.repository.CarRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car addCar(Car car) { return carRepository.save(car); }
    public List<Car> getAllCars() { return carRepository.findAll(); }
    public void deleteCar(Long id) { carRepository.deleteById(id); }
}

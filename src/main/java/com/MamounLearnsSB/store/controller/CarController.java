package com.MamounLearnsSB.store.controller;

import com.MamounLearnsSB.store.model.Car;
import com.MamounLearnsSB.store.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) { return carService.addCar(car); }

    @GetMapping
    public List<Car> getAllCars() { return carService.getAllCars(); }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) { carService.deleteCar(id); }
}

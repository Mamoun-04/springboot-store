package com.MamounLearnsSB.store.service;

import com.MamounLearnsSB.store.model.Car;
import com.MamounLearnsSB.store.model.Sale;
import com.MamounLearnsSB.store.model.Salesperson;
import com.MamounLearnsSB.store.repository.CarRepository;
import com.MamounLearnsSB.store.repository.SaleRepository;
import com.MamounLearnsSB.store.repository.SalespersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    private final SaleRepository saleRepository;
    private final CarRepository carRepository;
    private final SalespersonRepository salespersonRepository;

    public SaleService(SaleRepository saleRepository, CarRepository carRepository, SalespersonRepository salespersonRepository) {
        this.saleRepository = saleRepository;
        this.carRepository = carRepository;
        this.salespersonRepository = salespersonRepository;
    }

    public Sale recordSale(Long carId, Long salespersonId, double salePrice) {
        Car car = carRepository.findById(carId).orElseThrow();
        Salesperson salesperson = salespersonRepository.findById(salespersonId).orElseThrow();

        car.setSold(true);
        carRepository.save(car);

        salesperson.setNumSales(salesperson.getNumSales() + 1);
        salespersonRepository.save(salesperson);

        Sale sale = new Sale();
        sale.setCar(car);
        sale.setSalesperson(salesperson);
        sale.setSalePrice(salePrice);

        return saleRepository.save(sale);
    }

    public List<Sale> getAllSales() { return saleRepository.findAll(); }
}

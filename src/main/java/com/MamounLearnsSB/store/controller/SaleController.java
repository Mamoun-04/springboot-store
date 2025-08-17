package com.MamounLearnsSB.store.controller;

import com.MamounLearnsSB.store.model.Sale;
import com.MamounLearnsSB.store.service.SaleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {
    private final SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @PostMapping
    public Sale recordSale(
            @RequestParam Long carId,
            @RequestParam Long salespersonId,
            @RequestParam double salePrice) {
        return saleService.recordSale(carId, salespersonId, salePrice);
    }

    @GetMapping
    public List<Sale> getAllSales() { return saleService.getAllSales(); }
}
